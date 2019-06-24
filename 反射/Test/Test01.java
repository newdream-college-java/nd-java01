package com.cc.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import com.cc.Student.Student;

public class Test01 {
/**
 * 
 * 
 * 随便填填的
 * 反射：动态编译， .java文件编译生产.class文件，Class类的对象描述.class文件的信息
 *    一个.class文件--------一个Class类对象
 *    .class文件包含的信息：全限定类名，属性，方法，构造方法....
 *    问题1：得到Class对象的四种方式？
 *         1) Class.forName()      2)类名.class    3)对象.getClass()  4)URL类加载器   陈飚  刘勇国  王鑫  20遍
 *    问题2：类加载器的作用？类加载器的分类？类加载器的三大机制？
 *      1）将class文件加载到内存中
 *      2）系统加载器，扩展加载器，根加载器
 *      3）委托机制，一致性机制，透明机制
 *    问题3：监听器的生命周期？监听器，过滤器，servlet的生命周期总结？
 *      1）初始化？服务器启动
 *             销毁？   项目移除，服务器关闭，重新部署
 *             
 *      2）服务器启动时候：监听器(配置顺序)---->过滤器
 *             第1次接受请求的时候：servlet的构造---->servlet初始化--->过滤器-->servlet服务
 *             服务器关闭：servlet销毁--->过滤器销毁--->监听器
 * @param args
 * @throws IllegalAccessException 
 * @throws InstantiationException 
 */
	public static void main(String[] args) throws Exception {
	//首先获取反射
	Class st=Student.class;//这就是类的位置
	Object stu = st.newInstance();//这是对象
	//然后要获取公有属性
	Field field = st.getField("birthday");
	//获取公有属性birthday之后 设置他的值
	field.set(stu, "1998-07-30");
	System.out.println(field.get(stu));
	
	System.out.println("以上是获取公有属性的步骤");
	
	//2.获取非公有属性 是用.class文件的对象去调用getDeclaredField
	Field agefield = st.getDeclaredField("age");
	Field namefield = st.getDeclaredField("name");
	//因为调用私有的所以要暴力破解    这里必须要先破解才可以设值
	agefield.setAccessible(true);
	namefield.setAccessible(true);
	//设置值
	agefield.set(stu, 22);
	namefield.set(stu, "陈飙");
	
	
	System.out.println(agefield.getInt(stu));
	System.out.println(namefield.get(stu));
	
	System.out.println("以上是获取私有属性并设置值 然后获取的值");
	
	
	//3.获取所有公有属性
	Field[] fields = st.getFields();
	//1---Modifier类 常量 
	for(int i=0;i<fields.length;i++){
		System.out.println(fields[i].getModifiers()+"  -----  "+fields[i].getType()+" "+fields[i].getName());
		
	}
	System.out.println("以上是获取所有公有属性");
	
	
	
	//4.获取所有属性
	Field[] fiels = st.getDeclaredFields();
	//需要暴力破解 因为有些属性是私有的
	Field.setAccessible(fiels,true);
		for(int i=0;i<fiels.length;i++){
			System.out.println(fiels[i].getName()+"---"+fiels[i].getType()+"----"+modifyToString(fiels[i].getModifiers()));
		}
	}
	//这个方法是写在main方法外面的 要用static修饰
	 public static String modifyToString(int modify) {
		 if(modify==Modifier.PUBLIC){
		  return "PUBLIC";
		 }else if(modify==Modifier.PRIVATE){
			 return "PRIVATE";
		 }else if(modify==Modifier.STATIC){
			 return "STATIC";
		 }
		return "默认修饰符";
	 }
}










