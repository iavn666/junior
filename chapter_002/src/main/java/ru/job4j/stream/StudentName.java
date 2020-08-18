package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentName {

    public Map<String,Student> namenum (List<Student> list) {
        return list.stream().collect(Collectors.toMap(student -> student.getSurname(), student -> student));
    }
}
