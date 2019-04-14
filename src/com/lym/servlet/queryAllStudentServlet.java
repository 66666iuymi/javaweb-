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
import java.util.List;

@WebServlet(name = "queryAllStudentServlet", urlPatterns = "/queryAllStudentServlet")
public class queryAllStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        IStudentService studentService = new ServiceImpl();
        List<Student> students = studentService.queryAllService();
        request.setAttribute("students", students);
        request.getRequestDispatcher("/showpage.jsp").forward(request, response);

    }
}
