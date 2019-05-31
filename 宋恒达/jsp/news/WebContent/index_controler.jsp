<%@page
	import="com.sun.scenario.effect.impl.state.LinearConvolveRenderState.PassType"%>
<%@page import="java.util.Set"%>
<%@page import="cn.song.dao.impl.NewsDaoImpl"%>
<%@page import="cn.song.dao.NewsDao"%>
<%@page import="java.util.HashMap"%>
<%@page import="cn.song.entity.News"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		NewsDao newsDao = new NewsDaoImpl();
		Map<Integer, News> maps = new HashMap<>();
		Map<Integer, News> allNews = newsDao.showAllNews();
		Set<Integer> keys = allNews.keySet();
		int i = 0;
		for (Integer key : keys) {
			i++;
		}
		int nPage = 1;
		int pageSize = 3;
		int lastPage = 0;
		if (i % pageSize > 0) {
			lastPage = i / pageSize + 1;
		} else {
			lastPage = i / pageSize;
		}

		if (request.getParameter("nPage") != null) {
			if (Integer.parseInt(request.getParameter("nPage")) <= 0) {
				nPage = 1;
			} else if (Integer.parseInt(request.getParameter("nPage"))  >= lastPage) {
				nPage = lastPage;
			} else {
				nPage = Integer.parseInt(request.getParameter("nPage"));
			}
		}
		maps = newsDao.showAllNews(nPage, pageSize);
		request.setAttribute("lastPage", lastPage);
		request.setAttribute("nPage", nPage);
		request.setAttribute("news", maps);
		request.getRequestDispatcher("index.jsp").forward(request, response);
	%>
</body>
</html>