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
		//�ı���
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		//ҳ��ֵ
		int curPage=1;
		//ÿҳ��ʾ����
		int pageSize=12;
		//��ȡcurPage
		String ScurPage=request.getParameter("curPage");
		String nameStr=request.getParameter("name");//������ֵ
		String namesStr=request.getParameter("names");//ҳ�洫����������ֵ
		//�ж�ScurPage�ǲ��Ƿǿ�
		
		if(ScurPage!=null&&ScurPage.trim().length()>0){
			//��ScurPageתΪ����
			curPage=Integer.parseInt(ScurPage);
		}
		//���ε�ʱ��͵���
		int pcnpctTravelDays=0;
		
		//����ģ����ѯ�ֶ�
		String name=null;
		//��ȡpcnpctTravelDays
		String pcnpctTravelDays1=request.getParameter("pcnpctTravelDays");
		//�ж�pcnpctTravelDays1�ǲ��Ƿǿ�
		if(pcnpctTravelDays1!=null&&pcnpctTravelDays1.trim().length()>0){
			//��pcnpctTravelDays1תΪ����
			pcnpctTravelDays=Integer.parseInt(pcnpctTravelDays1);
		}
		 if(nameStr!=null&&nameStr.trim().length()>0){
		    	name=nameStr;
		    }
		 if(namesStr!=null&&namesStr.trim().length()>0){
		    	name=new String(namesStr.getBytes("iso-8859-1"), "utf-8");
		 }
		
		//����ParentChildThemeDaoImpl
		ParentChildThemeDaoImpl p=new ParentChildThemeDaoImpl();
		//����ParentChildThemeDaoImpl��list����
		List<ParentChildThemeVo> list=p.list(curPage, pageSize,pcnpctTravelDays,name);	
		//����ParentChildThemeDaoImpl��getcount����
		int count=p.getcount(pageSize,pcnpctTravelDays,name);
		//System.out.println(count);
		
		//�ж�list�ǲ���Ϊ��
			//���ε�ʱ��͵���ֵ
			request.setAttribute("pcnpctTravelDays", pcnpctTravelDays);
			request.setAttribute("TravelDays", pcnpctTravelDays1);
			//��������
			request.setAttribute("Travellist", list);
			//ҳ��ֵ
			
			request.setAttribute("curPage",curPage);
			//ÿҳ��ʾ��
			request.setAttribute("pageSize",pageSize);
			//����ʾ��
			request.setAttribute("count", count);
			
			 request.setAttribute("name", name);
			//��ת
			request.getRequestDispatcher("qzly.jsp").forward(request, response);
	}


	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);

	}

}
