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
		// �õ�����ֵ
		System.out.println(field.get(stu));

		// 2.�Ķ�ע��
		// /2.��ȡ�ǹ�������getDeclaredField();
		Field nameField = c1.getDeclaredField("name");
		Field ageFiled = c1.getDeclaredField("sex"); // �����ƽ�
		// �����ƽ�setAccessible����;
		nameField.setAccessible(true);
		ageFiled.setAccessible(true);
		nameField.set(stu, "������");
		ageFiled.set(stu, '��');// �ǵ�����
		System.out.println(nameField.get(stu) + "---" + ageFiled.get(stu));
		// 3.��ȡ���й�������getFields();
		Field[] fields = c1.getFields();
		for (int i = 0; i < fields.length; i++) {
			System.out.println(modifyToString(fields[i].getModifiers())
					+ "----" + fields[i].getType() + "-----"
					+ fields[i].getName());
		}
		System.out.println("-----------");
		// 4.��ȡ��������getDeclaredFields()
		Field[] declaredFields = c1.getDeclaredFields();
		// �����ƽ�
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
		return "Ĭ�����η�";
	}
}
