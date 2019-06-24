package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

import dao.impl.UserDaoImpl;

import entity.User;

public class DoRegist implements Servlet {

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
		res.setContentType("text/html;charset=utf-8");
        HttpServletResponse resp = (HttpServletResponse)res;
        req.setCharacterEncoding("utf-8");//从其他页面转到此页面得到数据的编码
        PrintWriter out =resp.getWriter();//写out代码
        String Account=req.getParameter("userName");
        String realName=req.getParameter("realName");
        String passWord=req.getParameter("passWord");
        String rePassWord=req.getParameter("rePassWord");
        String sex=req.getParameter("gender");
        String birthyear=req.getParameter("birthyear");
        String birthmonth=req.getParameter("birthmonth");
        String birthday=req.getParameter("birthday");
        String identityCode=req.getParameter("identityCode");
        String email=req.getParameter("email");
       	String userPhone=req.getParameter("mobile");
        String address=req.getParameter("address");
		User user = new User();
		user.setUserAccount(Account);
		user.setUserAddress(address);
		String userBirthday=birthyear+"-"+birthmonth+"-"+birthday;
		user.setUserBirthday(userBirthday);
		user.setUserEmail(email);
		user.setUserIdCard(identityCode);
		user.setUserName(realName);
		//调Dao
		
		if(passWord.equals(rePassWord)){
			user.setUserPassword(passWord);
		}else{
			out.print("密码不一致请重新输入");
		}
		int phone = Integer.parseInt(userPhone,10);
		user.setUserPhone(phone);
		if(sex.equals("男")){
			user.setUserSex(1);
		}else{
			user.setUserSex(2);
		}
		System.out.println(user);
		UserDaoImpl udi= new UserDaoImpl();
		udi.addUser(user);
		 req.getRequestDispatcher("reg-result.jsp").forward(req, res);
		
		
	}

}
