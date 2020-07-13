package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class School {

    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        Stream<Student> stream = students.stream();
        return stream.filter(student -> predict.test(student)).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List <String> name = new ArrayList<String>();
        name.add("ivan");
        name.add("sveta");
        name.add("misha");
        Stream strim = name.stream();
    }
}
