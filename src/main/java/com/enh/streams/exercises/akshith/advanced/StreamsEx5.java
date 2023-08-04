package com.enh.streams.exercises.akshith.advanced;

import com.enh.streams.StreamUtils;
import com.enh.streams.data.Person;

import java.util.function.BinaryOperator;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class StreamsEx5 {

    public static void main(String[] args) {

//        Given a person, groupby first letter
        System.out.println(
                StreamUtils.getPersons().stream()
                        .collect(groupingBy(p -> p.getName().charAt(0), 
                                mapping(Person::getName, toList())))
        );   
        
//        Given a person, groupby first letter & get 1 person sorted by name
        System.out.println(
                StreamUtils.getPersons().stream()
                        .collect(groupingBy(p -> p.getName().charAt(0), 
                                reducing(BinaryOperator.maxBy(comparing(Person::getName)))))
        );     
        
//        Given a person, groupby first letter & get 1 person & map to name & sorted by name
        System.out.println(
                StreamUtils.getPersons().stream()
                        .collect(groupingBy(p -> p.getName().charAt(0), 
                                reducing("", 
                                        Person::getName,
                                        BinaryOperator.maxBy(comparing(String::valueOf)))))
        );

//        Given a person, groupby first letter & get 1 person with longest name 
        System.out.println(
                StreamUtils.getPersons().stream()
                        .collect(groupingBy(p -> p.getName().charAt(0),
                                reducing(BinaryOperator.maxBy(comparing(p -> p.getName().length())))))
        );   
        
//        Given a person, groupby first letter & get 1 person with longest name & map person to name 
        System.out.println(
                StreamUtils.getPersons().stream()
                        .collect(groupingBy(p -> p.getName().charAt(0),
                                reducing("", 
                                        Person::getName,
                                        BinaryOperator.maxBy(comparing(String::length)))))
        );
        
//        Given a person, groupby first letter & get the youngest person
        System.out.println(
                StreamUtils.getPersons().stream()
                        .collect(groupingBy(p -> p.getName().charAt(0),
                                reducing(BinaryOperator.minBy(comparing(Person::getAge)))))
        );
    }
}
