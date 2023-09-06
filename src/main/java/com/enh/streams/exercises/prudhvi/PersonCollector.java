package com.enh.streams.exercises.prudhvi;

import com.enh.streams.data.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class PersonCollector implements Collector<Person, List<Person>, List<Person>> {

    @Override
    public Supplier<List<Person>> supplier() {
        return ArrayList::new;
    }

    @Override
    public BiConsumer<List<Person>, Person> accumulator() {
        return (list,person) -> list.add(person);
    }

    @Override
    public BinaryOperator<List<Person>> combiner() {
        return (list1,list2) -> {
            list1.addAll(list2);
            return list1;
        };
    }

    @Override
    public Function<List<Person>, List<Person>> finisher() {
        return people -> people;
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Set.of(Characteristics.UNORDERED);
    }
}
