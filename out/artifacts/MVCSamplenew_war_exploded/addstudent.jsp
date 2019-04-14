<%--
  Created by IntelliJ IDEA.
  User: lym
  Date: 2019/4/7
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>学生信息管理系统</title>
  </head>
  <body>
    <h1 style="text-align: center"> 学生信息管理系统</h1>
    <div style="width:100%;text-align:center">
        <form action="addStudentServlet">
            <p>学号: <input type="text" name="fno"> </p>
            <p>姓名: <input type="text" name="fname"> </p>
            <p>年龄: <input type="text" name="fage"> </p>
            <p>手机: <input type="text" name="ftele"> </p>
            <input type="submit" value="提交" />
        </form>
        <a href="queryAllStudentServlet">点击查询所有学生</a>
    </div>
  </body>
</html>
