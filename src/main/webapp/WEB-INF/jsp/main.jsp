<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">



<title>登录</title>

</head>
<body>


	<p style="text-align: center;">
		您已登录成功，用户名是：<%=session.getAttribute("userName") %>,创建该session的服务器端口是：<%=session.getAttribute("sessionPort") %>,
		本次登录的时间为：<%=new Date(session.getCreationTime()) %>
	</p>
	<p style="text-align: center;">
		本次请求处理的服务器的端口为：<%=request.getLocalPort()%>
	</p>
	<form action="doLogin.do">
		<input type="submit" value="刷新"/>
	</form>
	<form action="logout.do">
		<input type="submit" value="登出"/>
	</form>
	
</body>
</html>