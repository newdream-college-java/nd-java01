package com.yb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.ParentChildThemeDaoImpl;
import com.yb.dao.impl.PcnGoodsSpuValueDaoImpl;
import com.yb.entity.ParentChildTheme;
import com.yb.entity.PcnGoodsSpuValue;
import com.yb.vo.ParentChildThemeActivityShowVo;

public class ParentChildThemeActivityShowServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");		
		ParentChildThemeDaoImpl pctdi=new ParentChildThemeDaoImpl();
	    PcnGoodsSpuValueDaoImpl pgsvd=new PcnGoodsSpuValueDaoImpl();
		String curpage=request.getParameter("curPage");
		String cityStr=request.getParameter("city");
		String activityStr=request.getParameter("activity");
		String dayStr=request.getParameter("curday");
		int themeType=1;
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
	    int count=pctdi.count(themeType,pageSize,city,activity,day);
	    int sum=pctdi.countSum(themeType);
	    System.out.println(sum);
	    List<ParentChildTheme> pctList=pctdi.parentChildThemeList(themeType,page, pageSize, city, activity, day); 
	    List<ParentChildThemeActivityShowVo> pctasList=new ArrayList<ParentChildThemeActivityShowVo>(); 	    
	    List<PcnGoodsSpuValue> pgsvdlist=pgsvd.PcnGoodsSpuSpecPrice();
	    
	    for(ParentChildTheme pct:pctList){
	    	ParentChildThemeActivityShowVo pcta=new ParentChildThemeActivityShowVo();
	    	pcta.setPcnpctId(pct.getPcnpctId());
	    	pcta.setPcnThemeName(pct.getPcnThemeName());
	    	pcta.setPcnStartTime(pct.getPcnStartTime());
	    	pcta.setPcnEndTime(pct.getPcnEndTime());
	    	pcta.setPcnStatus(pct.getPcnStatus());
	    	pcta.setPcnSite(pct.getPcnSite());
	    	pcta.setPcnMerchantActivity(pct.getPcnMerchantActivity());
	    	pcta.setImgUrl(pct.getImgUrl());
	    	for(PcnGoodsSpuValue pgs:pgsvdlist){
	    		if(pgs.getPcngssPctId()==pct.getPcnpctId()){
	    			pcta.setPrice(pgs.getPrice());
	    		}	    		
	    	}    	
	    	pctasList.add(pcta);	    	
	    }		   
		request.setAttribute("pctasList", pctasList);
		request.setAttribute("count",count);
	    request.setAttribute("pageSize",pageSize);
	    request.setAttribute("page", page);
	    request.setAttribute("city", city);
	    request.setAttribute("activity", activity);
	    request.setAttribute("day", day);
	    request.setAttribute("sum", sum);
		request.getRequestDispatcher("qzhd.jsp").forward(request, response);		
	}

}
