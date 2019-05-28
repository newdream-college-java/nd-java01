<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'request_page.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script type="text/javascript"> 
function selectOne() {
			var names = document.getElementsByName("hobby");          
            var flag = false ;//标记判断是否选中一个               
            for(var i=0;i<names.length;i++){
                if(names[i].checked){
                        flag = true ;
                        break ;
                 }
             }
             if(!flag){
                alert("请最少选择一项！");
                return false ;
             }
		}

   </script>

  </head>
  
  <body>
    <form action="request_control.jsp" method="post" onsubmit="return selectOne()">
    	请输入您的兴趣爱好<br>
    	<input type="checkbox" name="hobby" value="篮球"/>篮球
    	<input type="checkbox" name="hobby" value="足球"/>足球
    	<input type="checkbox" name="hobby" value="电影"/>电影
    	<input type="checkbox" name="hobby" value="游戏"/>游戏
    	<br>
    	<input type="submit" value="提交" />
    </form>
  </body>
</html>
