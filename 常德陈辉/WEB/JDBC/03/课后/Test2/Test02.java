package 课后.Test2;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import 课后.Test2.dao.StudentDao;
import 课后.Test2.dao.impl.StudentDaoImpl;
import 课后.Test2.enity.Student;

public class Test02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//添加一行数据
//		StudentDao st=new StudentDaoImpl();
//		Student stu=new Student();
//		stu.setStuint("111");
//		stu.setStuname("赵云");
//		DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
//		Date date;
//			try {
//				date =  dateFormat.parse("0000-11-22");
//				java.sql.Date date1=new java.sql.Date(date.getTime());
//				stu.setStujointime(date1);
//			} catch (ParseException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		int result=st.save(stu);
//		if(result!=0){
//			System.out.println("添加成功");
//		}
		//更改成功
//		StudentDao st=new StudentDaoImpl();
//		Student stu1=new Student();
//		stu1.setStuname("张飞");
//		stu1.setStuid(9);
//		int result=st.alter(stu1);
//		if(result!=0){
//			System.out.println("更改成功！");
		
//		}
		StudentDao st=new StudentDaoImpl();
		System.out.println(st.chaxun());
	}

}
