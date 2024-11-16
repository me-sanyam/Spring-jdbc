package com.MavenSpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.SpringDao.StudentDao;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        StudentDao StudentDao = (StudentDao) context.getBean("studentDao");

        // Create a new student object
        Student student = new Student();
        student.setFirstName("test updated");
        student.setLastName("user");
        student.setEmail("testupdateduser@gmail.com");
        student.setAge(13);

        // Implement the insertion using the Dao
        int result = StudentDao.insertStudent(student);
        System.out.println("Data Inserted --> "+result);
        int results = StudentDao.updateStudentData(student, 2);
        System.out.println("Data Updated --> "+results);
        int res = StudentDao.deleteStudent(3);
        System.out.println("Data Deleted --> "+res);
    }
}
