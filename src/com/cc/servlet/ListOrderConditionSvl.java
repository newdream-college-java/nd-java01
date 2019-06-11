package com.cc.servlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cc.constants.EasyBuyEnums;
import com.cc.dao.impl.OrderDaoImpl;
import com.cc.entity.Order;
import com.cc.vo.OrderVo;

public class ListOrderConditionSvl extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1.编码
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        // 2.取值
        int page = 1;
        int pageSize = 2;
        String orderId = req.getParameter("orderId");
        String userName = req.getParameter("userName");
        Integer eoId = null;
        if(orderId!=null&&orderId.trim().length()>0) {
            eoId=Integer.parseInt(orderId);
        }
        String eoName=null;
        if(userName!=null&&userName.trim().length()>0) {
            eoName = userName;
        }
        
        // 3.调dao
        List<Order> orders = new OrderDaoImpl().listOrderByCondition(eoId, eoName, page,
                pageSize);
        List<OrderVo> ordersVo =new ArrayList<OrderVo>();
        //将entity----》 vo
        for(Order order :orders) {
            OrderVo ov = new OrderVo();
            ov.setEoId(order.getEoId());
            ov.setEoUserAddress(order.getEoUserAddress());
            ov.setEoUserName(order.getEoUserName());
            if(order.getEoStatus()==EasyBuyEnums.OrderStatus2.ORDER.getCode()) {
                ov.setEoStutsView(EasyBuyEnums.OrderStatus2.ORDER.getDesc());
            }else if(order.getEoStatus()==EasyBuyEnums.OrderStatus2.AUDITING.getCode()) {
                ov.setEoStutsView(EasyBuyEnums.OrderStatus2.ORDER.getDesc());
            }else if(order.getEoStatus()==EasyBuyEnums.OrderStatus2.DISTRBUTION.getCode()) {
                ov.setEoStutsView(EasyBuyEnums.OrderStatus2.ORDER.getDesc());
            }else if(order.getEoStatus()==EasyBuyEnums.OrderStatus2.SENDING.getCode()) {
                ov.setEoStutsView(EasyBuyEnums.OrderStatus2.ORDER.getDesc());
            }else {
                ov.setEoStutsView(EasyBuyEnums.OrderStatus2.ORDER.getDesc());
            }
            if(order.getEoType()==EasyBuyEnums.PaidType.ONBLINE.getCode()) {
                ov.setEoTypeView(EasyBuyEnums.PaidType.ONBLINE.getDesc());
            }else  if(order.getEoType()==EasyBuyEnums.PaidType.RECIEVED_PAID.getCode()){
                ov.setEoTypeView(EasyBuyEnums.PaidType.RECIEVED_PAID.getDesc());
            }
            ordersVo.add(ov);
        }
        
        
        // 4.跳转
        req.setAttribute("ordersVo", ordersVo);
        req.getRequestDispatcher("order.jsp").forward(req, resp);
    }
}
