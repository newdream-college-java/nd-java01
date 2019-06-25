package com.yb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.ActivityIntroductionDaoImpl;
import com.yb.dao.impl.GoodsSpuValueDaoImpl;
import com.yb.dao.impl.ParentChildThemeDaoImpl;
import com.yb.entity.GoodsSpuValue;
import com.yb.entity.ParentChildTheme;
import com.yb.vo.ActivityDisplayShowVo;
import com.yb.vo.ParentChildThemeActivityShowVo;
import com.yb.vo.ParentChildThemeTicketingShowVo;
import com.yb.vo.ParentChildThemeVo;

public class IndexShowServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4934697576258908382L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//解决编码
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//调dao
		ParentChildThemeDaoImpl parentChildThemeDaoImpl=new ParentChildThemeDaoImpl();
		GoodsSpuValueDaoImpl goodsSpuValueDaoImpl=new GoodsSpuValueDaoImpl();
		//亲子活动
			int activityThemeType=1;
			int activityPageSize=6;
			//得到数据	   
		    List<ParentChildTheme> activityShowList=parentChildThemeDaoImpl.parentChildThemeIndexList(activityThemeType, activityPageSize);
		    List<GoodsSpuValue> activityPriceShowlist=goodsSpuValueDaoImpl.PcnGoodsSpuSpecPrice(activityThemeType);
		    List<ParentChildThemeActivityShowVo> activityVoList=new ArrayList<ParentChildThemeActivityShowVo>(); 
		    //封装数据
		    for(ParentChildTheme pct:activityShowList){
		    	ParentChildThemeActivityShowVo pctasVo=new ParentChildThemeActivityShowVo();
		    	pctasVo.setPcnpctId(pct.getPcnpctId());
		    	pctasVo.setPcnThemeName(pct.getPcnpctThemeName());
		    	pctasVo.setPcnStartTime(pct.getPcnpctStartTime());
		    	pctasVo.setPcnEndTime(pct.getPcnpctEndTime());
		    	pctasVo.setPcnStatus(pct.getPcnpctStatus());
		    	pctasVo.setPcnSite(pct.getPcnpctSite());
		    	pctasVo.setPcnMerchantActivity(pct.getPcnpctMerchantActivity());
		    	pctasVo.setImgUrl(pct.getPcnpctimgUrl());
		    	for(GoodsSpuValue pgs:activityPriceShowlist){
		    		if(pgs.getPcngsvPctId()==pct.getPcnpctId()){
		    			pctasVo.setPrice(pgs.getLargePriceAndSmallPrice());
		    		}	    		
		    	}    	
		    	activityVoList.add(pctasVo);	    	
		    }
		   
		    
		    
		//亲子旅游
			//得到数据	   
		  
		    
			//页的值
			int curPage=1;
			//每页显示个数
			int pageSize=6;
			int pcnpctTravelDays=0;
			int travelThemeType=2;
			//获取pcnpctTravelDays
			String pcnpctTravelDays1=request.getParameter("pcnpctTravelDays");
			//判断pcnpctTravelDays1是不是非空
				if(pcnpctTravelDays1!=null&&pcnpctTravelDays1.trim().length()>0){
					//把pcnpctTravelDays1转为整数
					pcnpctTravelDays=Integer.parseInt(pcnpctTravelDays1);
				}
		  //调用ParentChildThemeDaoImpl
			ParentChildThemeDaoImpl p=new ParentChildThemeDaoImpl();
			 ActivityIntroductionDaoImpl travelIntroduction=new ActivityIntroductionDaoImpl();
			List<ParentChildThemeVo> activityIntroductionList=travelIntroduction.activityIntroductionList(travelThemeType);
		  //调用ParentChildThemeDaoImpl的list方法
			List<ParentChildThemeVo> travelVoList=p.list(curPage, pageSize,pcnpctTravelDays,null);	
		
		//票务
		    int ticketThemeType=3;
			int ticketPageSize=6;
			//得到数据	   
			List<ParentChildTheme> ticketShowList=parentChildThemeDaoImpl.parentChildThemeIndexList(ticketThemeType, ticketPageSize);
		    List<GoodsSpuValue> ticketlist=goodsSpuValueDaoImpl.PcnGoodsSpuSpecPrice(ticketThemeType);	
		    List<ParentChildThemeTicketingShowVo> ticketShowVoList=new ArrayList<ParentChildThemeTicketingShowVo>(); 	    
		    //封装数据
		    for(ParentChildTheme pct:ticketShowList){
		    	ParentChildThemeTicketingShowVo pctsVo=new ParentChildThemeTicketingShowVo();
		    	pctsVo.setPcnpctId(pct.getPcnpctId());
		    	pctsVo.setPcnThemeName(pct.getPcnpctThemeName());
		    	pctsVo.setPcnStartTime(pct.getPcnpctStartTime());
		    	pctsVo.setPcnEndTime(pct.getPcnpctEndTime());
		    	pctsVo.setPcnStatus(pct.getPcnpctStatus());
		    	pctsVo.setPcnSite(pct.getPcnpctSite());
		    	pctsVo.setPcnMerchantActivity(pct.getPcnpctMerchantActivity());
		    	pctsVo.setImgUrl(pct.getPcnpctimgUrl());
		    	for(GoodsSpuValue pgs:ticketlist){
		    		if(pgs.getPcngsvPctId()==pct.getPcnpctId()){
		    			pctsVo.setStorePrice(pgs.getStorePrice());
		    			pctsVo.setAdultPrice(pgs.getAdultPrice());  			
		    		}	    		
		    	}    	
		    	ticketShowVoList.add(pctsVo);	    	
		    }
		
		//活动展示
		    int displayThemeType=1;
		    int show=1;
			int displayPageSize=8;
		    List<ParentChildTheme> displayList=parentChildThemeDaoImpl.activityDisplayIndexList(displayThemeType,displayPageSize,show);
		    //将查询数据根据显示字段封装到视图层对象
		    List<ActivityDisplayShowVo> displayShowVoList=new ArrayList<ActivityDisplayShowVo>(); 
		    for(ParentChildTheme pct:displayList){
		    	ActivityDisplayShowVo adsv=new ActivityDisplayShowVo();
		    	adsv.setPcnpctId(pct.getPcnpctId());
		    	adsv.setPcnpctThemeName(pct.getPcnpctThemeName());
		    	adsv.setPcnpcttId(pct.getPcnpcttId());
		    	adsv.setPcnpctimgUrl(pct.getPcnpctimgUrl());
		    	displayShowVoList.add(adsv);
		    }
		
		    
		request.setAttribute("activityVoList", activityVoList);	
		request.setAttribute("pcnpctTravelDays", pcnpctTravelDays);
		request.setAttribute("travelVoList", travelVoList);
		request.setAttribute("activityIntroductionList", activityIntroductionList);	
		request.setAttribute("ticketShowVoList", ticketShowVoList);
		request.setAttribute("displayShowVoList", displayShowVoList);
		request.getRequestDispatcher("index.jsp").forward(request, response);		

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
