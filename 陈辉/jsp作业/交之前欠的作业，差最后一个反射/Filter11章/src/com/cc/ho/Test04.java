package com.cc.ho;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException,
			InstantiationException, IllegalAccessException, SecurityException,
			NoSuchFieldException {
		// Class c1 = Class.forName("com.cc.ho.Student");
		Class c1 = Student.class;
		Student stu = (Student) c1.newInstance();
		// Field name = c1.getField("name");
		Field field = c1.getField("birthday");
		field.set(stu, "1900-1-1");
		// 得到属性值
		System.out.println(field.get(stu));

		// 2.文段注释
		// /2.获取非公有属性getDeclaredField();
		Field nameField = c1.getDeclaredField("name");
		Field ageFiled = c1.getDeclaredField("sex"); // 暴力破解
		// 暴力破解setAccessible（）;
		nameField.setAccessible(true);
		ageFiled.setAccessible(true);
		nameField.set(stu, "二狗子");
		ageFiled.set(stu, '男');// 是单引号
		System.out.println(nameField.get(stu) + "---" + ageFiled.get(stu));
		// 3.获取所有公有属性getFields();
		Field[] fields = c1.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(modifyToString(fields[i].getModifiers())
					+ "----" + fields[i].getType() + "-----"
					+ fields[i].getName());
		}
		System.out.println("-----------");
		// 4.获取所有属性getDeclaredFields()
		Field[] declaredFields = c1.getDeclaredFields();
		// 暴力破解
		Field.setAccessible(declaredFields, true);
		for (int i = 0; i < declaredFields.length; i++) {

			System.out.println(modifyToString(declaredFields[i].getModifiers())
					+ "----" + declaredFields[i].getType() + "-----"
					+ declaredFields[i].getName());
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
}
