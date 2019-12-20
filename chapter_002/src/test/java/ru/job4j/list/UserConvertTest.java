package ru.job4j.list;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class UserConvertTest {


    @Test
    public void converted() {
        User a = new User("ivan", 1, "perm");
        List<User> list = new ArrayList<>();
        list.add(a);
        HashMap<Integer, User> expect = UserConvert.process(list);
        assertThat(expect.get(1), is(a));

    }
}

