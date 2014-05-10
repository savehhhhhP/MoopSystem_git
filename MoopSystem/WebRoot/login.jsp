<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="struts" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'login.jsp' starting page</title>

</head>

<body>
	<center>
		<form action="login.action" method="post">
			<h2>登录</h2>
			<p>
				邮箱:<input type="text" name="usermail" /><br>
				密码:<input type="text"
					name="userpassword" /> <br>
					<input class="btn btn-primary" type="submit" value="登录" />
		</form>
	</center>
</body>
</html>
