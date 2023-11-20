<%--
  Created by IntelliJ IDEA.
  User: Linh
  Date: 11/20/2023
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Home</title>
</head>
<body>
<h1>Trang chu</h1>
<%--<h1>${name}</h1>--%>
<h1>Danh sach sinh vien</h1>
<c:forEach var="item" items="${list}">
    <c:if test="${item.name != 'De'}">
        <h1>Id : ${item.id} | Name: ${item.name}</h1>
    </c:if>

    <c:if test="${item.name == 'De'}">
        <h1>Dan an De</h1>
    </c:if>
</c:forEach>
</body>
</html>
