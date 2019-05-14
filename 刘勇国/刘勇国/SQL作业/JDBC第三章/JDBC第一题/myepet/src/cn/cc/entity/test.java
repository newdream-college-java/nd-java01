package cn.cc.entity;

import java.sql.ResultSet;

import cn.cc.dao.impl.MasterDaoSqlServerImpl;

public class test {
	public static void main(String[] args) {
		Master ms=new Master();
		ms.setName("ssss");
		ms.setPassword("1111");
		MasterDaoSqlServerImpl md=new MasterDaoSqlServerImpl();
		System.out.println(md.findMaster(ms));
		
	}
}
