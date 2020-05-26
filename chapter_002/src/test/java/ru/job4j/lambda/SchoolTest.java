package ru.job4j.lambda;

import org.junit.Test;

import javax.swing.text.StyledEditorKit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SchoolTest {
    @Test
    public void studentW() {
        List<Student> user = new ArrayList<>();
        user.add(new Student(90,"ivan"));
        user.add(new Student(60,"petya"));
        user.add(new Student(40,"petya"));
        School res = new School();
        //res.collect(user, Pre)
        //assertThat(a, is(exp));
    }

}
