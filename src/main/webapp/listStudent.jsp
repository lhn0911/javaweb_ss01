<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/6/2025
  Time: 10:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách vé xe học sinh</title>
</head>
<body>
<h2>Danh sách vé xe học sinh</h2>
<table>
    <tr>
        <th>Họ và tên</th>
        <th>Lớp</th>
        <th>Loại xe</th>
        <th>Biển số xe</th>
    </tr>
    <jsp:useBean id="students" scope="request" type="java.util.List"/>
    <c:forEach var="student" items="${students}">
        <tr>
            <td>${student.fullName}</td>
            <td>${student.className}</td>
            <td>${student.vehicleType}</td>
            <td>${student.licensePlate}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
