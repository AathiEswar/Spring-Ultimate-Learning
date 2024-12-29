package com.spring_boot.jpa_and_hibernate.CourseRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course ( id , author , name )
                values ( 1 , 'Aathi Eswar' , 'R3F' );        
            """;

    public void insert(){
        jdbcTemplate.update(INSERT_QUERY);
    }
}
