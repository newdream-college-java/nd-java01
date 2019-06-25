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
	/**
	 * 
	 */
	private static final long serialVersionUID = -27356193335785004L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//�������
		response.setContentType("text/html;charset=utf-8");	
		request.setCharacterEncoding("utf-8");
		//ȡֵ
		String curpage=request.getParameter("curPage");//ҳ��
		String cityStr=request.getParameter("city");//����
		String activityStr=request.getParameter("activity");//�̼һ
		String dayStr=request.getParameter("curday");//����
		String nameStr=request.getParameter("name");//������ֵ
		String namesStr=request.getParameter("names");//ҳ�洫����������ֵ
		int themeType=3;//����
	    int page=1;
	    int pageSize=9;
	    String city=null;
	    Integer activity=null;
	    Integer day=null;
	   String name=null;
	    //���õ���ֵ���зǿ��ж�
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
	    if(nameStr!=null&&nameStr.trim().length()>0){
	    	name=nameStr;
	    }
	    if(namesStr!=null&&namesStr.trim().length()>0){
	    	name=new String(namesStr.getBytes("iso-8859-1"), "utf-8");
	    }
	    //��Dao
	    ParentChildThemeDaoImpl parentChildThemeDaoImpl=new ParentChildThemeDaoImpl();
	    GoodsSpuValueDaoImpl goodsSpuValueDaoImpl=new GoodsSpuValueDaoImpl();
	    Map<String,Integer> numbers=parentChildThemeDaoImpl.numbers(themeType,pageSize,city,activity,day,name);  
	    List<ParentChildTheme> pctList=parentChildThemeDaoImpl.parentChildThemeList(themeType,page, pageSize, city, activity,day,name); 
	    List<ParentChildThemeTicketingShowVo> pcttsList=new ArrayList<ParentChildThemeTicketingShowVo>(); 	    
	    List<GoodsSpuValue> pgsvdlist=goodsSpuValueDaoImpl.PcnGoodsSpuSpecPrice(themeType);	 
	    int count=numbers.get("count");
	    int number=numbers.get("number");
	    
	    //����ѯ���ݸ�����ʾ�ֶη�װ����ͼ�����
	    for(ParentChildTheme pct:pctList){
	    	ParentChildThemeTicketingShowVo pctsVo=new ParentChildThemeTicketingShowVo();
	    	pctsVo.setPcnpctId(pct.getPcnpctId());
	    	pctsVo.setPcnThemeName(pct.getPcnpctThemeName());
	    	pctsVo.setPcnStartTime(pct.getPcnpctStartTime());
	    	pctsVo.setPcnEndTime(pct.getPcnpctEndTime());
	    	pctsVo.setPcnStatus(pct.getPcnpctStatus());
	    	pctsVo.setPcnSite(pct.getPcnpctSite());
	    	pctsVo.setPcnMerchantActivity(pct.getPcnpctMerchantActivity());
	    	pctsVo.setImgUrl(pct.getPcnpctimgUrl());
	    	for(GoodsSpuValue pgs:pgsvdlist){
	    		if(pgs.getPcngsvPctId()==pct.getPcnpctId()){
	    			pctsVo.setStorePrice(pgs.getStorePrice());
	    			pctsVo.setAdultPrice(pgs.getAdultPrice());  			
	    		}	    		
	    	}    	
	    	pcttsList.add(pctsVo);	    	
	    }
	    
	    //��ֵ
		request.setAttribute("pcttsList", pcttsList);
		request.setAttribute("number",number);
	    request.setAttribute("pageSize",pageSize);
	    request.setAttribute("page", page);
	    request.setAttribute("city", city);
	    request.setAttribute("activity", activity);
	    request.setAttribute("day", day);
	    request.setAttribute("count", count);
	    request.setAttribute("name", name);
		request.getRequestDispatcher("pw.jsp").forward(request, response);		
		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
