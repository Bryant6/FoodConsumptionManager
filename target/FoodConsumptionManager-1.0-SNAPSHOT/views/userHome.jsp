<%--
  Created by IntelliJ IDEA.
  User: Q
  Date: 2020/6/13
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>用户主页</title>
    <link rel='stylesheet' type='text/css'
    <link href="../assets/css/icons.css" rel="stylesheet" />
    <link href="../assets/css/sprflat-theme/jquery.ui.all.css" rel="stylesheet" />
    <link href="../assets/css/bootstrap.css" rel="stylesheet" />
    <link href="../assets/css/plugins.css" rel="stylesheet" />
    <link href="../assets/css/main.css" rel="stylesheet" />
    <link href="../assets/css/custom.css" rel="stylesheet" />
</head>
<body>
<!-- Start #header -->
<div id="header">
    <h3 style="color: #000000;text-align: center;">  食   品   消   费   管   理   系   统</h3>
</div>
<div id="sidebar">
    <div class="sidebar-inner">
        <ul id="sideNav" class="nav nav-pills nav-stacked">
            <li><a href="/orderFood"> 点菜系统 </a></li>
            <li><a href="/canteenInfo"> 食堂信息 </a></li>
            <li><a href="${pageContext.request.contextPath}/views/other.jsp"> 其他</a></li>
        </ul>
    </div>
</div>
<div id="content">
    <h1 class="page-header">食品消费管理系统</h1>
    <h2>作者：2017级理科一班 计算机科学与技术 王宇</h2>
    <h2>学号：3120170901503</h2>
</div>
<div id="content">
    <h3 class="page-header">系统概述：通过对学生在学校餐厅的消费流程进行分析，完成具有菜单管理、点菜管理、食品管理餐厅管理等相关功能的小型数据库管理应用系统。
        <p/><br>
        设计要求 ：<br>
        1)完成进人员、餐厅、食品价目表的维护<br>
        2)菜单信息的查询（包含模糊查询）。<br>
        3)按所点菜品计算消费总额<br>
        4)完成用户管理功能<br>
        5)完成数据备份与恢复功能</h3>
</div>

</body>
</html>