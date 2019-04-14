<%@ page import="com.lym.entity.Student" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: lym
  Date: 2019/4/9
  Time: 17:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生</title>

</head>
<body>
<h1 style="text-align: center"> 学生信息管理系统</h1>
<div style="width:100%;text-align:center">
    <h2 style="text-align: center">学生列表</h2>
    <%
        List<Student> students = (List<Student>) request.getAttribute("students");
    %>
    <table border="1" style="margin:auto">
        <tr>
            <th>no</th>
            <th>name</th>
            <th>age</th>
            <th>tele</th>
        </tr>
        <%
            for (Student student : students) {
        %>
        <tr>
            <td><a href="queryStudentbyNoServlet?fno=<%= student.getSno()%>"><%= student.getSno()%></a> </td>
            <td><%= student.getSname()%> </td>
            <td><%= student.getSage()%> </td>
            <td><%= student.getStelephone()%> </td>
            <td><a href="deleteStudentbyNoServlet?fno=<%= student.getSno()%>">删除</a></td>
        </tr>
        <%
            }
        %>

    </table>


</div>


</body>
</html>
