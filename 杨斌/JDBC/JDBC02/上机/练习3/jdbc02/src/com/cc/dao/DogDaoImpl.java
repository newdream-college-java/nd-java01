package com.cc.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.cc.entity.Dog;
public class DogDaoImpl implements DogDao{
	public Dog selectDog() {
		Dog dog=null;
		Connection conn=null;
		PreparedStatement st=null;
		ResultSet rs=null;
		try {
			conn=BaseDao.conn();
			String sql="select * from dog ";
			st=conn.prepareStatement(sql);
			rs=st.executeQuery();
			System.out.println("\t\t������Ϣ�б�");
			System.out.println("\t���\t����\tƷ��");
			while(rs.next()) {
				dog=new Dog();
				dog.setId(rs.getInt("id"));
				dog.setName(rs.getString("name"));;
				dog.setHealth(rs.getInt("health"));
				dog.setLove(rs.getInt("love"));
				dog.setStrain(rs.getString("strain"));		
				System.out.println(dog);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			BaseDao.closeAll(conn, st, rs);
		}
		return dog;
	}
	public int executeUpdate(String sql,Object[] objects) {//��ɾ��
		Connection conn=null;
		PreparedStatement st=null;
		int result=0;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=BaseDao.conn();
			st=conn.prepareStatement(sql);
			if(objects!=null) {
				for(int i=0;i<objects.length;i++) {
					st.setObject(i+1, objects[i]);
				}
			}
			result=st.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
