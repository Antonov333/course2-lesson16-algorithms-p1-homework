package com.example.course2lesson16algorithmsp1homework;

import com.example.course2lesson16algorithmsp1homework.implementations.MyStringList;
import com.example.course2lesson16algorithmsp1homework.interfaces.StringList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Course2Lesson16AlgorithmsP1HomeworkApplication {

    public static void main(String[] args) {
        SpringApplication.run(Course2Lesson16AlgorithmsP1HomeworkApplication.class, args);

        MyStringList myStringList = new MyStringList();
    }

}
