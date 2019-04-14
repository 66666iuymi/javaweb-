package com.lym.service;

import com.lym.entity.Student;

import java.util.List;

public interface IStudentService {
    public void addService(Student student);
    public void delectService(int no);
    public void updateService(Student student);
    public Student queryStudentbyNoService(int no);
    public List<Student> queryAllService();
}
