package com.yb.servlet;

import java.io.IOException;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yb.dao.impl.ParentChildThemeDaoImpl;
import com.yb.entity.ParentChildTheme;
import com.yb.vo.ActivityDisplayShowVo;

public class ActivityDisplayShowServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7291620777469061344L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//�������
		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		//ȡֵ
		String curpageStr=request.getParameter("curPage");
		int themeType=1;
	    int page=1;
	    int pageSize=16;
		int show=1;
		if(curpageStr!=null&&curpageStr.trim().length()>0){
	     	page=Integer.parseInt(curpageStr);
	    }
		//��Dao��ѯ����
	    ParentChildThemeDaoImpl parentChildThemeDaoImpl=new ParentChildThemeDaoImpl();
	    List<ParentChildTheme> pctList=parentChildThemeDaoImpl.activityDisplayList(themeType, page, pageSize, show);
	   //��ѯ��ҳ��
	    int count=parentChildThemeDaoImpl.counts(pageSize, show,themeType);
	    //����ѯ���ݸ�����ʾ�ֶη�װ����ͼ�����
	    List<ActivityDisplayShowVo> pctasList=new ArrayList<ActivityDisplayShowVo>(); 
	    for(ParentChildTheme pct:pctList){
	    	ActivityDisplayShowVo adsv=new ActivityDisplayShowVo();
	    	adsv.setPcnpctId(pct.getPcnpctId());
	    	adsv.setPcnpctThemeName(pct.getPcnpctThemeName());
	    	adsv.setPcnpcttId(pct.getPcnpcttId());
	    	adsv.setPcnpctimgUrl(pct.getPcnpctimgUrl());
	    	pctasList.add(adsv);
	    }
	    
	    //��ֵ
	    request.setAttribute("pctasList", pctasList);
	    request.setAttribute("pageSize",pageSize);
	    request.setAttribute("page", page);
	    request.setAttribute("count", count);
	    request.getRequestDispatcher("hdzs.jsp").forward(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);

	}

}
