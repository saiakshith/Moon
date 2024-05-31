package com.enh.java.design_patterns.builder.test;

import com.enh.java.design_patterns.builder.Hobby;
import com.enh.java.design_patterns.builder.Student;

import java.util.List;

import static com.enh.java.util.PlaygroundUtil.log;

public class BuilderTest {
    public static void main(String[] args) {
        Student.StudentBuilder studentBuilder1 = Student.StudentBuilder.STUDENT_BUILDER;
        Student.StudentBuilder studentBuilder2 = Student.StudentBuilder.STUDENT_BUILDER;

        Student student1 = Student.StudentBuilder
                .withBasicInfo("name1", "rollNo", "grade")
                .withHobbies(List.of(Hobby.DANCING))
                .build();
        Student student2 = Student.StudentBuilder
                .withBasicInfo("name2", "rollNo", "grade")
                .withHobbies(List.of(Hobby.DANCING))
                .build(); 
        
        log(student1.getName());
        log(student2.getName());
        
    }
}
