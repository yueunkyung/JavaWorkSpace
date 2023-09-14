package com.shinhan.day09;

public interface DataAccessObject {
	//CRUD(Create Read Update Delete)
	public abstract void select();
	public abstract void insert();
	public abstract void update();
	public abstract void delete();
}
