<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<%--
  Created by IntelliJ IDEA.
  User: wy123
  Date: 2020/7/4
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
<h2 style="text-align: center; color: #2418DA; font-family: '仿宋';">所有用户</h2>
<form id="sub" method="get" action="">
    <table align="center" width="1400" border="1" style="line-height: 40px; font-family: '华文楷体';">
        <tr>
            <th>序号</th>
            <th>用户名</th>
            <th>密码</th>
            <th>操作</th>
        </tr>

        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>
                    <a href="<c:url value='/manage/updateUser?method=update&id=${meeting.id}'/> ">修改</a>
                    <a href="<c:url value='/manage/updateUser?method=delete&id=${meeting.id}'/> ">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
<h2 style="font-family: '华文宋体'; text-align: center; color: #112CEB;"><a href="${pageContext.request.contextPath}/views/homePage.jsp">返回主界面</a></h2>
</body>
</html>
