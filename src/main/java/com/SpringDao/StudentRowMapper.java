package com.SpringDao;

import com.MavenSpringJdbc.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student>{

    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

        Student student = new Student();
        student.setFirstName(rs.getString(2));
        student.setLastName(rs.getString(3));
        student.setAge(rs.getInt(5));
        student.setEmail(rs.getString(4));

        return student;
    }
}
