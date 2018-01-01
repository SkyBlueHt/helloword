<%--
  Created by IntelliJ IDEA.
  User: bazil
  Date: 2017/12/30
  Time: 17:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form id="zc" action="/web/studentLogin" method="post">
    <label for="name">用户名：</label> <input type="text" required id="name" name="name"><br>
    <label for="pwd">密码：</label> <input type="password" required id="pwd" name="pwd"><br>
    <input type="submit" value="登录">
    <input type="button" value="注册" onclick="location.href='/web/zc'">
</form>
</body>

<script>

    //对应后台返回的提示
    if ('${result}' != '') {
        if ('${result}' == 0)
            alert('该账户不存在！')
        if ('${result}' == 1)
            alert('密码错误！')
        if ('${result}' == 2) {
            alert('登录成功！')
            location.href = 'studentInfo'
        }
    }
</script>
</html>