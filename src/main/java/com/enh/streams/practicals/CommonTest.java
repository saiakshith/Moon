package com.enh.streams.practicals;

import com.enh.streams.data.Person;

import java.util.Optional;
import java.util.concurrent.CopyOnWriteArrayList;

import static com.enh.CommontUtils.createPeople;

public class CommonTest {

    public void runCode() {
        System.out.println(
                createPeople().stream()
                        .filter(person -> person.getAge() > 900)
                        .findFirst()
                        .map(Person::getName)
                        .map(String::toUpperCase)
                        .orElse("default")
//                        .max(comparing(Person::getAge))
//                        .mapToInt(Person::getAge)
//                        .max()
        );
        System.out.println(Optional.ofNullable(null));
    }

    public static void main(String[] args) {
        new CommonTest().runCode();
    }
}
