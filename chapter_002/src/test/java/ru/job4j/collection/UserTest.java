package ru.job4j.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UserTest {

   @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<User> cmpNamePriority = new UserDescByName().thenComparing(new UserDescByPriority());
        int rsl = cmpNamePriority.compare(
                new User("fmpl task", 0,2),
                new User("iix bug", 1,2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new User("Petr", 32,2)
                .compareTo(
                        new User("Ivan", 31,1)
                );
        assertThat(rsl, greaterThan(0));
    }
}