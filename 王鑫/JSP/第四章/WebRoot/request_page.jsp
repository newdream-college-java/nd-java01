<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>首页</title>
	<script type="text/javascript">
		function choice(){
			var cho = document.getElementsByName("hobby");
			var flag = false;
			for(int i = 0 ; i < cho.length ; i++){
				if(cho[i] == true ){
					flag=true;
					break;
				}
			}
			if(!flag){
				alert("至少选择一项你感兴趣的爱好！")
			}
			return flag;
		}
	</script>

  </head>
  
  <body>
    <form action="request_control.jsp" method="post" onsubmit="return check()">
        <table border="1">
	    	<tr>
	    		<td>请输入您的兴趣爱好</td>
	    	</tr>
	    	<tr>
	    		<td>
		    		<input type="checkbox" name="hobby" value="篮球"/>篮球
		    		<input type="checkbox" name="hobby" value="足球"/>足球
		    		<input type="checkbox" name="hobby" value="电影"/>电影
	    			<input type="checkbox" name="hobby"value="游戏" />游戏
	    		</td>
	    	</tr>  
	    	<tr>
	    		<td>
	    			<input type="submit" value="提交"/>
	    		</td>
	    	</tr>  
    	</table>
    </form>
  </body>
</html>
