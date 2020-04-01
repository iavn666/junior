package ru.job4j.collection;

import com.sun.istack.internal.NotNull;

import java.util.Objects;

import static java.lang.Integer.compare;

public class User implements Comparable<User> {
    private String name;

    private int priority;

    public User(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "User{" + name + ", " + priority + '}';
    }

    @Override
    public int compareTo(User another) {
        return Integer.compare(priority, another.priority);
    }

  }
