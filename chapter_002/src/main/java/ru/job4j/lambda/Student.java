package ru.job4j.lambda;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Student {
    private int score;
    private String surname;

    public Student (int score, String surname) {
        this.score = score;
        this.surname = surname;
    }
     public int getScore() {
        return score;
     }

     public String getSurname() {
        return surname;
     }

     public void setScore (int score) {
        this.score = score;
     }

    Map<String,Student> collect(List<Student> user) {
        return user.stream().distinct().collect(Collectors.toMap(Student::getSurname, Student -> Student));
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + surname + '\'' +
                ", size=" + score +
                '}';
    }
}
