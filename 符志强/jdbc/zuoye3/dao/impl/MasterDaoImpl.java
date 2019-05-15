package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import com.cc.dao.BaseDao;
import dao.MasterDao;
import entity.Master;


public class MasterDaoImpl  implements MasterDao {
	@Override
	public Master findMaster(Master master) {
		//创建一个空连接
		Connection conn = null;
		//创建一个 空 声明
	    PreparedStatement pst = null;
	    //创建一个空 结果集  获取每一行的数据
	    ResultSet result = null;
	    //创建一个 获取变量 
	    Master hq=null;
	    //处理异常
	    try {
	    	//把BaseDao里的数据链接过来给conn
	    	conn = BaseDao.getConn();
	    	//创建mysql执行语句
	        String sql = "select * from master where name=? and password=?";
	        //把conn的数据
	        pst = conn.prepareStatement(sql);
	        //
	        pst.setString(1,master.getName());
	        //
	        pst.setString(2,master.getPassword());
	        //
	        result = pst.executeQuery();
	        
	        while(result.next()){
	        	
		       	hq = new Master();
		       	
		        hq.setId(result.getInt("id"));
		      	hq.setName(result.getString("name"));
		      	hq.setPassword(result.getString("password"));
	        	hq.setMoney(result.getInt("money"));
	        }
	     } catch (Exception e) {
	     	e.printStackTrace();
	     }finally {
	     	BaseDao.closeConn(null, pst, conn);
	     }
	        return hq;
	    }
	public static void main(String[] args) {
		Master ma=new Master();
		ma.setName("刘春蕾");
		ma.setPassword("1111");
		MasterDao md=new MasterDaoImpl();
		Master r=md.findMaster(ma);
		if(r!=null) {
			System.out.println("登录成功");
		}else {
			System.out.println("登录失败");
		}
	}	
}
