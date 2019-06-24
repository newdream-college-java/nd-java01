package com.cc.po;

import com.cc.po.Student;

/**
 * 
    * @ClassName: Test01  
    * @Description: TODO  
    * @author 新梦想IT学院.陈超
    * @date 2019年6月20日  


        静态编译：java源文件---javac编译(静态编译)----.class文件---运行
        动态编译：就是反射。
        （Person.java  Student.java ----javac------- Person.class Student.class） 
         （Person.java  Stduent.java -----动态编译(你要用person Person.class)）----灵活
         a.txt-----File file  =new File("a.txt")
         Person.class----Class类对象
         
         Class类：java源文件编译生产生一个二进制.class文件，Class类对象就可以描述一个.class文件
         .class文件中包含了哪些东西？ 类信息，属性，方法.....
         Class类对象中包含了.class文件的所有信息。
    *    

 */
public class Test01 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
       // 1.获取类的字节码文件对象方式一：Class.forName();
     /*   Class<?>  stuClazz = Class.forName("com.cc.po.Student");
        //根据class字节码，实例化对象？
        Student Student = (Student) stuClazz.newInstance();
//        
//        
//        //2.获取类的字节码文件对象方式二：对象.getClass();
       Student s = new Student();
       Class  stuClazz2 = s.getClass();
       System.out.println(stuClazz2);
//       
//       //3.获取类的字节码文件对象方式三：类名.getClass();
       Class stuClass3 =  Student.getClass();
       System.out.println(stuClass3);
//       
*///       //4.获取类的字节码文件对象方式四：类名.class
//      Class stuClass4 =  Student.class;
//      
      /*System.out.println("============.class与class.forname区别======");
      //方式四与方式一的区别
      
    //  Class stuClass5 = Class.forName("com.cc.po.Student");//即时加载
      System.out.println("------------------------------------------");
      
      Class stuClass6 = Student.class;//延迟加载
      Student s1 = (Student) stuClass6.newInstance();*/
      
      //方式2于3的区别
      System.out.println("============对象.getClass()与类名.getClass()区别======");
      Student s = new Student();
      Class  stuClazz2 = s.getClass();
      System.out.println("------------------------------------------");
      /*Class stuClass3 =  Student.getClass();
      System.out.println(stuClass3);*/
       
        
        
        
    }
}











