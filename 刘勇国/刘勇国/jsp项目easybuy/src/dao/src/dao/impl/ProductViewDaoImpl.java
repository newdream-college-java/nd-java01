package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import dao.BaseDao;
import entity.ProductView;

public class ProductViewDaoImpl extends BaseDao implements ProductViewImp {

	public List<ProductView> showProductVew(int id) {
		Connection conn =null;
		ResultSet rs =null;
		PreparedStatement pst =null;
		int result=-1;
		//商品详情功能
		List<ProductView> list =new ArrayList<ProductView>();
		try {
			 conn=getConn();
			 String sql="select * from product_view where product_view_id=?";
			 pst=conn.prepareStatement(sql);
			 pst.setInt(1, id);
			 rs=pst.executeQuery();
			 while(rs.next()){
				 ProductView pv= new ProductView();
				 pv.setProductViewId(rs.getInt("product_view_id"));
				 pv.setProductViewName(rs.getString("product_view_name"));
				 pv.setProductViewPrice(rs.getDouble("product_view_price"));
				 pv.setProductViewStore(rs.getInt("product_view_store"));
				 pv.setProductViewPicture(rs.getString("product_view_picture"));
				 pv.setProductViewDescription(rs.getString("product_view_description"));
			 
				 list.add(pv);
				
			 }
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			closeConn(rs, pst, conn);
		}
		return list;
	}

}
