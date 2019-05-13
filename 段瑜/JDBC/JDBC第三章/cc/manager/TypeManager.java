package cn.cc.manager;



import java.util.Scanner;

import cn.cc.dao.typeDao;
import cn.cc.dao.imgl.TypeDaoSqlServerImpl;
import cn.cc.entity.Master;
import cn.cc.entity.Type;

public class TypeManager {
	public int select(Type type) {
		typeDao typeDao=new TypeDaoSqlServerImpl();
		return typeDao.select(type);	
	}
	public static void main(String[] args) {
		Type type=new Type();
		Scanner input=new Scanner(System.in);
		System.out.println("«Î ‰»Î≥ËŒÔ¿‡–Õ£∫π∑π∑|∆Û∂Ï|√®ﬂ‰");
		String name=input.next();
		type.setTypeName(name);
		TypeManager m=new TypeManager();
		int id=pmanager.Type(type);
		if(m!=0) {
			System.out.println("µ«¬º ß∞‹");
		}else {
			System.out.println("µ«¬º≥…π¶");
		}
	}
}
