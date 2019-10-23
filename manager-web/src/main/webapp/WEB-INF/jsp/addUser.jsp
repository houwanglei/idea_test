<%--
  Created by IntelliJ IDEA.
  User: houwanglei
  Date: 2019/10/22
  Time: 21:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加用户</title>
</head>
<body>
    <form action="/user/addUser" method="post">
        姓名：<input type="text" name="username"/><br>
        年龄：<input type="text" name="userage"/><br>
        id：<input type="text" name="userid"/>
        <input type="submit" value="OKOK"/>
    </form>
</body>
</html>
