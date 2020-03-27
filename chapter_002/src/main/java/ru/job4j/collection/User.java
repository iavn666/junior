package ru.job4j.collection;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return name.compareTo(o.name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return age == user.age;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

  }
