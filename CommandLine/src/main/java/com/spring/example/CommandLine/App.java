package com.spring.example.CommandLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.Locale;
import java.util.StringTokenizer;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App 
{ 
	static final Logger log = Logger.getLogger(App.class);
    public static void main( String[] args ) throws IOException
    {
    	Locale.setDefault(Locale.ENGLISH);
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	PersonJdbcDao pjd = (PersonJdbcDao) context.getBean("personJdbcDao");
    	String keyWord = "";
    	
    	
    	
    	while (!keyWord.equals("exit")) {
    		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
    		String inputString = buf.readLine();
    		keyWord = detectFirstWord(inputString); 
    		log.info(keyWord);
    		switch(keyWord) {
    			case "exit":
    				break;
    			case "create":
    				pjd.create(inputString);
    				break;
    			case "select":
    				String resultString = pjd.read(inputString);
    				System.out.println(resultString);
    				break;
    			case "insert":
    				pjd.update(inputString);
    				break;
    			case "update":
    				pjd.update(inputString);
    				break;
    			case "delete":
    				pjd.delete(inputString);
    				break;
    			case "drop":
    				pjd.delete(inputString);
    				break;
    			default:
    				System.out.println("Request was incorrect. Write request in lower register and right.");
    		}
    	}
    	
    	
    }
    
    protected static String detectFirstWord(String str) {
    	log.info(str);
    	if(str == null) {
    		return "";
    	}
    	StringTokenizer st = new StringTokenizer(str);
    	return st.nextElement().toString();    	    	
    }
    
}
