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
    <title>食堂信息列表</title>
</head>
<body>
<h2 style="text-align: center; color: #2418DA; font-family: '仿宋';">所有食堂</h2>
<form id="sub" method="get" action="">
    <table align="center" width="1400" border="1" style="line-height: 40px; font-family: '华文楷体';">
        <tr>
            <th>序号</th>
            <th>名称</th>
            <th>日销售额</th>
            <th>员工数</th>
            <th>食堂信息</th>
            <th>用餐时间</th>
        </tr>

        <c:forEach items="${canteenList}" var="canteen">
            <tr>
                <td>${canteen.id}</td>
                <td>${canteen.name}</td>
                <td>${canteen.daySales}</td>
                <td>${canteen.workerNumber}</td>
                <td>${canteen.info}</td>
                <td>${canteen.openTime}</td>
            </tr>
        </c:forEach>
    </table>
</form>
<h2 style="font-family: '华文宋体'; text-align: center; color: #112CEB;"><a href="${pageContext.request.contextPath}/views/userHome.jsp">返回主界面</a></h2>
</body>
</html>
