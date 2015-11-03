package com.spring.example.CommandLine;

import java.util.List;
import javax.sql.DataSource;
import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcTemplate;

public class PersonJdbcDao implements PersonDao{
	private JdbcTemplate jdbcTemp;
	static Logger log = Logger.getLogger(PersonJdbcDao.class.getName());
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemp = new JdbcTemplate(dataSource);
	}

	public void create(String sqlRequest) {
		log.info("create operation: " + sqlRequest);
		this.jdbcTemp.update(sqlRequest);
	}

	public String read(String sqlRequest) {
		String result = "";
		log.info("Read operation: " + sqlRequest);
		List<Person> persons = this.jdbcTemp.query(sqlRequest, new PersonMapper());
		for(Person person: persons) {
			result = person.toString() + "\r\n";
		}
		log.info(result);
		return result.toString();
	}

	public void update(String sqlRequest) {
		this.jdbcTemp.update(sqlRequest);
		log.info("Update operation: " + sqlRequest);
	}

	public void delete(String sqlRequest) {
		this.jdbcTemp.update(sqlRequest);
		log.info("Delete operation: " + sqlRequest);
	}	
}
