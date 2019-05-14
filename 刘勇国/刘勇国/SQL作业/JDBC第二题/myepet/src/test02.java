
import java.util.Scanner;

import cn.cc.dao.impl.MasterDaoSqlServerImpl;
import cn.cc.entity.Master;
public class test02 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		Master ms=new Master();
		MasterDaoSqlServerImpl md=new MasterDaoSqlServerImpl();
		System.out.println("---------»¶Ó­¹âÁÙ---------");
		System.out.println("ÇëÊäÈëµÇÂ¼Ãû£º");
		String name=input.next();
		ms.setName(name);
		System.out.println("ÇëÊäÈëÃÜÂë");
		String pass=input.next();
		ms.setPassword(pass);
		md.findMaster(ms);
	}
}
