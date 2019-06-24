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
        req.setCharacterEncoding("utf-8");//从其他页面转到此页面得到数据的编码
		//从Login.html获得用户名和密码
        String name=req.getParameter("userName");
        String passWord=req.getParameter("passWord");
        //调Dao
        //查询数据库看这个用户名是否唯一
        
        User user =new User();
        user.setUserAccount(name);
        user.setUserPassword(passWord);
        UserDaoImpl udi=new UserDaoImpl();
        udi.login(user);
       
       // System.out.println(name);
       // System.out.println(passWord);
        //登录成功后跳转到首页。有三种方法 (转发(可以带数据)和重定向)
        //这是转发
         PrintWriter out =resp.getWriter();//有了这句代码就可以写html，javascript代码
     //    out.print("<script>javascript:alert('登录成功')</script>");
        //这里做一个判断登录成果的话login(user)函数返回一个值>0则登录成功
        if(udi.login(user)>0){
        	//如果返回值>0那么跳转到首页
        	
       
      //  out.print("<script>javascript:alert('登录成功')</script>");
//        	req.setAttribute("flag", flag);
//        	req.getRequestDispatcher("news-view.jsp").forward(req, res);
        resp.sendRedirect("DoIndex");
        }else{
        	//如果登录失败就跳转到注册页面
       
        //	out.print("<script>javascript:alert('登录失败请先注册')</script>");
        	resp.sendRedirect("register.jsp");
        }

	}                                                                                
}
