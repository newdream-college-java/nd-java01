package cn.song.dao;

import static org.junit.jupiter.api.Assertions.*;

import java.sql.SQLException;

import org.junit.jupiter.api.Test;

/**
* @author mo
* @version 2019��5��27�� ����2:45:04
* @description
*/
class BaseDaoTest {

	@Test
	void testGetConnection() {
		try {
			BaseDao.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	void testCloseAll() {
		fail("Not yet implemented");
	}

}
