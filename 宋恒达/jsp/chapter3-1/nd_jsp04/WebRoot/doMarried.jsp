<%@ page language="java" import="java.util.*,com.cc.dao.impl.*,com.cc.entity.*,com.cc.po.*" pageEncoding="utf-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>2.办业务的人</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
  </head>
  
  <body>
    <%
    		//1.设置resquest的编码
    		request.setCharacterEncoding("utf-8");// 这句代码是对post提交有效
    		//2.拿到表格的数据  数据在request对象上
    		String sname = request.getParameter("pname");//表单元素的name值
    		String sage = request.getParameter("page");
    		
    		//字符串转整数
    		int age = Integer.parseInt(sage);
    		//封装数据
    		Person person = new Person(sname,0,age);
    		//out.print("doMarried.jsp拿到数据："+sname+"\t"+sage);
    		//3.调dao方法，操作数据
    		PersonDaoImpl pdao  =new PersonDaoImpl();
    		int result = pdao.save(person);
    		
    		//4.根据操作，提示用户到哪里拿结果。
    		if(result>0){
    			//告诉他到 marriedOk.jsp这个人这里拿证
    			//跳转的方式一：重定向
    			//response.sendRedirect("MarriedOk.jsp");
    			//跳转的方式二：转发
    			//A:不带数据转发
    			//request.getRequestDispatcher("MarriedOk.jsp").forward(request, response);
    			//B:带数据转发
    			//1)绑定数据(一次绑定多个数据)
    			request.setAttribute("money", 100*100*100);//key-value :key只能为字符串  value可以为任意类型
    			request.setAttribute("girl", new Girl("如花"));
    			//2)转发
    			request.getRequestDispatcher("MarriedOk.jsp").forward(request, response);
    			
    		}else{
    			out.print("<script>javascript:alert('小伙子，你不是结婚了吗？');location.href='index.jsp'</script>");
    		}
    
      %>
  </body>
</html>
