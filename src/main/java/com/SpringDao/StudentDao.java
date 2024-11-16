package com.SpringDao;

import com.MavenSpringJdbc.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao implements StudentDaoInterface {

    private JdbcTemplate jdbcTemplate;

    @Override
    public int insertStudent(Student student) {
        String query = "INSERT INTO INFORMATION(firstname, lastname, email, age) value(?, ?, ?, ?)";
        return this.jdbcTemplate.update(query,
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getAge()
        );
    }

    @Override
    public int updateStudentData(Student student, int id) {
        String query = "UPDATE INFORMATION SET firstname = ?, lastName = ?, email = ?, age = ? WHERE id = ?";
        return this.jdbcTemplate.update(query,
                student.getFirstName(),
                student.getLastName(),
                student.getEmail(),
                student.getAge(),
                id
        );
    }

    @Override
    public int deleteStudent(int id) {
        String query = "DELETE FROM INFORMATION WHERE id = ?";
        return this.jdbcTemplate.update(query,
                id
        );
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
