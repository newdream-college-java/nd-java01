package zuoye;

import java.sql.Connection;
import java.sql.PreparedStatement;

import zuoye.BaseDao;

public class PersonDaoImpl implements PersonDao {
	public int save(Person p) {
		Connection conn = null;
		PreparedStatement pst = null;
		int r=-1;
		try {
			conn = BaseDao.getConn();
			String sql = "insert into person values(NULL,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, p.getName());
			pst.setInt(2, p.getIsMarried());
			pst.setInt(3, p.getAge());
			r = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return r;
	}
	public int save1(Person p) {
		Connection conn = null;
		PreparedStatement pst = null;
		int r=-1;
		try {
			conn = BaseDao.getConn();
			String sql = "delete from person where name=? and age=? ";
			pst = conn.prepareStatement(sql);
			pst.setString(1, p.getName());
			pst.setInt(2, p.getAge());
			r = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return r;
	}
	public int save2(Person p) {
		Connection conn = null;
		PreparedStatement pst = null;
		int r=-1;
		try {
			conn = BaseDao.getConn();
			String sql = "update person set name=? ,isMarried=?,age=? where id=?";
			pst = conn.prepareStatement(sql);
			pst.setString(1, p.getName());
			pst.setInt(2, p.getIsMarried());
			pst.setInt(3, p.getAge());
			pst.setInt(4, p.getId());
			r = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.closeConn(null, pst, conn);
		}
		return r;
	}
	
	//测试
	public static void main(String[] args) {
//		int r = new PersonDaoImpl().save1(new Person("辉",0,44));
//		System.out.println(r);
//		int r1 = new PersonDaoImpl().save1(new Person("a",0,1));
//		System.out.println(r1);
			int r2 = new PersonDaoImpl().save2(new Person(3,"xx",0,11));
			System.out.println(r2);
	}
}








