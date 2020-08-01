package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionarys {

    private ArrayList<Person> personse = new ArrayList<Person>();

    public void add(Person persons) {
        this.personse.add(persons);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person person: personse) {
            if (person.getName().contains(key) == true) {
                result.add(person);
            }

        }
        return result;
    }

}
