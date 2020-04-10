package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class UserTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<User> cmpNamePriority = new UserDescByName().thenComparing(new UserDescByPriority());
        int rsl = cmpNamePriority.compare(
                new User("Fix bug", 1),
                new User("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void userByName() {
        Comparator<User> cmpName = new UserDescByName();
        List<User> result = Arrays.asList(
                new User("ivan", 1),
                new User("Petya", 3)
        );
        Collections.sort(result, cmpName);
        List<User> excepted = Arrays.asList(
                new User("Petya", 3),
                new User("ivan", 1)
        );
        assertThat(result, is(excepted));
    }

    @Test
    public void userByNameDown() {
        Comparator<User> cmpNameDown = new UserDescByNameDown();
        List<User> result = Arrays.asList(
                new User("ivan", 1),
                new User("Petya", 3)
        );
        Collections.sort(result, cmpNameDown);
        List<User> excepted = Arrays.asList(
                new User("ivan", 1),
                new User("Petya", 3)

        );
        assertThat(result, is(excepted));
    }

    @Test
    public void userByPrioriti() {
        Comparator<User> cmpPrioriti = new UserDescByPriority();
        List<User> result = Arrays.asList(
                new User("ivan", 1),
                new User("Petya", 3)
        );
        Collections.sort(result, cmpPrioriti);
        List<User> excepted = Arrays.asList(
                new User("ivan", 1),
                new User("Petya", 3)

        );
        assertThat(result, is(excepted));
    }


    @Test
    public void userByPrioritiDown() {
        Comparator<User> cmpPrioritiDown = new UserDescByPriorityDown();
        List<User> result = Arrays.asList(
                new User("ivan", 1),
                new User("Petya", 3)
        );
        Collections.sort(result, cmpPrioritiDown);
        List<User> excepted = Arrays.asList(
                new User("Petya", 3),
                new User("ivan", 1)

        );
        assertThat(result, is(excepted));
    }


}
