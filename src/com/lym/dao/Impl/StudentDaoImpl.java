package com.lym.dao.Impl;

import com.lym.dao.IStudentDao;
import com.lym.entity.Student;
import com.lym.utils.DBUtils;
import com.mysql.cj.xdevapi.DbDoc;

import java.sql.*;
import java.util.List;

public class StudentDaoImpl implements IStudentDao {
    String USERNAME = "root";
    String PASSWORD = "";
    String URL = "jdbc:mysql://localhost:3306/test?serverTimezone=UTC";
    Connection connection = null;
    PreparedStatement pstme = null;
    ResultSet resultSet = null;

    @Override
    public void addStudent(Student student) {
        DBUtils.getConnection();
        String sql = "insert into student1 values(?,?,?,?)";
        Object obj[] = {student.getSno(), student.getSname(), student.getSage(), student.getStelephone()};

        DBUtils.update(sql, obj);
    }

    @Override
    public void delectStudent(int no) {
        DBUtils.getConnection();
        String sql = "delete from student1 where sno=?";
        Object obj[] = {no};
        DBUtils.update(sql, obj);
    }

    @Override
    public void updateStudent(Student student) {
        DBUtils.getConnection();
        String sql = "update student1 set sname=?,sage=?,stelephone=? where sno=?";
        Object[] obj = {student.getSname(), student.getSage(), student.getStelephone(), student.getSno()};
        DBUtils.update(sql, obj);
    }

    @Override
    public List<Student> queryAllStudent() {
        DBUtils.getConnection();
        List<Student> students = DBUtils.queryAll("select * from student1");
        return  students;
    }

    @Override
    public Student queryStudentbyNo(int no) {
        DBUtils.getConnection();
        String sql = "select * from student1 where sno = ?";
        Student student = DBUtils.queryStudentbySno(sql,no);
        return student;
    }
}
