package com.test;



import org.junit.Test;

import com.dao.BaseDao;
import com.dao.MembersinfoDao;
import com.dao.impl.MembersinfoDaoImpl;
import com.entity.Membersinfo;


public class TestDao {
	MembersinfoDao md=new MembersinfoDaoImpl();
	@Test
	public void testDao(){
		BaseDao bd=new BaseDao();
		bd.getConn();
		System.out.println(bd.conn);
	}
	@Test
	public void testMem(){
		//System.out.println(md.list(2));
		Membersinfo me=new Membersinfo();
		me.setMid(2);
		me.setMaddress("����ʡ�Ͼ��к������±����1��");
		me.setMage(22);
		me.setMemail("lockfeng@qq.com");
		me.setMgender("��");
		me.setMname("����");
		
		System.out.println(md.Update(me));
	}
}
