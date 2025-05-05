<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/6/2025
  Time: 12:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Thông tin người dùng</title>
  <style>
    table {
      width: 50%;
      border-collapse: collapse;
      margin: 25px 0;
    }
    table, th, td {
      border: 1px solid black;
    }
    th, td {
      padding: 10px;
      text-align: center;
    }
  </style>
</head>
<body>

<h2>Thông tin người dùng</h2>

<table>
  <tr>
    <th>Tên</th>
    <th>Tuổi</th>
  </tr>
  <tr>
    <td>${name}</td>
    <td>${age}</td>
  </tr>
</table>

</body>
</html>
