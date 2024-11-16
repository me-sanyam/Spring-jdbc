package com.MavenSpringJdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Config.xml");
        JdbcTemplate template = (JdbcTemplate) context.getBean("jdbcTemplate");

        String query = "INSERT INTO INFORMATION(firstname, lastname, email, age) value(?, ?, ?, ?)";
        int result = template.update(query,"Sanyam","Kapoor","sanyamkapoor001@gmail.com","23");
        System.out.println("No of rows inserted: "+result);

    }
}
