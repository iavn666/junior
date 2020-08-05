package ru.job4j.collection;

import java.util.Collection;
import java.util.Objects;

public class Users implements Comparable<Users> {
    private String name;
    private int age;

    public Users(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Users o) {
        int res = 0;
        if (this.name.equals(o.name)) {
            res = Integer.compare(this.age, o.age);
        } else {
            res = this.name.compareTo(o.name);
        }
        return res;
    }

    // В модели должны быть поля: имя и возраст. Предусмотреть ситуацию, когда два пользователя имеют одинаковое имя. В этом случае нужно сравнить их возраст.

    // Класс User должен реализовать интерфейс Comparable.


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Users user = (Users) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }


}