package parentchildnetwork;

import static org.junit.Assert.*;

import org.junit.Test;

import com.yb.dao.BaseDao;

public class DaoTest {
	BaseDao bd=new BaseDao();
	@Test
	public void baseDaoTest() {
		bd.text();
		System.out.println(bd.conn);
	}

}
