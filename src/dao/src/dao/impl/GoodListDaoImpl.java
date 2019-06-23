package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import entity.GoodList;

public class GoodListDaoImpl extends BaseDao implements GoodListImpl{
	//首页的商品分页查询
	public  List<GoodList> listGood(int curPage, int pageSize) {
		//申明变量
		GoodList goodList =null;
		List<GoodList> arryList = new ArrayList<GoodList>();
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			conn=getConn();
			String sql="select * from good_list limit ?,?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, (curPage-1)*pageSize);
			pst.setInt(2, pageSize);
			rs=pst.executeQuery();
			
			while(rs.next()){
				
				goodList=new GoodList();
				goodList.setPicturePath(rs.getString("picture_path"));
				goodList.setPicturePrice(rs.getDouble("picture_price"));
				goodList.setPictureTitle(rs.getString("picture_title"));
				goodList.setProductViewId(rs.getInt("product_view_id"));
			
				arryList.add(goodList);
				
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return arryList;
	}
	
	
	
	
	
	//商品二级分类，商品分类后再分页
	public  List<GoodList> listTypesGood(int curPage, int pageSize,int type) {
		GoodList goodList =null;
		List<GoodList> arryList = new ArrayList<GoodList>();
		Connection conn=null;
		PreparedStatement pst=null;
		ResultSet rs=null;
		
		try {
			conn=getConn();
			String sql="select * from good_list limit ?,? where picture_type=?";
			pst=conn.prepareStatement(sql);
			pst.setInt(1, (curPage-1)*pageSize);
			pst.setInt(2, pageSize);
			pst.setInt(3, type);
			rs=pst.executeQuery();
			
			while(rs.next()){
				
				goodList=new GoodList();
				goodList.setPicturePath(rs.getString("picture_path"));
				goodList.setPicturePrice(rs.getDouble("picture_price"));
				goodList.setPictureTitle(rs.getString("picture_title"));
				arryList.add(goodList);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return arryList;
	}
	
}
