<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 11/22/2023
  Time: 7:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Student</title>
</head>
<body>
<a href="http://localhost:8080/students?action=findAll">Trang chủ</a>
<form action="/students" method="post">
    <input type="hidden" name="action" value="create">
    <input type="number" name="id" placeholder="id">
    <input type="text" name="name" placeholder="name">
    <input type="text" name="image" placeholder="image">
    <button>Add</button>
</form>
</body>
</html>
