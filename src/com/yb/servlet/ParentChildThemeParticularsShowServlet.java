package com.yb.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.constants.ParentChildNetWorkEnums;
import com.yb.dao.impl.ActivityIntroductionDaoImpl;
import com.yb.dao.impl.ExpenseStandardDaoImpl;
import com.yb.dao.impl.GoodsSpuValueDaoImpl;
import com.yb.dao.impl.ParentChildThemeDaoImpl;
import com.yb.dao.impl.ThemeImageDaoImpl;
import com.yb.dao.impl.TrafficRouteDaoImpl;
import com.yb.entity.ActivityIntroduction;
import com.yb.entity.ExpenseStandard;
import com.yb.entity.GoodsSpuValue;
import com.yb.entity.ParentChildTheme;
import com.yb.entity.ThemeImage;
import com.yb.entity.TrafficRoute;
import com.yb.vo.CopyOfParentChildThemeParticularsShowVo;
import com.yb.vo.ParentChildThemeRecommendVo;
public class ParentChildThemeParticularsShowServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = -904263636110423091L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�������
		response.setContentType("text/html;charset=utf-8");		
		//ȡֵ
		String pctidStr=request.getParameter("pctid");
		Integer pctid=null;	
		//���зǿ��ж�
		if(pctidStr!=null&&pctidStr.trim().length()>0){
			pctid=Integer.parseInt(pctidStr);
		}
		//��Dao
		ParentChildThemeDaoImpl parentChildThemeDaoImpl=new ParentChildThemeDaoImpl();
		ParentChildTheme parentChildTheme=parentChildThemeDaoImpl.parentChildThemeGet(pctid);
		ActivityIntroductionDaoImpl aidi=new ActivityIntroductionDaoImpl();	
		ExpenseStandardDaoImpl esid=new ExpenseStandardDaoImpl();
		ThemeImageDaoImpl tidi=new ThemeImageDaoImpl();
		TrafficRouteDaoImpl trdi=new TrafficRouteDaoImpl();
		
		//�õ����ݿ������
		ActivityIntroduction ai=aidi.activityIntroduction(pctid);
		ExpenseStandard es=esid.expenseStandard(pctid);		
		TrafficRoute tr=trdi.trafficRoute(pctid);
		//�õ����
		CopyOfParentChildThemeParticularsShowVo coctpVo=new CopyOfParentChildThemeParticularsShowVo();
		GoodsSpuValueDaoImpl gsv=new GoodsSpuValueDaoImpl();
		GoodsSpuValue goodsSpuValue=gsv.goodsSpuPrice(pctid);
		
		
		//����ѯ���ݸ�����ʾ�ֶη�װ����ͼ�����
		coctpVo.setPcnpctId(parentChildTheme.getPcnpctId());
		coctpVo.setPcnpctThemeName(parentChildTheme.getPcnpctThemeName());
		coctpVo.setPcnttId(parentChildTheme.getPcnpcttId());
		coctpVo.setPcnpctSite(parentChildTheme.getPcnpctSite());
		coctpVo.setPcnpctRecommend(parentChildTheme.getPcnpctRecommend());
		coctpVo.setPcnpctReason(parentChildTheme.getPcnpctReason());
		coctpVo.setIntroductionContent(ai.getPcnaiContent());
		coctpVo.setIntroductionContentImg(ai.getPcnaiImgurl());
		coctpVo.setExpenseContent(es.getPcnesContent());
		coctpVo.setExpenseContentImg(es.getPcnesImgurl());
		coctpVo.setTrafficRouteContent(tr.getPcntrContent());
		coctpVo.setTrafficRouteContentImg(tr.getPcntrImgurl());
		if(parentChildTheme.getPcnpctTripMode()==ParentChildNetWorkEnums.tripMode.SELF_DRIVING.getCode()){
			coctpVo.setPcnpctTripMode(ParentChildNetWorkEnums.tripMode.SELF_DRIVING.getDesc());
		}else{
			coctpVo.setPcnpctTripMode(ParentChildNetWorkEnums.tripMode.PACKAGE_TOUR.getDesc());
		}
		if(parentChildTheme.getPcnpctTravelDays()==ParentChildNetWorkEnums.playWay.ONE_DAY.getCode()){
			coctpVo.setPcnpctTravelDays(ParentChildNetWorkEnums.playWay.ONE_DAY.getDesc());
		}else if(parentChildTheme.getPcnpctTravelDays()==ParentChildNetWorkEnums.playWay.TWO_DAY.getCode()){
			coctpVo.setPcnpctTravelDays(ParentChildNetWorkEnums.playWay.TWO_DAY.getDesc());
		}else if(parentChildTheme.getPcnpctTravelDays()==ParentChildNetWorkEnums.playWay.AREA_TOURS.getCode()){
			coctpVo.setPcnpctTravelDays(ParentChildNetWorkEnums.playWay.AREA_TOURS.getDesc());
		}else if(parentChildTheme.getPcnpctTravelDays()==ParentChildNetWorkEnums.playWay.DOMESTIC_TOURISM.getCode()){
			coctpVo.setPcnpctTravelDays(ParentChildNetWorkEnums.playWay.DOMESTIC_TOURISM.getDesc());
		}else{
			coctpVo.setPcnpctTravelDays(ParentChildNetWorkEnums.playWay.FOREIGN_TOURISM.getDesc());
		}	
		
		
		
		List<ParentChildTheme> rdList=parentChildThemeDaoImpl.recommendList(parentChildTheme.getPcnpcttId());
		List<ParentChildThemeRecommendVo> recommendList=new ArrayList<ParentChildThemeRecommendVo>();
		for(ParentChildTheme pct: rdList){
			ParentChildThemeRecommendVo rctrVo=new ParentChildThemeRecommendVo();
			rctrVo.setPcnpctId(pct.getPcnpctId());
			rctrVo.setPcnpctThemeName(pct.getPcnpctThemeName());
			rctrVo.setPcnpctimgUrl(pct.getPcnpctimgUrl());
			recommendList.add(rctrVo);
		}
		//�õ���ǰ��������
		Calendar c=Calendar.getInstance();
		List<Date> date=new ArrayList<Date>();
		c.add(Calendar.DATE,1);
		date.add(c.getTime());
		c.add(Calendar.DATE,1);
		date.add(c.getTime());
		//�õ�����ҳ��Ľ���ͼƬ
		List<ThemeImage> themeImageList=tidi.themeImageList(pctid);
		
		
		//��ֵ
		//System.out.println(rdList);
		request.setAttribute("coctpVo", coctpVo);
		request.setAttribute("goodsSpuValue", goodsSpuValue);
		request.setAttribute("date", date);
		request.setAttribute("themeImageList", themeImageList);
		request.setAttribute("recommendList", recommendList);	
		request.getRequestDispatcher("qzhd_1.jsp").forward(request, response);		
	}
}
