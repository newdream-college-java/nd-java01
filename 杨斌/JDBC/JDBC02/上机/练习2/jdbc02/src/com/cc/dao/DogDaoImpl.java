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
			System.out.println("\t\t宠物信息列表");
			System.out.println("\t编号\t名字\t品种");
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
}
