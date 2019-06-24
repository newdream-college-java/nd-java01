package com.cc.Test;

public class Test3xitongjiazaiqi {

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		//获取系统类记载器（本质就是一个类）
		System.out.println("获取系统类记载器（本质就是一个类）");
		ClassLoader cld = ClassLoader.getSystemClassLoader();
		//然后同伙该系统类加载器获取loadClass  类的路径放进去 
		//sun.misc.Launcher$AppClassLoader@1372a1a  cld1是这个玩意
		Class<?> cld1 = cld.loadClass("com.cc.Student.Student");
		//我输出cld1的时候 如果是getname方法就会少一个class  如果直接输出cld1就多一个class
		System.out.println(cld+"----"+cld1.getName());
		
		
		
		System.out.println("获取扩展加载器（本职业是一个类）");
		//获取扩展加载器（本职业是一个类）
		ClassLoader parent = cld.getParent();
		System.out.println(parent);
		
		
		//获取根类加载器（引号）
		//null---根加载器底层是用c,c++开发出来的，没有开源
		System.out.println("//获取根类加载器（引号）");
		ClassLoader parent2 = parent.getParent();
		System.out.println(parent2);
	}

}
