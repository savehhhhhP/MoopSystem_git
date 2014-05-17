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
<!-- Bootstrap core CSS -->
<link href="css/bootstrap-3.1.1-dist/css/bootstrap.css" rel="stylesheet">
<link href="css/extend/projectwork.css" rel="stylesheet">
</head>

<body class="bgbody">
	<div class="navbar navbar-inverse navbar-fixed-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target=".navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="index.jsp">项目名称</a>
			</div>
			<div class="navbar-collapse collapse">
				<form class="navbar-form navbar-right" action="login.action"
					method="post">
					<div class="form-group">
						<input type="text" placeholder="Email" name="userEmail"
							class="form-control">
					</div>
					<div class="form-group">
						<input type="password" placeholder="Password" name="userPsw"
							class="form-control">
					</div>
					<button type="submit" value="login" class="btn btn-success">登陆</button>
				</form>

			</div>
		</div>
	</div>

	<div id="content-container" class="container contenerm">


		<div class="es-row-wrap container-gap course-cover">
			<div class="row row-8-4">
				<div class="col-md-8">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">今日任务</h3>
						</div>
						<div class="panel-body">

							<div class="line-bottom">
								<div>
									<p>描述：</p>
								</div>
								<div>
									<p>界面设计，完成登录，注册，等界面的UI设计工作，整理所需资源图上传。上传一个会议报告</p>
								</div>
							</div>

							<div class="paddingtexttop">
								<div class="fleft width80">截止日：</div>
								<div>2014 年 10月 30日</div>
								<div class="fleft width80">开始日：</div>
								<div>2014 年 10月 20日</div>
								<div class="fleft width80">重要级别：</div>
								<div>特级</div>
								<div class="fleft width80">下发人：</div>
								<div>张三（项目负责人）</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">
					<div class="panel panel-default">
						<div class="panel-heading">公告</div>
						<div class="panel-body">
							<div class="borderin">
								<p>新项目伊始~我是本项目的负责人张三！相信在我们的齐心合力下一定能打造出一款明星产品！</p>
							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="movecenter">
				<ul class="pagination pagination-lg">
					<li><a href="#">&laquo;</a></li>
					<li class="disabled"><a>项目开始</a></li>
					<li class="active"><a href="#">需求分析</a></li>
					<li><a href="#">风险评估</a></li>
					<li><a href="#">详细设计</a></li>
					<li><a href="#">风险评估</a></li>
					<li><a href="#">编码实现</a></li>
					<li><a href="#">测试</a></li>
					<li><a href="#">发布</a></li>
					<li class="disabled"><a>项目结束</a></li>
					<li><a href="#">&raquo;</a></li>
				</ul>
			</div>
			<ul class="pager">
				<li><a href="#">&laquo;</a></li>
				<li class="disabled"><a>项目开始</a></li>
				<li class="active"><a href="#">需求分析</a></li>
				<li><a href="#">风险评估</a></li>
				<li><a href="#">详细设计</a></li>
				<li><a href="#">风险评估</a></li>
				<li><a href="#">编码实现</a></li>
				<li><a href="#">测试</a></li>
				<li><a href="#">发布</a></li>
				<li class="disabled"><a>项目结束</a></li>
				<li><a href="#">&raquo;</a></li>
			</ul>

			<div class="row row-8-4">
				<div class="col-md-8">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">任务一：</h3>
						</div>
						<div class="panel-body">
							<div>上传资源图</div>
							<div class="fright">
								<button type="button" class="btn btn-danger">完成</button>
							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">任务二：</h3>
						</div>
						<div class="panel-body">
							<div>会议记录</div>
							<div class="fright">
								<button type="button" class="btn btn-danger">完成</button>
							</div>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">项目状态</h3>
						</div>
						<div class="panel-body">
							2014年5月18日 12:31:王五上传了一个文件： <a>web.xml</a><br> 2014年5月18日
							12:41:李四上传了一个文件： <a>adfdddd.xml</a>
						</div>
					</div>

					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">项目进度明细：</h3>
						</div>
						<div class="panel-body">
							<p>张三</p>

							
								<div class="progress-bar progress-bar-success"
									role="progressbar" aria-valuenow="40" aria-valuemin="0"
									aria-valuemax="100" style="width: 40%">
									<span class="sr-only">40% Complete (success)</span>
								</div>
							</div>
							<p>李四</p>
							<div class="progress progress-striped">
								<div class="progress-bar progress-bar-info" role="progressbar"
									aria-valuenow="20" aria-valuemin="0" aria-valuemax="100"
									style="width: 20%">
									<span class="sr-only">20% Complete</span>
								</div>
							</div>
							<p>王五</p>
							<div class="progress progress-striped">
								<div class="progress-bar progress-bar-warning"
									role="progressbar" aria-valuenow="60" aria-valuemin="0"
									aria-valuemax="100" style="width: 60%">
									<span class="sr-only">60% Complete (warning)</span>
								</div>
							</div>
							<p>马六</p>
							<div class="progress progress-striped">
								<div class="progress-bar progress-bar-danger" role="progressbar"
									aria-valuenow="80" aria-valuemin="0" aria-valuemax="100"
									style="width: 80%">
									<span class="sr-only">80% Complete (danger)</span>
								</div>
							</div>
						</div>
					</div>
				</div>
				<div class="col-md-4">

					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">项目资源库</h3>
						</div>
						<div class="panel-body">
							<div>
								<img src="image/resource.jpg" />
							</div>
							<button type="button" class="btn btn-warning">下载</button>
							<button type="button" class="btn btn-warning">上传</button>
						</div>
					</div>


					<div class="panel panel-default">
						<div class="panel-heading">
							项目参与人
						</div>
						<div class="panel-body">
						 	<button type="button" class="btn btn-primary">张三</button>
						 	<button type="button" class="btn btn-primary">李四</button>
						 	<button type="button" class="btn btn-primary">王五</button>
						 	<button type="button" class="btn btn-primary">马六</button>
						</div>
					</div>
				</div>
			</div>

		</div>

	</div>

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
