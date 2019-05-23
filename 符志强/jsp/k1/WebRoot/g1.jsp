<%@ page language="java" import="java.util.*,zuoye.*" pageEncoding="utf-8"%>


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
    		String sm = request.getParameter("pm");
    		String sid = request.getParameter("pid");
    		//字符串转整数
    		int age = Integer.parseInt(sage);
    		int m = Integer.parseInt(sm);
    		int id = Integer.parseInt(sid);
    		//封装数据
    		Person person = new Person(id,sname,m,age);
    		//3.调dao方法，操作数据zz
    		PersonDaoImpl pdao  =new PersonDaoImpl();
    		int r = pdao.save2(person);
    		System.out.print(r);
    		//4.根据操作，提示用户到哪里拿结果。
    		if(r>0){
    			//告诉他到 z2.jsp这个人这里查看
    			response.sendRedirect("g2.jsp");
    		}else{
    			out.print("<script>javascript:alert('没有你要修改的人的信息');location.href='index.jsp'</script>");
    		}
    
      %>
  </body>
</html>
