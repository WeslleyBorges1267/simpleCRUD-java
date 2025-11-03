package dao;

import java.sql.ResultSet;

public interface BaseDAO {
	public ResultSet getAll();
	public ResultSet getById();
	public int update();
	public int add();
	public int delete();
}