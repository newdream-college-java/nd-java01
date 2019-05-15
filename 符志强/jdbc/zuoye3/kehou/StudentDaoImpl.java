package kehou;

import java.sql.Connection;
import java.sql.PreparedStatement;
import kehou.dao.BaseDao;
import kehou.dao.StudentDao;


public class StudentDaoImpl  implements StudentDao {
	
	@Override
	public Student findStudent(Student stu) {
		//创建一个空连接
		Connection conn = null;
		//创建一个 空 声明
		PreparedStatement pst = null;
		
		Student hq = new Student();
		//处理异常
		try {
		//把BaseDao里的数据链接过来给conn
		conn = BaseDao.getConn();
		//创建mysql执行语句
		String sql = "update student set name=? where id=?";
		//把conn的数据
		pst = conn.prepareStatement(sql);

		pst.setString(1,stu.getName());

		pst.setInt(2,stu.getId());
				    
		int result = pst.executeUpdate();
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeConn(null, pst, conn);
		}
		return hq;
	}	
	public static void main(String[] args) {
		Student ma=new Student();
		ma.setName("小斌");
		ma.setId(1);
		StudentDao md=new StudentDaoImpl();
		Student r=md.findStudent(ma);
		if(r!=null) {
			System.out.println("更改成功");
		}else {
			System.out.println("更改失败");
		}
	}
}
