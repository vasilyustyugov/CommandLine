package com.spring.example.CommandLine;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class PersonMapper implements RowMapper<Person> {

	public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
		Person person = new Person();
		person.setFirsName(rs.getString("first_name"));
		person.setLastName(rs.getString("last_name"));
		person.setAge(rs.getInt("age"));
		person.setEmail(rs.getString("email"));
		return person;
	}
	
}
