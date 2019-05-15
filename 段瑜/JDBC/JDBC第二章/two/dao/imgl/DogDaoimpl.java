package cn.two.dao.imgl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cn.two.dao.BaseDao;
import cn.two.dao.DogDao;
import cn.two.entity.Dog;

public class DogDaoimpl implements DogDao{

	@Override
	public List<Dog> selectDog() {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet result=null;
		List<Dog> dogs=new ArrayList<Dog>();
		Dog dog;
		try {
			conn=BaseDao.getConn();
			String sql="select id,name,strain from dog";
			pst=conn.prepareStatement(sql);
			result=pst.executeQuery();
			while(result.next()) {
				dog=new Dog();
				dog.setId(result.getInt("id"));
				dog.setName(result.getString("name"));
				dog.setStrain(result.getString("strain"));
//				System.out.println(dog);
				dogs.add(dog);
			}
			System.out.println(dogs);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally {
			BaseDao.doseAll(null, pst, conn);
		}
		
		return dogs;
	}

	@Override
	public int save(Dog dog) {
		Connection conn=null;
		PreparedStatement pst=null;
		Scanner input=new Scanner(System.in);
		int result=-1;
		try {
			conn=BaseDao.getConn();
			System.out.println("请输入宠物的名称：");
			dog.setName(input.next());
			System.out.println("请输入宠物的品种：");
			dog.setStrain(input.next());
			String sql="insert into dog values(null,?,85,90,?)";
			pst=conn.prepareStatement(sql);
			pst.setString(1, dog.getName());
			pst.setString(2, dog.getStrain());
			result=pst.executeUpdate();
			if(result!=0) {
				System.out.println("添加成功");
			}else {
				System.out.println("添加失败");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			BaseDao.doseAll(null, pst, conn);
		}
		return result;
	}

	@Override
	public int updateDog(Dog dog) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pst=null;
		Scanner input=new Scanner(System.in);
		int result=-1;
		try {
			conn=BaseDao.getConn();
			String sql="update dog set strain=? where name=?";
			System.out.println("请输入品种");
			dog.setStrain(input.next());
			System.out.println("请输入名称");
			dog.setName(input.next());
			pst=conn.prepareStatement(sql);
			pst.setString(1,dog.getStrain());
			pst.setString(2, dog.getName());
			result=pst.executeUpdate();
			if(result!=0) {
				System.out.println("修改成功");
			}else {
				System.out.println("修改失败");
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
