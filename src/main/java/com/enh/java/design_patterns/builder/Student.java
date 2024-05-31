package com.enh.java.design_patterns.builder;

import java.util.List;

public class Student {
    private String name;
    private String rollNo;
    private String grade;
    private List<Hobby> hobbies;
    private List<Sport> involvedSports;
    
    private Student() {}

    public String getName() {
        return name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public String getGrade() {
        return grade;
    }

    public List<Hobby> getHobbies() {
        return hobbies;
    }

    public List<Sport> getInvolvedSports() {
        return involvedSports;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    private void setGrade(String grade) {
        this.grade = grade;
    }

    private void setHobbies(List<Hobby> hobbies) {
        this.hobbies = hobbies;
    }

    private void setInvolvedSports(List<Sport> involvedSports) {
        this.involvedSports = involvedSports;
    }

    public static class StudentBuilder {
        public static StudentBuilder STUDENT_BUILDER = new StudentBuilder();
        private static Student student;
        private StudentBuilder() {
        }
        
        public static StudentBuilder withBasicInfo(final String name, final String rollNo, final String grade) {
            student = new Student();
            student.name = name;
            student.rollNo = rollNo;
            student.grade = grade;
            
            return STUDENT_BUILDER;
        }
        
        public StudentBuilder withHobbies(List<Hobby> hobbies) {
            student.setHobbies(hobbies);
            
            return STUDENT_BUILDER;
//            return this; // This is fine as well, but for readability purpose use STUDENT_BUILDER. 
        }
        
        public StudentBuilder withInvolvedSports(List<Sport> sports) {
            student.setInvolvedSports(sports);
            
            return STUDENT_BUILDER;
        }
        
        public Student build() {
            return student;
        }
    }
}
