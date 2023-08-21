package com.learncoding.spahibernet.springjdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseRepository {
    @Autowired
    JdbcTemplate springTemplate;
    private static  String INSERT_QUERY =
             "insert into course (id, name,author)" + "values (?,?,?)";

    private static  String DELETE_QUERY =
            "delete from course where id = ?";

    private static  String SELECT_QUERY =
            "select * from course where id = ?";

    public void inset(Course c1) {
         Logger logger = LoggerFactory.getLogger(CourseRepository.class);
        logger.debug("INSERT_QUERY="+ INSERT_QUERY);
        springTemplate.update(INSERT_QUERY, c1.getId(), c1.getName(), c1.getAuthor());

    }

    public void deleteById (long id) {
        Logger logger = LoggerFactory.getLogger(CourseRepository.class);
        logger.debug("DELETE_QUERY = "+DELETE_QUERY+" ID = "+id);
        springTemplate.update(DELETE_QUERY,id);


    }

    public Course findById(long id) {
        Logger logger = LoggerFactory.getLogger("MethodLogger");
        logger.debug("SELECT_QUERY = "+SELECT_QUERY +" , ID = " + id);

        //Resultset => bean => row mapper
        return  springTemplate.queryForObject(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class), id);

    }

}
