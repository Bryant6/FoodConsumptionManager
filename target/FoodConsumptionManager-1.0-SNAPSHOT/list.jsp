<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2020/6/12
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>用户列表页面</h3>
    <a href="/user/findAll">查询所有</a>

    <h3>测试新增</h3>
    <form action="/user/save" method="post">
        姓名：<input type="text" name="username">
        密码：<input type="password" name="password">
        <input type="submit" value="提交">
    </form>
</body>
</html>
