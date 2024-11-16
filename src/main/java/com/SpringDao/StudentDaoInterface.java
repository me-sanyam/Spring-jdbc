package com.SpringDao;

import com.MavenSpringJdbc.Student;

public interface StudentDaoInterface {
    public int insertStudent(Student student);
    public int updateStudentData(Student student, int id);
    public int deleteStudent(int id);
}