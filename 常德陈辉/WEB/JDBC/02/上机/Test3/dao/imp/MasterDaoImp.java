package 上机.Test3.dao.imp;

import java.sql.Connection;
import java.sql.PreparedStatement;

import 上机.Test3.dao.Basedao;
import 上机.Test3.dao.MasterDao;

public class MasterDaoImp implements MasterDao{

	@Override
	public int master() {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement pst = null;
        int result = -1;
        try {
            conn = Basedao.getConn();
            String sql = "insert into master(name,password) values(?,?)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,"张三");
            pst.setString(2,"1231");
            result = pst.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Basedao.closeConn(null, pst, conn);
        }
		return result;
	}

	@Override
	public int tdog() {
		Connection conn = null;
        PreparedStatement pst = null;
        int result = -1;
        try {
            conn = Basedao.getConn();
            String sql = "insert into dog values(null,?,?,?,null)";
            pst = conn.prepareStatement(sql);
            pst.setString(1,"张三");
            pst.setInt(2,60);
            pst.setInt(3,70);
            result = pst.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Basedao.closeConn(null, pst, conn);
        }
		return result;
	}
	

	@Override
	public int xdog() {
		// TODO Auto-generated method stub
		Connection conn = null;
        PreparedStatement pst = null;
        int result = -1;
        try {
            conn = Basedao.getConn();
            String sql = "delete from dog set name=? where id=?";
            pst = conn.prepareStatement(sql);
            pst.setString(1,"李四");
            pst.setInt(2,6);
            result = pst.executeUpdate();
           
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            Basedao.closeConn(null, pst, conn);
        }
		return result;
	}
	//测试
	public static void main(String[] args) {
		MasterDao md=new MasterDaoImp();
		int result=md.master();
		if(result!=0){
			System.out.println("成功");
		}
		
		int result1=md.tdog();
		if(result1!=0){
			System.out.println("成功");
		}
		
		int result2=md.xdog();
		if(result2!=0){
			System.out.println("成功");
		}
		
	}

}
