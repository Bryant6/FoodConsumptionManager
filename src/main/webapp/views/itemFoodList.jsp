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
    <title>菜品列表</title>
</head>
<body>
<h2 style="text-align: center; color: #2418DA; font-family: '仿宋';">${canteen}</h2>
<form id="sub" method="get" action="">
    <table align="center" width="1400" border="1" style="line-height: 40px; font-family: '华文楷体';">
        <tr>
            <th>序号</th>
            <th>菜名</th>
            <th>菜品</th>
            <th>价格</th>
            <th>所属食堂</th>
        </tr>

        <c:forEach items="${foodList}" var="food">
            <tr>
                <td>${food.id}</td>
                <td>${food.name}</td>
                <td>${food.type}</td>
                <td>${food.pay}</td>
                <td>${food.canteen}</td>
            </tr>
        </c:forEach>
    </table>
</form>
<h2 style="font-family: '华文宋体'; text-align: center; color: #112CEB;"><a href="${pageContext.request.contextPath}/views/homePage.jsp">返回主界面</a></h2>
</body>
</html>
