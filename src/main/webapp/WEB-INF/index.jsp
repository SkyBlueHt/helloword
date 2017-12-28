<html>
<body>
<h2>Hello World!</h2>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<a href="/test/href1">测试页面一</a><br>
<a href="/test/href2">测试页面二</a><br>
<label for="data">输入数据</label>
<input type="text" id="data" name="data" onchange="changeUrl(this)"><br>
<%--<a href="/test/href3">测试页面三</a><br>--%>
<a id="test3" href="/test/href3/data=">测试页面三</a><br>

<%--实现两个数中取一个随机数--%>
<label for="form1"> 表单传值 GET请求</label>
<form for="form1" action="/test/href4" method="get">
    begin:<input type="text" name="t1"><br>
    end:<input type="text" name="t2"><br>
    <input type="submit" value="提交">
</form><br><br>


<label for="form2"> 表单传值 POST请求</label>
<form for="form2" action="/test/href4" method="post">
    begin:<input type="text" name="t1"><br>
    end:<input type="text" name="t2"><br>
    <input type="submit" value="提交">
</form><br><br>


</body>
<script>
    function changeUrl(obj) {
        document.getElementById("test3").href = "/test/href3/data="+obj.value;
    }
</script>
</html>
