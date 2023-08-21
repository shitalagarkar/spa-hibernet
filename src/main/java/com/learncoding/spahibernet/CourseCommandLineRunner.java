package com.learncoding.spahibernet;

import com.learncoding.spahibernet.jpa.CourseJPARepository;
import com.learncoding.spahibernet.jpa.JPACourse;
import com.learncoding.spahibernet.springjdbc.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    //@Autowired
   // private CourseRepository repository;


    @Autowired
    private CourseJPARepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.inset(new JPACourse(1,"Learn AWS", "CloudGuru"));
        repository.inset(new JPACourse(2,"SystemDesign", "Alex"));
        repository.inset(new JPACourse(3,"SystemDesign2", "Alex"));

        repository.deleteById(3);

        System.out.print(repository.findById(1));
    }


}
