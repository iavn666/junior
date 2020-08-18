package ru.job4j.stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Student {

    private int score;
    private String surname;

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getScore() {
        return score;
    }

    public String getSurname() {
        return surname;
    }

    public Student(String surname, int score) {
        this.score = score;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return score == student.score &&
                surname.equals(student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(score, surname);
    }

    public static void main(String[] args) {
        Student nameone = new Student("ivan", 3);
        Student nametwo = new Student("petya", 5);
        List<Student> res = new ArrayList<>();
        res.add(nameone);
        res.add(nametwo);
        System.out.println(res.stream().collect(Collectors.toMap(x -> x.getSurname(), x -> x)));
    }

}