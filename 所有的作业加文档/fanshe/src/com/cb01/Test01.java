package com.cb01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test01 {
	public static void main(String[] args) {
		// 1.的到A的.class文件
		Class c1 = A.class;
		// 2.获取所有属性getDeclaredFields()的到获取所有的方法
		Field[] fd = c1.getDeclaredFields();
		// 3.暴力破解
		Field.setAccessible(fd, true);
		// 4.for循环打印
		for (int i = 0; i < fd.length; i++) {
			System.out.println(modifyToString(fd[i].getModifiers()) + "-----"
					+ fd[i].getType() + "-----" + fd[i].getName());
		}

		Method[] ms1 = c1.getMethods();
		Method.setAccessible(ms1, true);
		for (Method mm : ms1) {
			System.out.println(soEasy(mm.getModifiers()) + "\t"
					+ mm.getReturnType().getSimpleName() + "\t"
					+ parse(mm.getParameterTypes()));
		}
	}

	private static String modifyToString(int modify) {
		if (modify == Modifier.PUBLIC) {
			return "public";
		} else if (modify == Modifier.PRIVATE) {
			return "private";
		} else if (modify == Modifier.PROTECTED) {
			return "protected";
		} else if (modify == (Modifier.PRIVATE | Modifier.STATIC)) {
			return "private static";
		}
		return "默认修饰符";
	}

	/* 自定义将返回的访问修饰符int类型转换为String类型 */
	public static String soEasy(int modifier) {
		return Modifier.toString(modifier);
	}

	/* 自定义实现将Class类型的参数数组转换成String类型 */
	public static String parse(Class[] cs) {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		for (int i = 0; i < cs.length; i++) {
			// 获取class对象对应的名字，如:String.class-->String
			sb.append(cs[i].getSimpleName());
			// 多个参数中间加一个逗号
			// 条件是最后一个参数后面不加逗号
			if (i < cs.length - 1) {
				sb.append(",");
			}
		}
		sb.append(")");
		return sb.toString();

	}
}
