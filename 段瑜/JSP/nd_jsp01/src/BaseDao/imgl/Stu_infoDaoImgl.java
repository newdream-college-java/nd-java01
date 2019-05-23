package BaseDao.imgl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import BaseDao.BaseDao;
import BaseDao.stu_infoDao;
import entity.Stu_info;

public class Stu_infoDaoImgl implements stu_infoDao{

	public int Delete(Stu_info stuinfo) {
		Scanner input=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			String sql="delete from stu_info where id=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1,5);
			result=pst.executeUpdate();
			if(result!=0){
				System.out.println("ɾ���ɹ���");
			}else{
				System.out.println("ɾ��ʧ��");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			BaseDao.doseAll(null, pst, conn);
		}
		return result;
	}

	public int Update(Stu_info stuinfo) {
		Scanner input=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pst=null;
		int result=11;
		try {
			conn=BaseDao.getConn();
			String sql="update stu_info set sname=? where id=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,"���");
			pst.setInt(2,1);
			result=pst.executeUpdate();
			if(result!=0){
				System.out.println("�޸ĳɹ�");
			}else{
				System.out.println("�޸�ʧ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.doseAll(null, pst, conn);
		}
		return 0;
	}

	public int save(Stu_info stuinfo) {
		Scanner input=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pst=null;
		int result=11;
		try {
			conn=BaseDao.getConn();
			String sql="insert into stu_info values(null,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,"���");
			pst.setInt(2,23);
			pst.setString(3,"1997-02-21");
			result=pst.executeUpdate();
			if(result>0){
				System.out.println("��ӳɹ�");
			}else{
				System.out.println("���ʧ��");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			BaseDao.doseAll(null, pst, conn);
		}
		return 0;
	}

	public List<Stu_info> select() {
		// TODO Auto-generated method stub
		List<Stu_info> list=new ArrayList<Stu_info>();
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.getConn();
			String sql="select * from stu_info";
			pst=conn.prepareStatement(sql);
			rs=pst.executeQuery();
			while(rs.next()){
				Stu_info stuinfo=new Stu_info();
				stuinfo.setSid(rs.getInt("id"));
				stuinfo.setSname(rs.getString("sname"));
				stuinfo.setSage(rs.getInt("sage"));
				stuinfo.setSbirthday(rs.getString("sbirthday"));
				list.add(stuinfo);
			}
			System.out.println(list);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			BaseDao.doseAll(rs, pst, conn);
		}
		return list;
		
	}
	public static void main(String[] args) {
		Stu_infoDaoImgl s=new Stu_infoDaoImgl();
		Stu_info stuinfo=new Stu_info();
		s.save(stuinfo);
	}
}
