package com.SpringDao;

import com.MavenSpringJdbc.Student;

import java.util.List;

public interface StudentDaoInterface {
    public int insertStudent(Student student);
    public int updateStudentData(Student student, int id);
    public int deleteStudent(int id);
    public Student getStudentById(int id);
    public List<Student> getAllStudents();
}