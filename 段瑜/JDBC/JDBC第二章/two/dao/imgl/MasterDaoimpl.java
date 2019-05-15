package cn.two.dao.imgl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import cn.cc.dao.BaseDao;
import cn.two.dao.MasterDao;
import cn.two.entity.Master;

public class MasterDaoimpl implements MasterDao{

	@Override
	public boolean select(Master master) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		boolean falg=false;
		try {
			conn = BaseDao.getConn();
			String sql="select name,mpassword from master where name=? and mpassword=?";
			pst=conn.prepareStatement(sql);
			pst.setString(1,master.getName());
			pst.setString(2,master.getPassword());
			result=pst.executeQuery();
			if(result.next()) {
				System.out.println("��¼�ɹ�");
				falg=true;
			}else {
				System.out.println("��¼ʧ��");
				falg=false;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			BaseDao.doseAll(null, pst, conn);
		}
		return falg;
	}

	@Override
	public int save(Master master) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pst=null;
		int result=-1;
		try {
			conn=BaseDao.getConn();
			String sql="insert into master values(null,?,?,?)";
			System.out.println("�������û�����");
			master.setName(input.next());
			System.out.println("���������룺");
			master.setPassword(input.next());
			System.out.println("������Ԫ������");
			master.setMoney(input.nextInt());
			pst=conn.prepareStatement(sql);
			pst.setString(1, master.getName());
			pst.setString(2, master.getPassword());
			pst.setInt(3, master.getMoney());
			result=pst.executeUpdate();
			if(result!=0) {
				System.out.println("��ӳɹ�");
			}else {
				System.out.println("���ʧ��");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(null, pst, conn);
		}
		return result;
	}

}
