package com.lym.servlet;

import com.lym.entity.Student;
import com.lym.service.IStudentService;
import com.lym.service.Impl.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "queryStudentbyNoServlet",urlPatterns = "/queryStudentbyNoServlet")
public class queryStudentbyNoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int no = Integer.parseInt(request.getParameter("fno"));
        IStudentService studentService = new ServiceImpl();
        Student student = studentService.queryStudentbyNoService(no);
        request.setAttribute("student", student);
        request.getRequestDispatcher("DetailInfor.jsp").forward(request, response);


    }
}
