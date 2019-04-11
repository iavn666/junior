package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Random;

/**
 * @version $Id$
 * @since 0.1
 */
public class Tracker {
    /**
     * Массив для хранение заявок.
     */
    private final Item[] items = new Item[100];
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
        this.items[this.position++] = item;
        return item;
    }

    public boolean replace(String id, Item item) {
        boolean result = false;
        for (int index = 0; index != this.position; index++) {
            if (items[index].getId().equals(id)) {
                item.setId(id);
                items[index] = item;
                result = true;
                break;
            }
        }
        return result;
    }

    public boolean delete(String id) {
        boolean result = false;
        Item[] arrey = new Item[99];
        for (int index = 0; index != this.position; index++) {
            if (items[index].getId().equals(id)) {
                items[index] = null;
                System.arraycopy(items, index + 1, arrey, index, items.length - 1 - index);
                result = true;
                break;
            }
        }
        return result;
    }

    public Item[] findAll() {
        return Arrays.copyOf(this.items, position);
    }

    /**
     * Метод поиска заявок по имени
     * @param key - Искомые значения
     * @return Массив полученных значений
     */
    public Item[] findByName(String key) {
         Item[] result = new Item[this.position];
        int a = 0;
        for (int index = 0; index != position; index++) {
            if (items[index].getName().equals(key)) {
                result[a] = items[index];
                a++;
            }
        }
        return Arrays.copyOf(result, a );
    }

    public Item findById(String id) {
        Item finded = null;
        for (int m = 0; m != position; m++) {
            if (items[m].getId().equals(id)) {
                finded = items[m];
                break;
            }
        }
        return finded;
    }


        private String generateId() {
            return String.valueOf(System.currentTimeMillis() + RN.nextInt());
        }


}