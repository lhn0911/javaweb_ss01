<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/6/2025
  Time: 1:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Kết quả đăng ký vé xe</title>
</head>
<body>
<h2>${message}</h2>
<c:if test="${not empty fullName}">
  <p><strong>Họ tên:</strong> ${fullName}</p>
  <p><strong>Lớp:</strong> ${className}</p>
  <p><strong>Loại xe:</strong> ${vehicleType}</p>
  <p><strong>Biển số xe:</strong> ${licensePlate}</p>
</c:if>
<br>
<a href="registerForm.jsp">Quay lại</a>
</body>
</html>
