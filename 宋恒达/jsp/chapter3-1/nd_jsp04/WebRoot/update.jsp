<%@ page language="java"
	import="java.util.*,com.cc.dao.impl.*,com.cc.entity.*,com.cc.dao.*"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>发表的人(有数据的表)</title>
</head>
<%
	//1.得到修改人的id
	String sid = request.getParameter("pid");
	int id = -1;
	if (sid != null && sid.trim().length() > 0) {
		id = Integer.parseInt(sid);
	}
	//2.根据id查询该用户信息
	PersonDao pd = new PersonDaoImpl();
	List<Person> list = pd.selectByIdOrAll(id);

	//3.显示该用户的信息(提供给用户修改)
%>
<body>
	<form action="doUpdate.jsp" method="post">
	<!-- 隐藏域 -->
	<input type="hidden" value="<%=list.get(0).getId()%>" name="pid"/>
	<table align="center" width="60%" border="1">
	<tr>
			
			<td>姓名</td>
			<td>婚否</td>
			<td>年龄</td>
		</tr>
	<%for(Person p:list){  %>
		<tr>
			
			<td>
			<input type="text" value="<%=p.getName()%>" name="pname" />
			</td>
			<td>
				<%if(p.getIsMarried()==0){%>
					<input type="text" value="是" name="isMarried" />
				<%}else{%>
					<input type="text" value="否" name="isMarried" />
				<%}%>
			</td>
			<td>
				<input type="text" value="<%=p.getAge()%>" name="page" />
			</td>
			
		</tr>
	<%} %>
		<tr>
		<td colspan="3" align="center"><input type="submit" value="提   交"/></td>
		<tr/>
	</table>
	</form>
</body>
</html>
