package cn.cc.manager;

import java.util.Scanner;

import cn.cc.dao.MasterDao;
import cn.cc.dao.impl.MasterDaoImpl;
import cn.cc.entity.Master;

/**
* @author mob
* @version 2019��5��13�� ����7:28:59
* @description
*/
public class MasterManager {
	/**
	 * ���˵�¼
	 * @param name
	 * @param password
	 * @return
	 */
	public static boolean login(String name,String password) {
		Master master=new Master();
		master.setName(name);
		master.setPassword(password);
		MasterDao masterDao=new MasterDaoImpl();
		Master m=masterDao.findMaster(master);
		boolean isLogin=(m==null?false:true);
		return isLogin;
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input=new Scanner(System.in);
		System.out.println("---- ��ӭ��¼  -----");
		System.out.print("�������¼��:");
		String name=input.next();
		System.out.print("����������:");
		String password=input.next();
		if(login(name,password)) {
			System.out.println("��¼�ɹ���");
		}else {
			System.out.println("��¼ʧ�ܣ�");
		}
	}
}
