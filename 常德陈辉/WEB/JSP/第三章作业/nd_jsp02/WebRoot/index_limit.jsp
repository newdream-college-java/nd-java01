<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ include file="commot/taglib.jsp" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<title>My JSP 'index_limit.jsp' starting page</title>
	</head>

	<body>
		<%
			//1.编码

			//2.取值(第1次请求分页 不需要取值 )
			/*默认查询第1页*/
			int curPage = 1;
			/*默认每页查询5条*/
			int pageSize = 3;
			//不是第1次请求
			String sCurPage = request.getParameter("curPage");
			if (sCurPage != null) {
				curPage = Integer.parseInt(sCurPage);
			}
			//3.调dao:调分页查询的方法
			NewsDao nd = new NewsDaoImpl();
			List<News> news = nd.news(curPage, pageSize);
			int last=nd.last(pageSize);
			request.setAttribute("last", last);
			//4.跳转到首页index.jsp
			if (news.size() > 0) {
				//获取到第1页的数据
				//转发
				//绑定当前页数据
				request.setAttribute("news", news);
				//绑定当前页
				request.setAttribute("curPage", curPage);
				request.getRequestDispatcher("index.jsp").forward(request,
						response);
			} else {
				//没有查询到数据的处理
			}
		%>
	</body>
</html>
