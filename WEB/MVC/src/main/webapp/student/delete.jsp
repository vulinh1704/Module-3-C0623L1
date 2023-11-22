<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 11/22/2023
  Time: 7:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Bạn có muốn xóa học viên có ID là: ${student.id} và tên là ${student.name} hay không ?</h1>
<form action="/students" method="post">
    <input type="hidden" name="action" value="delete">
    <input type="hidden" name="id" value="${student.id}">
    <button>Xóa</button>
</form>
<a href="http://localhost:8080/students?action=findAll">Không</a>
</body>
</html>
