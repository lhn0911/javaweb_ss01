<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/6/2025
  Time: 1:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng kí vé xe</title>
</head>

<h2>Form Đăng ký vé xe cho học sinh</h2>
<form action="Bai6" method="post">
    <label>Họ và tên:</label>
    <input type="text" name="fullName" required><br><br>

    <label>Lớp:</label>
    <input type="text" name="className" required><br><br>

    <label>Loại xe:</label>
    <input type="text" name="vehicleType" required><br><br>

    <label>Biển số xe:</label>
    <input type="text" name="licensePlate" ><br><br>

    <button type="submit">Đăng ký</button>
</form>
</html>
