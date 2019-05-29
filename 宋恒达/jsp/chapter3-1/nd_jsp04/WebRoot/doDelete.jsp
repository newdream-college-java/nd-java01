<%@ page language="java" import="java.util.*,com.cc.entity.*,com.cc.dao.impl.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head> 
    <title>My JSP 'doDelete.jsp' starting page</title>
  </head>
  <body>
    <%
    		//1,编码----提交（get）   浏览(utf-8)------request(iso-8859-1)------服务器(jsp--utf-8)
    		//request.setCharacterEncoding("utf-8");//post有效
    		
    		//技术点1：get如果解决编码问题---1.取到值  2，对值进行编码
    		
    		//2.取值
    		String uname = request.getParameter("uname");
    		uname = new String(uname.getBytes("iso-8859-1"),"utf-8");//get提交解决编码问题
    		out.println("uname===="+uname);
    		//3.调dao  调用dao 删除方法
    		PersonDaoImpl pdl = new PersonDaoImpl();
    		int result = pdl.deleteByName(uname);
    		//4,跳转
    		if(result>0){
    			//重定向---不需要带数据
    			response.sendRedirect("deleteOk.jsp");
    		}else{
    			out.println("<script>alert('没有改用户，删除失败！');location.href='toDelete.jsp'</script>");
    		}
    
    
    
    
     %>
  </body>
</html>
