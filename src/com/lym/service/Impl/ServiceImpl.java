package com.lym.service.Impl;

import com.lym.dao.IStudentDao;
import com.lym.dao.Impl.StudentDaoImpl;
import com.lym.entity.Student;
import com.lym.service.IStudentService;

import java.util.List;

public class ServiceImpl implements IStudentService {
    @Override
    public void addService(Student student) {
        IStudentDao studentDao = new StudentDaoImpl();
        studentDao.addStudent(student);
    }

    @Override
    public void delectService(int no) {
        IStudentDao studentDao = new StudentDaoImpl();
        studentDao.delectStudent(no);
    }

    @Override
    public void updateService(Student student) {
        IStudentDao studentDao = new StudentDaoImpl();
        studentDao.updateStudent(student);

    }

    @Override
    public List<Student> queryAllService() {
        IStudentDao studentDao = new StudentDaoImpl();
        return studentDao.queryAllStudent();

    }

    @Override
    public Student queryStudentbyNoService(int no) {
        IStudentDao studentDao = new StudentDaoImpl();
        return studentDao.queryStudentbyNo(no);
    }
}
