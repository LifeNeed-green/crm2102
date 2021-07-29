<%--
  Created by IntelliJ IDEA.
  User: 咕噜咕噜
  Date: 2021/5/7
  Time: 9:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>单个数据提交</h1>
<form action="${pageContext.request.contextPath}/one.action">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>

    <h1>对象数据提交</h1>
    <form action="${pageContext.request.contextPath}/two.action">
        姓名：<input type="text" name="name"><br>
        年龄：<input type="text" name="age">
        <input type="submit" value="提交">
    </form>
</body>

    <h1>动态占位符（超链接）</h1>
    <a href="${pageContext.request.contextPath}/three/张三/18.action">
        动态占位符
    </a>

        <h1>请求参数名称与形参名称不一致</h1>
<form action="${pageContext.request.contextPath}/four.action">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>


        <h1>使用request传统方式</h1>
<form action="${pageContext.request.contextPath}/five.action">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age">
    <input type="submit" value="提交">
</form>
</html>
