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

public class Stu_infoDaoImgl extends BaseDao implements stu_infoDao{

	public int Delete(Stu_info stuinfo) {
		Scanner input=new Scanner(System.in);
		int result=-1;
		try {
			getConn();
			String sql="delete from stu_info where id=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1,stuinfo.getSid());
			result=pst.executeUpdate();
			if(result!=0){
				System.out.println("删除成功！");
			}else{
				System.out.println("删除失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			doseAll(null, pst, conn);
		}
		return result;
	}

	public int Update(Stu_info stuinfo) {
		Scanner input=new Scanner(System.in);
		int result=-1;
		try {
			getConn();
			String sql="update stu_info set sname=? where id=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,stuinfo.getSname());
			pst.setInt(2,stuinfo.getSid());
			result=pst.executeUpdate();
			if(result!=0){
				System.out.println("修改成功");
			}else{
				System.out.println("修改失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			doseAll(null, pst, conn);
		}
		return result;
	}

	public int save(Stu_info stuinfo) {
		Scanner input=new Scanner(System.in);
		int result=11;
		try {
			getConn();
			String sql="insert into stu_info values(null,?,?,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1,stuinfo.getSname());
			pst.setInt(2,stuinfo.getSage());
			pst.setString(3,stuinfo.getSbirthday());
			result=pst.executeUpdate();
			if(result!=0){
				System.out.println("添加成功");
			}else{
				System.out.println("添加失败");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			doseAll(null, pst, conn);
		}
		return result;
	}

	public List<Stu_info> select(Integer id) {
		List<Stu_info> list=new ArrayList<Stu_info>();
		try {
			getConn();
			String sql="select * from stu_info where id=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1,id);
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
			e.printStackTrace();
		}finally{
			doseAll(rs, pst, conn);
		}
		return list;
		
	}
}
