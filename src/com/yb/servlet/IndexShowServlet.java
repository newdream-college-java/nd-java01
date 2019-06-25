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
		//�������
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//��dao
		ParentChildThemeDaoImpl parentChildThemeDaoImpl=new ParentChildThemeDaoImpl();
		GoodsSpuValueDaoImpl goodsSpuValueDaoImpl=new GoodsSpuValueDaoImpl();
		//���ӻ
			int activityThemeType=1;
			int activityPageSize=6;
			//�õ�����	   
		    List<ParentChildTheme> activityShowList=parentChildThemeDaoImpl.parentChildThemeIndexList(activityThemeType, activityPageSize);
		    List<GoodsSpuValue> activityPriceShowlist=goodsSpuValueDaoImpl.PcnGoodsSpuSpecPrice(activityThemeType);
		    List<ParentChildThemeActivityShowVo> activityVoList=new ArrayList<ParentChildThemeActivityShowVo>(); 
		    //��װ����
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
		   
		    
		    
		//��������
			//�õ�����	   
		  
		    
			//ҳ��ֵ
			int curPage=1;
			//ÿҳ��ʾ����
			int pageSize=6;
			int pcnpctTravelDays=0;
			int travelThemeType=2;
			//��ȡpcnpctTravelDays
			String pcnpctTravelDays1=request.getParameter("pcnpctTravelDays");
			//�ж�pcnpctTravelDays1�ǲ��Ƿǿ�
				if(pcnpctTravelDays1!=null&&pcnpctTravelDays1.trim().length()>0){
					//��pcnpctTravelDays1תΪ����
					pcnpctTravelDays=Integer.parseInt(pcnpctTravelDays1);
				}
		  //����ParentChildThemeDaoImpl
			ParentChildThemeDaoImpl p=new ParentChildThemeDaoImpl();
			 ActivityIntroductionDaoImpl travelIntroduction=new ActivityIntroductionDaoImpl();
			List<ParentChildThemeVo> activityIntroductionList=travelIntroduction.activityIntroductionList(travelThemeType);
		  //����ParentChildThemeDaoImpl��list����
			List<ParentChildThemeVo> travelVoList=p.list(curPage, pageSize,pcnpctTravelDays,null);	
		
		//Ʊ��
		    int ticketThemeType=3;
			int ticketPageSize=6;
			//�õ�����	   
			List<ParentChildTheme> ticketShowList=parentChildThemeDaoImpl.parentChildThemeIndexList(ticketThemeType, ticketPageSize);
		    List<GoodsSpuValue> ticketlist=goodsSpuValueDaoImpl.PcnGoodsSpuSpecPrice(ticketThemeType);	
		    List<ParentChildThemeTicketingShowVo> ticketShowVoList=new ArrayList<ParentChildThemeTicketingShowVo>(); 	    
		    //��װ����
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
		
		//�չʾ
		    int displayThemeType=1;
		    int show=1;
			int displayPageSize=8;
		    List<ParentChildTheme> displayList=parentChildThemeDaoImpl.activityDisplayIndexList(displayThemeType,displayPageSize,show);
		    //����ѯ���ݸ�����ʾ�ֶη�װ����ͼ�����
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
