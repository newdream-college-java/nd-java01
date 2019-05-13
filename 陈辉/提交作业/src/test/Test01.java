package test;

import daoImpl.MasterinfoDaoImpl;
import entity.masterInfo;
public class Test01 {
    public static void main(String[] args) {
    	masterInfo stu = new masterInfo();
        stu.setName("王二辉");
        
        masterInfo stu2 = new masterInfo();
        stu2.setName("杨二辉");
        stu2.setId(22);
        //添加哪个表就使用哪个dao
        MasterinfoDaoImpl sd = new  MasterinfoDaoImpl();
        int result = sd.save(stu2);
        if(result!=0) {
            System.out.println("添加数据成功！！！");
        }
        
        result  = sd.update(stu2);
        if(result!=0) {
            System.out.println("更新数据成功！！！");
        }
    }
}
