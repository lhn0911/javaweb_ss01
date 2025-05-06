<%--
  Created by IntelliJ IDEA.
  User: HOANGNAM
  Date: 5/6/2025
  Time: 10:45 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*, com.rikkei.ss01.Bai8.Task" %>
<%
    List<Task> taskList = (List<Task>) request.getAttribute("taskList");
%>
<html>
<head>
    <title>To-Do List</title>
    <style>
        body {
            font-family: Arial, serif; }
        table, th, td { border: 1px solid black; border-collapse: collapse; }
        th, td { padding: 10px; }
        .doing { background-color: yellow; }
        .completed { background-color: #99ccff; }
    </style>
</head>
<body>
<h2>To-Do List</h2>
<form action="Bai8" method="post">
    <label>
        <input type="text" name="jobName" placeholder="Enter new job" />
    </label>
    <button type="submit">Add</button>
</form>

<table>
    <tr>
        <th>ID</th><th>Job Name</th><th>Status</th><th>Action</th>
    </tr>
    <%
        if (taskList != null) {
            for (Task task : taskList) {
                String statusClass = task.getStatus().equals("Completed") ? "completed" : "doing";
    %>
    <tr class="<%= statusClass %>">
        <td><%= task.getId() %></td>
        <td><%= task.getName() %></td>
        <td><%= task.getStatus() %></td>
        <td>
            <% if (!task.getStatus().equals("Completed")) { %>
            <form action="Bai8" method="get" style="display:inline;">
                <input type="hidden" name="id" value="<%= task.getId() %>"/>
                <button type="submit">Change status</button>
            </form>
            <% } %>
        </td>
    </tr>
    <%      }
    }
    %>
</table>
</body>
</html>
