package ru.job4j.lambda;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        Stream<Student> stream = students.stream();
        return stream.filter(student -> predict.test(student)).collect(Collectors.toList());
    }
}
