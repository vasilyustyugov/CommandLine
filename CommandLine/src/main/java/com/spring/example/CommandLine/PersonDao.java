package com.spring.example.CommandLine;

import javax.sql.DataSource;

public interface PersonDao {
	public void setDataSource(DataSource ds);
	public void create(String sqlRequest);
	public String read(String sqlRequest);
	public void update(String sqlRequest);
	public void delete(String sqlRequest);
}