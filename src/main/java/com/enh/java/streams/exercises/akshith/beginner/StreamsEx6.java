package com.enh.java.streams.exercises.akshith.beginner;

import com.enh.java.streams.StreamUtils;
import com.enh.java.streams.data.Person;
import com.enh.java.streams.enums.Gender;
import org.apache.commons.lang3.StringUtils;

import java.util.Comparator;
import java.util.Optional;

import static java.util.stream.Collectors.toList;

//    Handling Null and Optional:
public class StreamsEx6 {
    
    public static void main(String[] args) {
//    a. Filter out null values from a list of strings using streams.
        System.out.println(
            StreamUtils.getStringsListWithNull().stream()
                    .filter(StringUtils::isNoneBlank)
                    .collect(toList())
        );
        
//    b. Given a list of Optional objects, calculate the sum of their values if present.
        System.out.println(
                StreamUtils.getOptionalsList().stream()
                        .filter(Optional::isPresent)
                        .map(Optional::get)
                        .map(Integer.class::cast)     // (o -> (Integer)o)
                        .mapToInt(Integer::intValue)
                        .sum()
        );

//        Find the average age of all male persons in the list.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .filter(p -> p.getGender() == Gender.MALE)
                        .mapToInt(Person::getAge)
                        .average().getAsDouble()
        );
        
//        Find the names of all male persons who are older than 10 and sort them in alphabetical order.
        System.out.println(
                StreamUtils.getPersons().stream()
                        .filter(p -> (p.getGender() == Gender.MALE) && (p.getAge() > 30))
//                        .filter(p -> p.getGender() == Gender.MALE)
//                        .filter(p -> p.getAge() > 10)
                        .map(Person::getName)
                        .sorted()
                        .collect(toList())
        );
//        Create a new list containing the names of all persons whose names start with the letter "A."
//        Determine whether there is at least one person with age less than 18 in the list.
//        Count the total number of persons in the list.
    }
}
