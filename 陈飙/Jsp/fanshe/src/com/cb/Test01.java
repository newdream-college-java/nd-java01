package com.cb;

import java.lang.reflect.Field;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Test01 extends BaseDao {
	public static void main(String[] args) {
		//这里给的参数是实体表的.class
		List<Student>list=new Test01().GeneralList(Student.class);
		
		//System.out.println(list);
		List<Student>list02=new Test01().GeneralList(Master.class);
		System.out.println(list02);
	}

	private <T> List<T> GeneralList(Class clazz) {
		List<T> list = new ArrayList<T>();
		// 构造sql语句
		 System.out.println("clazz.getName()==="+clazz.getName());//因为类型是class,所以直接参数点方法
		 System.out.println("clazz.getSimpleName()==="+clazz.getSimpleName());
		// System.out.println("clazz.newInstance()==="+clazz.newInstance());
		 System.out.println("clazz.getDeclaredFields()==="+clazz.getDeclaredFields());
		 System.out.println("clazz.getDeclaredFields()==="+clazz.getDeclaredFields());
		try {
			// 得到表名（根据反射得到.class 得到这个表名）
			String sql = "select * from " + clazz.getSimpleName();
			getConn();
			pst = conn.prepareStatement(sql);
			rs = pst.executeQuery();
			while (rs.next()) {
				T t = (T) clazz.newInstance();// new出实体类Stutdent s = new
												// Student();
				// System.out.println("clazz.newInstance()==="+clazz.newInstance());
				// 的到表中所有字段的类型就是set.字段（rs.类型）;
				// 这里要导入对应的包
				
				Field[] fields = clazz.getDeclaredFields();// getDeclaredFields()获取声明字段
				Field.setAccessible(fields, true);
				for (Field field : fields) {
					// field.getType()会出现前面带有com.cc.不是想要的
					// field.getType().getSimpleName()就只会得到 类型字符值（int货string）
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
