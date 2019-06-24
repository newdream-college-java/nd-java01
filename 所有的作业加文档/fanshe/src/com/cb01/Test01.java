package com.cb01;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Test01 {
	public static void main(String[] args) {
		// 1.�ĵ�A��.class�ļ�
		Class c1 = A.class;
		// 2.��ȡ��������getDeclaredFields()�ĵ���ȡ���еķ���
		Field[] fd = c1.getDeclaredFields();
		// 3.�����ƽ�
		Field.setAccessible(fd, true);
		// 4.forѭ����ӡ
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
		return "Ĭ�����η�";
	}

	/* �Զ��彫���صķ������η�int����ת��ΪString���� */
	public static String soEasy(int modifier) {
		return Modifier.toString(modifier);
	}

	/* �Զ���ʵ�ֽ�Class���͵Ĳ�������ת����String���� */
	public static String parse(Class[] cs) {
		StringBuffer sb = new StringBuffer();
		sb.append("(");
		for (int i = 0; i < cs.length; i++) {
			// ��ȡclass�����Ӧ�����֣���:String.class-->String
			sb.append(cs[i].getSimpleName());
			// ��������м��һ������
			// ���������һ���������治�Ӷ���
			if (i < cs.length - 1) {
				sb.append(",");
			}
		}
		sb.append(")");
		return sb.toString();

	}
}
