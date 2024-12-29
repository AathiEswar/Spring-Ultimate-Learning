package com.spring_boot.jpa_and_hibernate.CourseRepository;

import com.spring_boot.jpa_and_hibernate.Course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJDBCRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static String INSERT_QUERY =
            """
                insert into course ( id , author , name )
                values ( ? , ? , ? );        
            """;

    private static String DELETE_QUERY =
            """
                delete from course where id = ?; 
            """;
    private static String SELECT_QUERY =
            """
                select * from course 
                where id = ?;
            """;

    public void insert(Course course ){
        jdbcTemplate.update(INSERT_QUERY , course.getId() , course.getAuthor() , course.getName());
    }
    public void deleteById(long id){
        jdbcTemplate.update(DELETE_QUERY , id);
    }
    public Course selectById(long id){
        // Result Set -> Bean -> Row Mapper
        return jdbcTemplate.queryForObject(
                SELECT_QUERY ,
                new BeanPropertyRowMapper<>(Course.class) ,
                id
        );
    }
}
