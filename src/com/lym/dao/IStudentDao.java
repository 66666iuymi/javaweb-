package com.lym.dao;

import com.lym.entity.Student;

import java.util.List;

public interface IStudentDao {
    public void addStudent(Student student);
    public void delectStudent(int no);
    public void updateStudent(Student student);
    public List<Student> queryAllStudent();
    public Student queryStudentbyNo(int no);
}
