package cn.cc.test;

import java.sql.ResultSet;
import java.util.Scanner;

import cn.cc.dao.MasterDao;
import cn.cc.dao.impl.MasterDaoSqlServerImpl;
import cn.cc.entity.Master;
import cn.cc.manager.PetTypeManager;

public class Test01 {

	public static void main(String[] args) {
//        Master stu = new Master();
//        stu.setName("王二辉");
//        stu.setPassword("1234");
//        Master stu2 = new Master();
//        stu2.setName("杨二辉");
//        stu2.setId(4);
        //添加哪个表就使用哪个dao
       
        
        
        MasterDao sd = new MasterDaoSqlServerImpl();
//        int result = sd.save(stu2);
//        if(result!=0) {
//            System.out.println("添加数据成功！！！");
//        }
        
//        int result  = sd.update(stu2);
//        if(result!=0) {
//            System.out.println("更新数据成功！！！");
//        }
        
        	
        
//        System.out.println("-------------欢迎光临宠物乐园--------------");
        Scanner input=new Scanner(System.in);
//        System.out.print("请输入登录名：");
//        String userName=input.next();
//        System.out.println();
//        System.out.print("请输入密码：");
//        String userPsw=input.next();
//        ResultSet result  =sd.cha(userName, userPsw);
        
        System.out.println("请输入宠物类型：狗狗|企鹅|猫咪");
        String name=input.next();
        PetTypeManager pmanager=new PetTypeManager();
        int id =pmanager.findId(name);
        if(id!=0) {
        	System.out.println(name+"的类型编号是"+id);
        	
        }else {
        	System.out.println("类型名称输入错误！");
        }
        
        
        
        
    }

}
