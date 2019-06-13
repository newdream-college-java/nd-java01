package com.yb.servlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.ParentChildThemeDaoImpl;
import com.yb.dao.impl.GoodsSpuValueDaoImpl;
import com.yb.entity.ParentChildTheme;
import com.yb.entity.GoodsSpuValue;
import com.yb.vo.ParentChildThemeTicketingShowVo;

public class ParentChildThemeTicketingShowServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		ParentChildThemeDaoImpl pctdi=new ParentChildThemeDaoImpl();
	    GoodsSpuValueDaoImpl pgsvd=new GoodsSpuValueDaoImpl();
		String curpage=request.getParameter("curPage");
		String cityStr=request.getParameter("city");
		String activityStr=request.getParameter("activity");
		String dayStr=request.getParameter("curday");
		int themeType=3;
	    int page=1;
	    int pageSize=9;
	    String city=null;
	    Integer activity=null;
	    Integer day=null;
	    if(curpage!=null&&curpage.trim().length()>0){
	     	page=Integer.parseInt(curpage);
	    }
	    if(cityStr!=null&&cityStr.trim().length()>0){
	    	city=new String(cityStr.getBytes("iso-8859-1"), "utf-8");
	    }
	    if(activityStr!=null&&activityStr.trim().length()>0){
	    	activity=Integer.parseInt(activityStr);
	    }
	    if(dayStr!=null&&dayStr.trim().length()>0){
	    	day=Integer.parseInt(dayStr);
	    }
	    Map<String,Integer> numbers=pctdi.numbers(themeType,pageSize,city,activity,day);
	    int count=numbers.get("count");
	    int number=numbers.get("number");
	    List<ParentChildTheme> pctList=pctdi.parentChildThemeList(themeType,page, pageSize, city, activity, day); 
	    List<ParentChildThemeTicketingShowVo> pcttsList=new ArrayList<ParentChildThemeTicketingShowVo>(); 	    
	    List<GoodsSpuValue> pgsvdlist=pgsvd.PcnGoodsSpuSpecPrice(themeType);	    
	    for(ParentChildTheme pct:pctList){
	    	ParentChildThemeTicketingShowVo pcta=new ParentChildThemeTicketingShowVo();
	    	pcta.setPcnpctId(pct.getPcnpctId());
	    	pcta.setPcnThemeName(pct.getPcnThemeName());
	    	pcta.setPcnStartTime(pct.getPcnStartTime());
	    	pcta.setPcnEndTime(pct.getPcnEndTime());
	    	pcta.setPcnStatus(pct.getPcnStatus());
	    	pcta.setPcnSite(pct.getPcnSite());
	    	pcta.setPcnMerchantActivity(pct.getPcnMerchantActivity());
	    	pcta.setImgUrl(pct.getImgUrl());
	    	for(GoodsSpuValue pgs:pgsvdlist){
	    		if(pgs.getPcngsvPctId()==pct.getPcnpctId()){
	    			pcta.setCounterPrice(pgs.getCounterPrice());
	    			pcta.setNetPurchasing(pgs.getNetPurchasing());  			
	    		}	    		
	    	}    	
	    	pcttsList.add(pcta);	    	
	    }
		request.setAttribute("pcttsList", pcttsList);
		request.setAttribute("number",number);
	    request.setAttribute("pageSize",pageSize);
	    request.setAttribute("page", page);
	    request.setAttribute("city", city);
	    request.setAttribute("activity", activity);
	    request.setAttribute("day", day);
	    request.setAttribute("count", count);
		request.getRequestDispatcher("pw.jsp").forward(request, response);		
		
	}
}
