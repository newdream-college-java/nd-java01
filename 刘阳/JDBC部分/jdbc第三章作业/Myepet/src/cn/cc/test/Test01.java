package cn.cc.test;

import java.sql.ResultSet;
import java.util.Scanner;

import cn.cc.dao.MasterDao;
import cn.cc.dao.impl.MasterDaoSqlServerImpl;
import cn.cc.entity.Master;

public class Test01 {

	public static void main(String[] args) {
//        Master stu = new Master();
//        stu.setName("������");
//        stu.setPassword("1234");
//        Master stu2 = new Master();
//        stu2.setName("�����");
//        stu2.setId(4);
        //����ĸ����ʹ���ĸ�dao
       
        
        
        MasterDao sd = new MasterDaoSqlServerImpl();
//        int result = sd.save(stu2);
//        if(result!=0) {
//            System.out.println("������ݳɹ�������");
//        }
        
//        int result  = sd.update(stu2);
//        if(result!=0) {
//            System.out.println("�������ݳɹ�������");
//        }
        
        	
        
        System.out.println("-------------��ӭ���ٳ�����԰--------------");
        Scanner input=new Scanner(System.in);
        System.out.print("�������¼����");
        String userName=input.next();
        System.out.println();
        System.out.print("���������룺");
        String userPsw=input.next();
        ResultSet result  =sd.cha(userName, userPsw);
        
    }

}
