<%@ page language="java" import="java.util.*,com.cc.dao.impl.*,com.cc.entity.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>办业务的人</title>
    

  </head>
  
  <body>
    <%
    	//1.编码---（中文）
    	request.setCharacterEncoding("utf-8");// 只对post提交
    	//2.获取表达的值----id
    	String sid = request.getParameter("id");
    	/*字符串转整数 
    		去字符串首位空格：字符串.trim()
    	*/
    int	id = 0;
    	if(sid!=null&&sid.trim().length()>0){
    	 	id = Integer.parseInt(sid);
    	}
    	//3.调用dao ---操作数据  （1）id=0查询全部 （2）id!=0才是根据id查询
    	PersonDaoImpl pd = new PersonDaoImpl();
    List<Person> persons=pd.selectByIdOrAll(id);
    	
    	//4,根据结果跳转
    	if(persons.size()>0){
    		//转发
    		//1.绑定数据
    		request.setAttribute("persons",persons);
    		//2.跳转
    		request.getRequestDispatcher("selectOk.jsp").forward(request, response);
    	}else{
    		out.print("<script>alert('亲，查询的人不存在; 请重新输入编号！');location.href='toSelect.jsp'</script>");
    	}
    
    
     %>
  </body>
</html>
