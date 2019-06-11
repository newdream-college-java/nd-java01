package com.cc.dao.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.cc.constants.EasyBuyEnums;
import com.cc.dao.BaseDao;
import com.cc.dao.OrderDao;
import com.cc.entity.Order;
import com.cc.vo.OrderVo;

public class OrderDaoImpl extends BaseDao implements OrderDao {
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
}
