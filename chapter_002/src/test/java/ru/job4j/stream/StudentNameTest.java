package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class StudentNameTest {
    @Test
    public void nameListtoMap() {
        Student one = new Student("ivanov",3);
        Student two = new Student("petrov",5);
        Map<String,Student> expected = new HashMap<>();
        expected.put("ivanov",one);
        expected.put("petrov",two);
        List<Student> resone = new ArrayList<>();
        resone.add(one);
        resone.add(two);
        StudentName first = new StudentName();
        Map<String,Student> res = first.namenum(resone);
        assertThat(res, is(expected));
    }
}
