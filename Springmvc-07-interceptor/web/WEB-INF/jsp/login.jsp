<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/10/23 0023
  Time: 21:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%--再web-inf下的所有页面或者资源，只能通过controller或者servlet来访问--%>
    <title>登录页面</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/login" method="get">
    用户名：<input type="text" name="username">
    密码：<input type="text" name="pwd">
    <input type="submit" value="提交">
</form>
</body>
</html>
