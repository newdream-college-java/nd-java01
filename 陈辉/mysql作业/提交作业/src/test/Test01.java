package test;

import daoImpl.MasterinfoDaoImpl;
import entity.masterInfo;
public class Test01 {
    public static void main(String[] args) {
    	masterInfo stu = new masterInfo();
        stu.setName("������");
        
        masterInfo stu2 = new masterInfo();
        stu2.setName("�����");
        stu2.setId(22);
        //����ĸ����ʹ���ĸ�dao
        MasterinfoDaoImpl sd = new  MasterinfoDaoImpl();
        int result = sd.save(stu2);
        if(result!=0) {
            System.out.println("������ݳɹ�������");
        }
        
        result  = sd.update(stu2);
        if(result!=0) {
            System.out.println("�������ݳɹ�������");
        }
    }
}
