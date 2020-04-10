package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static java.util.Arrays.copyOf;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */


    private final List<Item> items = new ArrayList<>();
    private static final Random RN = new Random();


    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод реализаущий добавление заявки в хранилище
     *
     * @param item новая заявка
     */
    public Item add(Item item) { // брейкпоинт
        item.setId(this.generateId());
        this.items.set(this.position++, item);
        return item;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (items.get(index).equals(id)) {
                item.setId(id);
                items.add(index, item);
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (items.get(index).equals(id)) {
                items.remove(index--);
                System.arraycopy(items, index + 1, items, index, items.size() - 1 - index);
                result = true;
                break;
            }
        }
        return result;
    }

    public List<Item> findAll() {
        return new ArrayList<>();
    }



    /**
     * Метод поиска заявок по имени
     * @param key - Искомые значения
     * @return Массив полученных значений
     */
    public List<Item> findByName(String key) {
         List<Item> result = new ArrayList<>(this.position);
        int a = 0;
        for (int index = 0; index != position; index++) {
            if (items.get(index).getName().equals(key)) {
                //items.add();
                a++;
            }
        }
        return result;
    }

    public Item findById(String id) {
        Item finded = null;
        for (int m = 0; m != position; m++) {
            if (items.get(m).getId().equals(id)) {
                finded = items.get(m);
                break;
            }
        }
        return finded;
    }


        private String generateId() {
            return String.valueOf(System.currentTimeMillis() + RN.nextInt());
        }


}