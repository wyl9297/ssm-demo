<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/25
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <table>
            <tr>
                <th>序号</th>
                <th>名称</th>
                <th>登录名</th>
                <th>电话</th>
            </tr>
            <c:forEach items="${regUsers}" var="user" varStatus="status">
                <tr>
                    <td>${status.index + 1}</td>
                    <td>${user.name}</td>
                    <td>${user.loginName}</td>
                    <td>${user.mobile}</td>
                </tr>
            </c:forEach>
        </table>
</body>
</html>
