package com.lym.utils;

import com.lym.entity.Student;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DBUtils {
    static Connection connection = null;
    static PreparedStatement pstmt = null;
    static ResultSet rs = null;
    static String USERNAME = "root";
    static String PASSWORD = "";
    static String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";


    public static void getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(String sql, Object[] obj) {
        int num = 0;
        try {
            pstmt = connection.prepareStatement(sql);
            for (int i = 0; i < obj.length; i++) {
                pstmt.setObject(i+1, obj[i]);
            }
            num = pstmt.executeUpdate();
            System.out.println("添加" + num + "条数据");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static List<Student> queryAll(String sql) {
        List<Student> students = new LinkedList<>();
        try {
            pstmt = connection.prepareStatement(sql);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                int no = rs.getInt(1);
                String name = rs.getString(2);
                int age = rs.getInt(3);
                String telephone = rs.getString(4);
                Student student = new Student(no, name, age, telephone);
                students.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return students;
    }

    public static Student queryStudentbySno(String sql, int no) {
        Student student = new Student();
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setInt(1, no);
            rs = pstmt.executeQuery();
                //int no = rs.getInt(1);
            rs.next();
            String name = rs.getString(2);
            int age = rs.getInt(3);
            String telephone = rs.getString(4);

            student.setSno(no);
            student.setSname(name);
            student.setSage(age);
            student.setStelephone(telephone);


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }

}
