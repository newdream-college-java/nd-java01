package kehou;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import entity.Master;
import kehou.dao.BaseDao;
import kehou.dao.StudentDao;


public class StudentDaoImpl2  implements StudentDao {
	
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
		String sql = "select * from student";
		//把conn的数据
		pst = conn.prepareStatement(sql);
				    
		ResultSet result = pst.executeQuery();
		if(result!=null) {
			System.out.println("\t查询成功");
			System.out.println("id name");
			while(result.next()) {	
				int id=result.getInt("id");
				String name=result.getString("name");
				System.out.println(id+" "+name);
			}
			
		}else {
			System.out.println("查询失败");
		}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			BaseDao.closeConn(null, pst, conn);
		}
		return hq;
	}	
	public static void main(String[] args) {
		Student ma=new Student();
		StudentDao md=new StudentDaoImpl2();
		Student r=md.findStudent(ma);
		
	}
}
