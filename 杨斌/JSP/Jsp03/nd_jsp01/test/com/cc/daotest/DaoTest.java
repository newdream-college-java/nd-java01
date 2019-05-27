package com.cc.daotest;
import org.junit.Test;

import com.cc.dao.BaseDao;
import com.cc.dao.imp.MasterDaoImp;
import com.cc.entity.Master;
public class DaoTest {
	
	@Test
	public void test() {
		BaseDao bs=new BaseDao();
		bs.conn();
		System.out.println(bs.conn);
	}
	@Test
	public void addtest() {	
		MasterDaoImp md=new MasterDaoImp();
		System.out.println(md.save(new Master("11","222",333)));
	}
	@Test
	public void seletest() {	
		MasterDaoImp md=new MasterDaoImp();
		System.out.println(md.list(5));
	}

}
