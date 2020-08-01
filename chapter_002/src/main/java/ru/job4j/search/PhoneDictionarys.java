package ru.job4j.search;

import java.util.ArrayList;

public class PhoneDictionarys {

    private ArrayList<Persons> personse = new ArrayList<Persons>();

    public void add(Persons persons) {
        this.personse.add(persons);
    }

    /**
     * Вернуть список всех пользователей, который содержат key в любых полях.
     *
     * @param key Ключ поиска.
     * @return Список подощедщих пользователей.
     */
    public ArrayList<Persons> find(String key) {
        ArrayList<Persons> result = new ArrayList<>();
        for (Persons person : personse) {
            if ((person.getName().contains(key) ||
                    person.getAddress().contains(key) ||
                    person.getPhone().contains(key) || person.getSurname().contains(key) == true)) {
                result.add(person);
            }

        }
        return result;
    }

}
