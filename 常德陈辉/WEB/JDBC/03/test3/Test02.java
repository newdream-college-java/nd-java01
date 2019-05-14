package test2;

import java.util.Scanner;

import test2.dao.MasterManagerDao;
import test2.dao.impl.MasterManagerImpl;
import test2.enity.MasterManager;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		// TODO Auto-generated method stub
		MasterManagerDao mm=new MasterManagerImpl();
		MasterManager cc=new MasterManager();
		System.out.println("请输入宠物类型：");
		String name=input.next();
		cc.setName(name);
		int result=mm.findMasterManager(cc);
		if(result!=0){
			System.out.println(name+"的id编号为："+result);	
		}else{
			System.out.println("没有此类型");
		}
	}

}
