package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import dao.BaseDao;
import dao.impl.UserDaoImpl;
import dao.impl.UserImpl;
import entity.User;

public class DoLogin implements Servlet{

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	public void service(ServletRequest req, ServletResponse res)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html;charset=utf-8");
        HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//������ҳ��ת����ҳ��õ����ݵı���
		//��Login.html����û���������
        String name=req.getParameter("userName");
        String passWord=req.getParameter("passWord");
        //��Dao
        //��ѯ���ݿ⿴����û����Ƿ�Ψһ
        
        User user =new User();
        user.setUserAccount(name);
        user.setUserPassword(passWord);
        UserDaoImpl udi=new UserDaoImpl();
        udi.login(user);
       
       // System.out.println(name);
       // System.out.println(passWord);
        //��¼�ɹ�����ת����ҳ�������ַ��� (ת��(���Դ�����)���ض���)
        //����ת��
         PrintWriter out =resp.getWriter();//����������Ϳ���дhtml��javascript����
     //    out.print("<script>javascript:alert('��¼�ɹ�')</script>");
        //������һ���жϵ�¼�ɹ��Ļ�login(user)��������һ��ֵ>0���¼�ɹ�
        if(udi.login(user)>0){
        	//�������ֵ>0��ô��ת����ҳ
        	
       
      //  out.print("<script>javascript:alert('��¼�ɹ�')</script>");
//        	req.setAttribute("flag", flag);
//        	req.getRequestDispatcher("news-view.jsp").forward(req, res);
        resp.sendRedirect("DoIndex");
        }else{
        	//�����¼ʧ�ܾ���ת��ע��ҳ��
       
        //	out.print("<script>javascript:alert('��¼ʧ������ע��')</script>");
        	resp.sendRedirect("register.jsp");
        }

	}                                                                                
}
