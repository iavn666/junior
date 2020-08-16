package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void scholA() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ivan",80));
        students.add(new Student("petya",60));
        students.add(new Student("semen",40));
        School one = new School();
        List<Student> res = one.collect(students,student -> student.getScore() >= 70);
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("ivan",80));
        assertThat(res, is(expected));
    }
    @Test
    public void scholB() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ivan",80));
        students.add(new Student("petya",60));
        students.add(new Student("semen",40));
        School one = new School();
        List<Student> res = one.collect(students,student -> (student.getScore() < 70) && (student.getScore() >= 50));
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("petya",60));
        assertThat(res, is(expected));
    }
    @Test
    public void scholC() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("ivan",80));
        students.add(new Student("petya",60));
        students.add(new Student("semen",40));
        School one = new School();
        List<Student> res = one.collect(students,student -> (student.getScore() < 50) && (student.getScore() > 0));
        List<Student> expected = new ArrayList<>();
        expected.add(new Student("semen",40));
        assertThat(res, is(expected));
    }
}
