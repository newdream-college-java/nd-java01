package com.cc.dao.impl;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cc.dao.BaseDao;
import com.cc.dao.OrderDao;
import com.cc.dao.OrderDetailDao;
import com.cc.dao.ProductDao;
import com.cc.entity.Order;
import com.cc.entity.OrderDetail;
import com.cc.entity.Product;

public class OrderDaoImpl extends BaseDao implements OrderDao {
    private OrderDetailDao orderDetailDao;
    private ProductDao productDao;
    @Override
    public List<Order> listOrderByCondition(Integer eoId, String eoUserName,int page,int pageSize) {
       System.out.println("eoId="+eoId+"\teoUserName="+eoUserName);
        List<Order> list = new ArrayList<Order>();
        try {
            getConn();
            StringBuffer sb = new StringBuffer("select * from eb_order ");
            if(eoId!=null&&eoUserName!=null&&eoUserName.trim().length()>0) {
                sb.append(" where eo_id=? and eo_user_name=? limit ?,?");
                pst = conn.prepareStatement(sb.toString());
                pst.setInt(1, eoId);
                pst.setString(2,eoUserName);
                pst.setInt(3, (page-1)*pageSize);
                pst.setInt(4, pageSize);
            }else if(eoId!=null&&eoUserName==null||(eoUserName!=null&&eoUserName.trim().length()==0)) {
                sb.append(" where eo_id=?  limit ?,?");
                pst = conn.prepareStatement(sb.toString());
                pst.setInt(1, eoId);
                pst.setInt(2, (page-1)*pageSize);
                pst.setInt(3, pageSize);
            }else if(eoId==null&&eoUserName!=null&&eoUserName.trim().length()>0) {
                sb.append(" where eo_user_name=? limit ?,?");
                
                pst = conn.prepareStatement(sb.toString());
                pst.setString(1,eoUserName);
                pst.setInt(2, (page-1)*pageSize);
                pst.setInt(3, pageSize);
            }else {
                sb.append(" limit ?,?");
                pst = conn.prepareStatement(sb.toString());
                pst.setInt(1, (page-1)*pageSize);
                pst.setInt(2, pageSize);
            }
            rs = pst.executeQuery();
            while(rs.next()) {
                Order order = new Order();
                
                order.setEoId(rs.getInt("eo_id"));
                order.setEoUserName(rs.getString("eo_user_name"));
                order.setEoUserAddress(rs.getString("eo_user_address"));
                order.setEoCreateTime(rs.getString("eo_create_time"));
                order.setEoUserId(rs.getInt("eo_user_id"));
                order.setEoStatus(rs.getInt("eo_status"));
             
                order.setEoCost(rs.getBigDecimal("eo_cost"));
                order.setEoType(rs.getInt("eo_type"));
                list.add(order);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            closeConn(rs, pst, conn);
        }
        return list;
    }
    public static void main(String[] args) {
        OrderDaoImpl od = new OrderDaoImpl();
       System.out.println( od.listOrderByCondition(null, "牙套哥",1, 2));
       
       BigDecimal b  =new BigDecimal("3.42");
       BigDecimal c  =new BigDecimal("3.59");
       System.out.println(b.add(c).setScale(2,BigDecimal.ROUND_FLOOR));
       System.out.println(b.multiply(c).setScale(2,BigDecimal.ROUND_FLOOR));
       
       
       
       
    }
    /**
     * 添加订单付款：
     * 1.添加一条订单记录               order表
     * 2.添加多条订单详情记录       order_detail表
     * 3.改商品的库存                       product
     */
    @Override
    public int addOrder(int id,Product product) {
        
        try {
            getConn();
            conn.setAutoCommit(false);//开启事务  （设置事务部自动提交）
            
            Order order = new Order();
          //1.校验库存查询库存：购买数量必须小于或者等于库存
            //1.1根据id查询数据库中的商品的存库
            //1.2 拿库存与product的count比较
            //2.添加一条订单记录               order表
            int  result1 = saveOrder(order );
            //3.添加多条订单详情记录       order_detail表
            OrderDetail orderDetail = new OrderDetail();
            int result2 = orderDetailDao.saveOrderDetail(orderDetail );
            Product pro  =new Product();
            //4.扣商品的库存                       product
            int result3 = productDao.changeProductStock( pro );
            if(result1>0&&result2>0&&result3>0) {
                conn.commit();//提交事务
            }else {
                conn.rollback();//回滚事务
            }
        } catch (Exception e) {
            e.printStackTrace();
            try {
                conn.rollback();//回滚事务
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {
             closeConn(rs, pst, conn);
        }
        
        
        
        
        return 0;
    }
    private int saveOrder(Order order) {
        // TODO Auto-generated method stub
        return 0;
    }
}
