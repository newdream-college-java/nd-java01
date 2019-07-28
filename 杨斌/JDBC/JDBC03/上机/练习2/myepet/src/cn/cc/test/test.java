package cn.cc.test;
import cn.cc.dao.impl.MasterDaoSqlServerImpl;
import cn.cc.entity.Master;

public class test {
	public static void main(String[] args) {
		Master ms=new Master();
		ms.setName("¡ı¥∫¿Ÿ");
		ms.setPassword("1111");
		MasterDaoSqlServerImpl md=new MasterDaoSqlServerImpl();
		System.out.println(md.findMaster(ms));
		
	}
}
