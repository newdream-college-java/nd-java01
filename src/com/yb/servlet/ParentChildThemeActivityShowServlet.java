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
import com.yb.vo.ParentChildThemeActivityShowVo;

public class ParentChildThemeActivityShowServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8438647714812630740L;
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		//解决编码
		response.setContentType("text/html;charset=utf-8");	
		request.setCharacterEncoding("utf-8");
		//取值
		String curpageStr=request.getParameter("curPage");
		String cityStr=request.getParameter("city");
		String activityStr=request.getParameter("activity");
		String dayStr=request.getParameter("curday");
		String nameStr=request.getParameter("name");
		String namesStr=request.getParameter("names");
		int themeType=1;//主题类型
	    int page=1;
	    int pageSize=9;
	    String city=null;
	    Integer activity=null;
	    Integer day=null;
	    String name=null;
	    
	    //条件判断传过来的值是否为空,不为空的时候再赋予值
	    if(curpageStr!=null&&curpageStr.trim().length()>0){
	     	page=Integer.parseInt(curpageStr);
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
	    //调Dao查询数据
	    ParentChildThemeDaoImpl parentChildThemeDaoImpl=new ParentChildThemeDaoImpl();
	    GoodsSpuValueDaoImpl goodsSpuValueDaoImpl=new GoodsSpuValueDaoImpl();
	    Map<String,Integer> numbers=parentChildThemeDaoImpl.numbers(themeType,pageSize,city,activity,day,name);	   
	    List<ParentChildTheme> pctList=parentChildThemeDaoImpl.parentChildThemeList(themeType,page, pageSize, city, activity, day,name); 
	    	    
	    List<GoodsSpuValue> pgsvdlist=goodsSpuValueDaoImpl.PcnGoodsSpuSpecPrice(themeType);
	    int count=numbers.get("count");
	    int number=numbers.get("number");
	    //将查询数据根据显示字段封装到视图层对象
	    List<ParentChildThemeActivityShowVo> pctasList=new ArrayList<ParentChildThemeActivityShowVo>(); 
	    for(ParentChildTheme pct:pctList){
	    	ParentChildThemeActivityShowVo pctasVo=new ParentChildThemeActivityShowVo();
	    	pctasVo.setPcnpctId(pct.getPcnpctId());
	    	pctasVo.setPcnThemeName(pct.getPcnpctThemeName());
	    	pctasVo.setPcnStartTime(pct.getPcnpctStartTime());
	    	pctasVo.setPcnEndTime(pct.getPcnpctEndTime());
	    	pctasVo.setPcnStatus(pct.getPcnpctStatus());
	    	pctasVo.setPcnSite(pct.getPcnpctSite());
	    	pctasVo.setPcnMerchantActivity(pct.getPcnpctMerchantActivity());
	    	pctasVo.setImgUrl(pct.getPcnpctimgUrl());
	    	for(GoodsSpuValue pgs:pgsvdlist){
	    		if(pgs.getPcngsvPctId()==pct.getPcnpctId()){
	    			pctasVo.setPrice(pgs.getLargePriceAndSmallPrice());
	    		}	    		
	    	}    	
	    	pctasList.add(pctasVo);	    	
	    }
	    
	    
	    //传值
		request.setAttribute("pctasList", pctasList);
		request.setAttribute("number",number);
	    request.setAttribute("pageSize",pageSize);
	    request.setAttribute("page", page);
	    request.setAttribute("city", city);
	    request.setAttribute("activity", activity);
	    request.setAttribute("day", day);
	    request.setAttribute("count", count);
	    request.setAttribute("name", name);
		request.getRequestDispatcher("qzhd.jsp").forward(request, response);		
	}
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
