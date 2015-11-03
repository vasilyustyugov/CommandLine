
package com.spring.example.CommandLine;

public class Person {
	private String firsName;
	private String lastName;
	private Integer age;
	private String email;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, Integer age, String email) {
		this.setFirsName(firstName);
		this.setLastName(lastName);
		this.setAge(age);
		this.setEmail(email);
	}

	public String getFirsName() {
		return firsName;
	}

	public void setFirsName(String firsName) {
		this.firsName = firsName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		StringBuilder buf = new StringBuilder();
		buf.append(this.firsName);
		buf.append("	");
		buf.append(this.lastName);
		buf.append("	");
		buf.append(this.age);
		buf.append("	");
		buf.append(this.email);
		return buf.toString();
	}
}
