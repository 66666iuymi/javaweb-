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

@WebServlet(name = "addStudentServlet", urlPatterns = "/addStudentServlet")
public class addStudentServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("fname");
        int age = Integer.parseInt(request.getParameter("fage"));
        int no = Integer.parseInt(request.getParameter("fno"));
        String telephone = request.getParameter("ftele");

        Student student = new Student(no, name, age, telephone);

        IStudentService studentService = new ServiceImpl();
        studentService.addService(student);
        request.getRequestDispatcher("index.jsp").forward(request,response);


    }
}
