package com.yb.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.ParentChildThemeDaoImpl;
import com.yb.vo.ParentChildThemeVo;


public class ParentChildThemeTravelServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//改编码
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//页的值
		int curPage=1;
		//每页显示个数
		int pageSize=12;
		//获取curPage
		String ScurPage=request.getParameter("curPage");
		String nameStr=request.getParameter("name");//搜索的值
		String namesStr=request.getParameter("names");//页面传过来搜索的值
		//判断ScurPage是不是非空
		
		if(ScurPage!=null&&ScurPage.trim().length()>0){
			//把ScurPage转为整数
			curPage=Integer.parseInt(ScurPage);
		}
		//旅游的时间和地区
		int pcnpctTravelDays=0;
		
		//设置模糊查询字段
		String name=null;
		//获取pcnpctTravelDays
		String pcnpctTravelDays1=request.getParameter("pcnpctTravelDays");
		//判断pcnpctTravelDays1是不是非空
		if(pcnpctTravelDays1!=null&&pcnpctTravelDays1.trim().length()>0){
			//把pcnpctTravelDays1转为整数
			pcnpctTravelDays=Integer.parseInt(pcnpctTravelDays1);
		}
		 if(nameStr!=null&&nameStr.trim().length()>0){
		    	name=nameStr;
		    }
		 if(namesStr!=null&&namesStr.trim().length()>0){
		    	name=new String(namesStr.getBytes("iso-8859-1"), "utf-8");
		 }
		
		//调用ParentChildThemeDaoImpl
		ParentChildThemeDaoImpl p=new ParentChildThemeDaoImpl();
		//调用ParentChildThemeDaoImpl的list方法
		List<ParentChildThemeVo> list=p.list(curPage, pageSize,pcnpctTravelDays,name);	
		//调用ParentChildThemeDaoImpl的getcount方法
		int count=p.getcount(pageSize,pcnpctTravelDays,name);
		//System.out.println(count);
		
		//判断list是不是为空
			//旅游的时间和地区值
			request.setAttribute("pcnpctTravelDays", pcnpctTravelDays);
			request.setAttribute("TravelDays", pcnpctTravelDays1);
			//主题数据
			request.setAttribute("Travellist", list);
			//页的值
			
			request.setAttribute("curPage",curPage);
			//每页显示数
			request.setAttribute("pageSize",pageSize);
			//共显示数
			request.setAttribute("count", count);
			
			 request.setAttribute("name", name);
			//跳转
			request.getRequestDispatcher("qzly.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
