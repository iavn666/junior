package ru.job4j.collection;

import org.junit.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class UsersTest {
    @Test
    public void whenAsc() {
        Set<Users> users = new TreeSet<>();
        users.add(new Users("Petr", 32));
        users.add(new Users("Ivan", 31));
        Iterator<Users> it = users.iterator();
        assertThat(it.next(), is(new Users("Ivan", 31)));
        assertThat(it.next(), is(new Users("Petr", 32)));
    }

    @Test
    public void whenComparePertVSIvan() {
        int rsl = new Users("Petr", 32)
                .compareTo(
                        new Users("Ivan", 31)
                );
        assertThat(rsl, greaterThan(0));
    }
}
