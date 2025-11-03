package dao;

import java.sql.ResultSet;

public abstract class AbstractDAO implements BaseDAO{
	
	public ResultSet getAll() {
		ResultSet rs = null;
		return rs;
	}
	
	public ResultSet getById() {
		ResultSet rs = null;
		return rs;
	}

	@Override
	public int delete() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int add() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}