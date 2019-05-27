package Dao;

import java.sql.Date;

public interface BaseDao {
	public void getConn();
	public void flow();
	public int raize(String name,int age , String date);
	public int delete(int n);
	public int modify(int id, String name, int age, String date);
	public void see(int n);
}
