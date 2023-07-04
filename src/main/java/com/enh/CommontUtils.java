package com.enh;

import com.enh.streams.data.Person;

import java.util.List;

public class CommontUtils {

    public static List<Person> createPeople() {
        return List.of(
                new Person("Ray", 34),
                new Person("Ash", 4),
                new Person("Barry", 12),
                new Person("Dahmer", 25),
                new Person("Tanjiro", 86),
                new Person("Zenitsu", 35),
                new Person("Rengoku", 67),
                new Person("Mitsuri", 36),
                new Person("Urokodaki", 93),
                new Person("Nichirin Sword", 74)
        );
    }
}
