<%--
  Created by IntelliJ IDEA.
  User: jingyile
  Date: 19-5-19
  Time: 下午2:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>欢迎来到后台管理页面</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
</head>

<body align="center">

欢迎来到后台管理页面！
<table border="2" align="center">
    <tr><th><a href="findAllItem">浏览所有栏目</a></th></tr>
    <tr><th><a  href="findAllSubItem">浏览子栏目</a></th></tr>
    <tr><th><a href="findAllUser">浏览所有用户</a></th></tr>
    <tr><th><a href="admin/NewItem.jsp">新增栏目</a></th></tr>
    <tr><th><a href="subItemAddBefore">新增子栏目</a></th></tr>
    <tr><th><a href="admin/NewUser.jsp">新增用户</a></th></tr>
</table>
<br>
</body>
</html>

