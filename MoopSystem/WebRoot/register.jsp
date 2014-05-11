<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="/struts-tags" prefix="struts"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="author" content="">
<link rel="shortcut icon" href="../../docs-assets/ico/favicon.png">
<!-- Bootstrap core CSS -->
<link href="css/bootstrap-3.1.1-dist/css/bootstrap.css" rel="stylesheet">

</head>

<!-- 
  <center>
    <struts:form action="register.action" method="post">
    <struts:textfield name="user.email" key="register.jsp.label.email"/>
    <struts:textfield name="user.name" key="register.jsp.label.username"/>
    <struts:password name="user.psw1" key="register.jsp.label.psw1"/>
    <struts:password name="user.psw2" key="register.jsp.label.psw2"/>
    <struts:textfield name="user.checkcode" key="register.jsp.label.checkcode"></struts:textfield>
    <struts:textfield name="user.number" key="register.jsp.label.number"/>
    <struts:submit key="register.jsp.button.submit"/>
    </struts:form>
    </center>
 -->

<body>

	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">项目流程化管理系统 MOOP</a>
			</div>
			<div class="navbar-collapse collapse">
				<form class="navbar-form navbar-right" action="register.action" method="post">
					<div class="form-group">
						<input type="text" placeholder="Email" name="userEmail" class="form-control">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" name="userPsw" class="form-control">
					</div>
					<button type="submit" value="login" class="btn btn-success">登陆</button>
				</form>
				
			</div>
			<!--/.navbar-collapse --> 
		</div>
	</div>


	<center style="background:#EAEAEA">
		<div class="container">
			<div class="row row-6"
				style="margin-top:80px;height:600px;width:700px;">


				<div class="panel panel-default panel-page" style="margin-left:0;text-align:left;">
					<div class="panel-heading" style="margin:30px;background:white;">
						<h2>注册</h2>
						<form id="register-form" method="post" action="register">
							<div class="form-group">
								<label class="control-label required" for="user.email">邮箱地址</label>
								<div>
									<input type="text" id="user.email" required="required" name="user.email" 
									  class="form-control" data-explain="填写你常用的邮箱作为登录帐号">
									<p class="help-block">填写你常用的邮箱作为登录帐号</p>
								</div>
							</div>
							<div class="form-group">
								<label class="control-label required" for="register_nickname">昵称</label>
								<div class="controls">
									<input type="text" id="user.name" required="required"
										name="user.name" class="form-control"
										data-url="/register/nickname/check" data-widget-cid="widget-4"
										data-explain="该怎么称呼你？ 中、英文均可，最长14个英文或7个汉字">
									<p class="help-block">该怎么称呼你？ 中、英文均可，最长20个英文或10个汉字</p>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label required" for="register_password">密码</label>
								<div class="controls">
									<input type="password" id="user.psw1" required="required"
										name="user.psw1" class="form-control"
										data-widget-cid="widget-2" data-explain="5-20位英文、数字、符号，区分大小写">
									<p class="help-block">10位英文、数字、符号，区分大小写</p>
								</div>
							</div>

							<div class="form-group">
								<label class="control-label required"
									for="register_confirmPassword">确认密码</label>
								<div class="controls">
									<input type="password" id="user.psw2" required="required"
										name="user.psw2" class="form-control"
										data-widget-cid="widget-3" data-explain="再输入一次密码">
									<p class="help-block">再输入一次密码</p>
								</div>
							</div>

							<div class="form-group">
								<div class="controls">
									<input type="hidden" id="register__token"
										name="register[_token]"
										value="80e3d631bd8881383ae6fa395c660474fcf973c4">
									<button type="submit"
										class="btn btn-primary btn-large btn-block">注册</button>
								</div>
							</div>

							<input type="hidden" name="_csrf_token"
								value="5940af447c67d1d67195a2e7685aad37822cffe6">

						</form>

					</div>
				</div>
			</div>
		</div>
	</center>

	<footer>
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div>
					<center>©MR.L</center>
					<br>
					<center>出品时间：2014年5月 联系我们：1354487211</center>
				</div>
			</div>
		</div>
	</div>
	</footer>



	<!-- Bootstrap core JavaScript
    ================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
</body>
</html>
