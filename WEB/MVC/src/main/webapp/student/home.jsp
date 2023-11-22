<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 11/22/2023
  Time: 6:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
    <link rel="stylesheet" href="<c:url value="/style/style.css"/>">
</head>
<body>
<h1>Danh sách sinh viên</h1>
<a href="http://localhost:8080/students?action=create"> Thêm mới </a>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Image</td>
        <td colspan="2">Action</td>
    </tr>
    <c:forEach var="student" items="${studentList}">
        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td><img src="${student.image}" alt=""></td>
            <td><a href="http://localhost:8080/students?action=edit&id=${student.id}">Sửa</a></td>
            <td><a href="http://localhost:8080/students?action=delete&id=${student.id}">Xóa</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
