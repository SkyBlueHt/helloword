<%--
  Created by IntelliJ IDEA.
  User: bazil
  Date: 2017/12/29
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<label for="form2">表单传值，user对象传到后台</label>
<form id="form2" action="/web/studentPost" method="post">
    id:<input type="text" name="id"><br>
    Name:<input type="text" name="name"><br>
    pwd:<input type="text" name="pwd"><br>
    sex: <input type="text" name="sex"><br>
    PhoneNo: <input type="text" name="phoneno"><br>
    address: <input type="text" name="address"><br>
    scores_id: <input type="text" name="scoresId"><br>

    <input type="submit" value="点击提交">
</form>
<p>反馈信息：${result}</p>

<form for="form2" action="/web/studentPost" method="post">
    查询学生ID：<input type="text" name="studentno"><br>

    <input type="submit" value="提交">
</form>
    查询学生数据如下：${phoneno}
<br><br>


</body>
</html>
</body>
</html>
