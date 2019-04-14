<%@ page import="com.lym.entity.Student" %><%--
  Created by IntelliJ IDEA.
  User: lym
  Date: 2019/4/11
  Time: 9:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>学生个人页面</title>
</head>
<body>
    <%
        Student student = (Student) request.getAttribute("student");
    %>
    <div style="width:100%;text-align:center">
        <form action="updateStudentServlet">
            <p>学号: <input type="text" name="fno" value="<%=student.getSno()%>"> </p>
            <p>姓名: <input type="text" name="fname" value="<%=student.getSname()%>"> </p>
            <p>年龄: <input type="text" name="fage" value="<%=student.getSage()%>"> </p>
            <p>手机: <input type="text" name="ftele" value="<%=student.getStelephone()%>"> </p>
            <input type="submit" value="提交" />
        </form>
        <a href="queryAllStudentServlet">
            <button>点击查询学生</button>
        </a>
    </div>
</body>
</html>
