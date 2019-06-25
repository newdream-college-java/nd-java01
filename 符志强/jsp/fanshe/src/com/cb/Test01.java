package com.cb;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test01 extends BaseDao {
	public static void main(String[] args) {
		//������Ĳ�����ʵ����.class
		List<Student>list=new Test01().GeneralList(Student.class);
		
		//System.out.println(list);
		List<Student>list02=new Test01().GeneralList(Master.class);
		System.out.println(list02);
	}

	private <T> List<T> GeneralList(Class clazz) {
		List<T> list = new ArrayList<T>();
		// ����sql���
		 System.out.println("clazz.getName()==="+clazz.getName());//��Ϊ������class,����ֱ�Ӳ����㷽��
		 System.out.println("clazz.getSimpleName()==="+clazz.getSimpleName());
		// System.out.println("clazz.newInstance()==="+clazz.newInstance());
		 System.out.println("clazz.getDeclaredFields()==="+clazz.getDeclaredFields());
		 System.out.println("clazz.getDeclaredFields()==="+clazz.getDeclaredFields());
		try {
			// �õ����������ݷ���õ�.class �õ����������
			String sql = "select * from " + clazz.getSimpleName();
			getConn();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				T t = (T) clazz.newInstance();// new��ʵ����Stutdent s = new
												// Student();
				// System.out.println("clazz.newInstance()==="+clazz.newInstance());
				// �ĵ����������ֶε����;���set.�ֶΣ�rs.���ͣ�;
				// ����Ҫ�����Ӧ�İ�
				
				Field[] fields = clazz.getDeclaredFields();// getDeclaredFields()��ȡ�����ֶ�
				Field.setAccessible(fields, true);
				for (Field field : fields) {
					// field.getType()�����ǰ�����com.cc.������Ҫ��
					// field.getType().getSimpleName()��ֻ��õ� �����ַ�ֵ��int��string��
					String type = field.getType().getSimpleName();
					System.out.println("field.getType().getSimpleName()==="+field.getType().getSimpleName());
					String fieldName = field.getName();
					System.out.println("field.getName()"+field.getName());
					if (type.equals("int")) {
						field.set(t, rs.getInt(fieldName));
					} else if (type.equals("String")) {
						field.set(t, rs.getString(fieldName));
					}
				}
				list.add(t);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pst, conn);
		}
		return list;
	}
}
