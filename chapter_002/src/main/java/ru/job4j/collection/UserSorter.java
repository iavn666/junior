package ru.job4j.collection;

import java.lang.reflect.Array;
import java.text.CollationElementIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UserSorter {
    public static void main(String[] args) {
        List<User> sort = Arrays.asList(
                new User("ivan", 1),
                new User("Petya", 3)
                //new User("Botya",10,4)
        );
        Collections.sort(sort, new UserDescByName());
        System.out.println(sort);
    }
}
