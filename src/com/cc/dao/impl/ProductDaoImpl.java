package com.cc.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.ProductDao;
import com.cc.entity.News;
import com.cc.entity.Product;

public class ProductDaoImpl extends BaseDao implements ProductDao {
    @Override
    public List<Product> listByPage(int page, int pageSize) {
        List<Product> list =new ArrayList<Product>();
        try {
            getConn();
            String sql  = "select * from eb_product limit ?,?";
            pst =conn.prepareStatement(sql);
            pst.setInt(1,(page-1)*pageSize);
            pst.setInt(2, pageSize);
           rs =  pst.executeQuery();
           while(rs.next()) {
               Product pro = new Product();
               pro.setEpId(rs.getInt("ep_id"));
               pro.setEpName(rs.getString("ep_name"));
               pro.setEpStock(rs.getInt("ep_stock"));
               pro.setEpFileName(rs.getString("ep_file_name"));
               pro.setEpPrice(rs.getBigDecimal("ep_price"));
               list.add(pro);
           }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            closeConn(rs, pst, conn);
        }
        return list;
    }
   public static void main(String[] args) {
    System.out.println(new ProductDaoImpl().findById(1));
}
@Override
public Product findById(int pid) {
    Product pro =new Product();
    try {
        getConn();
        String sql  = "select * from eb_product where ep_id=? limit 0,1";
        pst =conn.prepareStatement(sql);
        pst.setInt(1,pid);
       rs =  pst.executeQuery();
       while(rs.next()) {
           pro.setEpId(rs.getInt("ep_id"));
           pro.setEpName(rs.getString("ep_name"));
           pro.setEpStock(rs.getInt("ep_stock"));
           pro.setEpDescription(rs.getString("ep_description"));
           pro.setEpFileName(rs.getString("ep_file_name"));
           pro.setEpPrice(rs.getBigDecimal("ep_price"));
       }
    } catch (Exception e) {
        e.printStackTrace();
    }finally {
        closeConn(rs, pst, conn);
    }
    return pro;
}
@Override
public int changeProductStock(Product pro) {
    // TODO Auto-generated method stub
    return 0;
}

}
