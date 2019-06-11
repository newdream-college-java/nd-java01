<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'add_question.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		function a(obj){
			
			if(document.getElementsByName("question").value==null){
				alert("题干不能为空")
				return false;
			}
			return true;
		}
	</script>
  </head>
  
  <body>
    <form action="AddQuesServlet" method="post"  ><!-- onsubmit="return a(this)" -->
    	<table border="1" width="500" align="center">
    		<tr>
    			<td colspan="2" align="center">试题信息</td>
    		</tr>
    		<tr>
    			<td align="right">题干：</td>
    			<td>
    				<textarea cols="50" name="question" id="question"></textarea>
    			</td>
    		</tr>
    		<tr>
    			
    			<td align="right">选项：</td>
    		</tr>
    		<tr>
    			<td align="right">A、</td>
    			<td><textarea cols="50" name="questiona"></textarea></td>
    		</tr>
    		<tr>
    			<td align="right">B、</td>
    			<td><textarea cols="50" name="questionb"></textarea></td>
    		</tr>
    		<tr>
    			<td align="right">C、</td>
    			<td><textarea cols="50" name="questionc"></textarea></td>
    		</tr>
    		<tr>
    			<td align="right">D、</td>
    			<td><textarea cols="50" name="questiond"></textarea></td>
    		</tr>
    		<tr>
    			<td align="right">科目：</td>
    			<td>
    				<select name="subject">
    					<option value="1">JSP</option>
    					<option value="2">OOP</option>
    					<option value="3">Javascript</option>
    				</select>
    			</td>
    		</tr>
    		<tr>
    			<td align="right">正确答案：</td>
    			<td>
    				<input type="text" name="answer" />
    			</td>
    		</tr>
    		<tr>
    			<td align="center" colspan="2">
    				<input type="submit" value="添加" onmouseup==E  />
    				<input type="reset"  />
    			</td>
    			
    		</tr>
    	</table>
    </form>
  </body>
</html>
