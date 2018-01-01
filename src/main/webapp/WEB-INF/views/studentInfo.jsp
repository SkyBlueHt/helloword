<%--
  Created by IntelliJ IDEA.
  User: bazil
  Date: 2017/12/30
  Time: 17:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${! empty stu}">
    欢迎您，${stu.name}${stu.sex eq 1 ?'女士':'先生'}
</c:if>
<c:if test="${ empty stu}">
    对不起，请先<a href="/web/login">登录</a>
</c:if>
</body>
</html>