package com.cc.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.PersonDao;
import com.cc.entity.Person;

public class PersonDaoImpl extends BaseDao implements PersonDao {

	@Override
	public int save(Person person) {
		
		int result=-1;
		try {
			getConn();
			String sql = "insert into person values(NULL,?,?,?)";
			pst = conn.prepareStatement(sql);
			pst.setString(1, person.getName());
			pst.setInt(2, person.getIsMarried());
			pst.setInt(3, person.getAge());
			result = pst.executeUpdate();
				
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return result;
	}
	
	//（1）id=0查询全部 （2）id!=0才是根据id查询
	@Override
	public List<Person> selectByIdOrAll(Integer id) {
		List list  = new ArrayList();;
		try {
			getConn();
			//StringBuffer 类似于String  但是添加效率要高
			StringBuffer sql =new StringBuffer("select * from person");
			if(id!=0){
				//字符串拼接
				sql.append(" where id=?");
				pst = conn.prepareStatement(sql.toString());
				pst.setInt(1, id);
			}else{
				pst = conn.prepareStatement(sql.toString());
			}
			rs = pst.executeQuery();
			while(rs.next()){
				Person p = new Person();
				p.setId(rs.getInt("id"));
				p.setIsMarried(rs.getInt("isMarried"));
				p.setAge(rs.getInt("age"));
				p.setName(rs.getString("name"));
				list.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}
	//根据人的名字进行模糊删除
	public int deleteByName(String name){
		int result = -1;
		try {
			getConn();
			String sql = "delete from person where name like ?";
			pst = conn.prepareStatement(sql);
			pst.setString(1,"%"+ name+"%");
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		return result;
	}

	@Override
	public int updatePerson(Person person) {
		int result = -1;
		try {
			getConn();
			String sql = "update person set name=?,ismarried=?,age=? where id=? ";
			pst = conn.prepareStatement(sql);
			pst.setString(1, person.getName());
			pst.setInt(2, person.getIsMarried());
			pst.setInt(3, person.getAge());
			pst.setInt(4, person.getId());
			//执行
			result = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(null, pst, conn);
		}
		
		return result;
	}
	public static void main(String[] args) {
		Person person = new Person("王三狗",1,22);
		person.setId(4);
		System.out.println(new PersonDaoImpl().updatePerson(person));
	}
}








