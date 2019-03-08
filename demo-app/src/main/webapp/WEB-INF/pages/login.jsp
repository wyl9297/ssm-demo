<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" >
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<head>
    <meta charset="utf-8"/>
    <title>Login</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <meta name="description" content=""/>
    <meta name="author" content=""/>
    <!-- CSS -->
    <link rel='stylesheet' href='http://fonts.googleapis.com/css?family=PT+Sans:400,700}'/>
    <link rel="stylesheet" href="/ssm/static/css/reset.css"/>
    <link rel="stylesheet" href="/ssm/static/css/supersized.css"/>
    <link rel="stylesheet" href="/ssm/static/css/style.css"/>
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
</head>

<body>
<div class="page-container">
    <h1>平台登录</h1>
    <form action="<c:url value='../doLogin.htm'/>" method="post">
        <input type="text" name="loginName" class="loginName" placeholder="登录名"/>
        <input type="password" name="password" class="password" placeholder="密码"/>
        <button type="submit">登录</button>
    </form>
    <div style="margin-top: 5px;">${message}</div>
</div>
<!-- Javascript -->
<script src="/ssm/static/js/jquery-1.8.2.min.js"></script>
<script src="/ssm/static/js/supersized.3.2.7.min.js"></script>
<script src="/ssm/static/js/supersized-init.js"></script>
<script src="/ssm/static/js/scripts.js"></script>

</body>

</html>