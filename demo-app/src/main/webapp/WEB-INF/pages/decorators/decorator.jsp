<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <sitemesh:write property='head'/>
    <style type='text/css'>
        a{
            text-decoration: none;
            color: #111111;
            font-size: 10px;
        }
        li {
            list-style: none;
        }
        .mainBody {
            padding: 10px;
            border: 1px solid #555555;
        }
        .conbgbtm {
            width:100%;
            min-height:400px;
            height:auto;
            overflow:hidden;
            zoom:1;
        }
        .header-font {
            font-size: 28px;
            display: inline-block;
            float: left;
            margin-top: 8px;
            margin-left: 180px;
            color: #95a5a6;
        }
        .header-left {
            width: 172px;
            height: 60px;
            left: 33px;
            position: absolute;
            top: 17px;
            text-align: center;
        }
        .right-out {
            float: right;
            margin-right: 44px;
            color: #fff;
            margin-top: 25px;
            cursor: pointer;
            font-size: small;
        }
        .conbgbtm {
            width: 170px;
            float: left;
            height: 800px;
        }
        .conbgbtm li{
            float: left;
            width: 100%;
            margin-top: 20px;
            line-height: 25px;
            font-weight: bold;
        }
    </style>
</head>
<body>
<!--头部  -->
<div align="center" style="height: 67px;background-color: #343f4b;">
    <div class="header-left">
        <img src="/ssm/static/img/logo/wdLogo.jpg">
    </div>
    <span class="header-font">大连万达集团有限公司</span>
    <a class="right-out" href="<c:url value='/logout.htm'/>">退出登录</a>
</div>

<!--左侧菜单栏  -->
<div class="conbgbtm" style="display: block;background: #f3f3f3;margin-top: 10px;">
    <div class="leftbox" >
        <ul>
            <li><a href="javascript:void(0)">新建采购计划</a></li>
            <li><a href="javascript:void(0)">我的采购计划</a></li>
            <li><a href="javascript:void(0)">采购计划监督</a></li>
            <li><a href="javascript:void(0)">关联采购计划</a></li>
            <li><a href="javascript:void(0)">用户权限设置</a></li>
        </ul>
    </div>
</div>
<div style="overflow: hidden;min-height: 800px;margin-top: 10px;padding-left: 10px;">
    <sitemesh:write property='body'></sitemesh:write>
</div>
<hr>

<div align="center">
    <span>Copyright © 2017-2018 大连万达集团 版权所有</span>
</div>

</body>
</html>