<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2020/6/12
  Time: 11:10m
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>success</title>
    <script type="text/javascript" language="JavaScript">
        var i=5;
        var clearTime;
        clearTime = setInterval("fun()",1000);
        function fun() {
            if(i == 0){
                window.location.href="./userHome.jsp";
                clearInterval(clearTime);
            }
            document.getElementById("time").innerHTML = i;
            i--;
        }
    </script>
</head>
<body>
    <h1 style="color: green">支付成功,</h1>
    <h2><p><span id="time">5</span></p>秒后跳转到首页</h2>
</body>
</html>
