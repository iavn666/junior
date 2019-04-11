package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @version $Id$
 * @since 0.1
 */
public class StartUI {

    private static final String ADD = "0";
    private static final String SHOWALLITEMS = "1";
    private static final String EDITITEM = "2";
    private static final String DELITEITEM = "3";
    private static final String FINDID = "4";
    private static final String FINDITEMNAME = "5";
    private static final String EXIT = "6";


    private final Input input;

    /**
     * Хранилище заявок.
     */
    private final Tracker tracker;

    /**
     * Конструтор инициализирующий поля.
     * @param input ввод данных.
     * @param tracker хранилище заявок.
     */
    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    public void init() {
        boolean exit = false;
        while (!exit) {
            this.showMenu();
            String answer = this.input.ask("Введите пункт меню : ");
            if (ADD.equals(answer)) {
                this.createItem();
             } else if (FINDID.equals(answer)) {
                this.findid();
             } else if (EXIT.equals(answer)) {
                exit = true;
             } else if (SHOWALLITEMS.equals(answer)) {
                this.showallitems();
             } else if (EDITITEM.equals(answer)) {
                this.edititem();
             } else if (DELITEITEM.equals(answer)) {
                this.deliteitem();
             } else if (FINDITEMNAME.equals(answer)) {
                this.finditemname();
            }
        }
    }

    private void showallitems() {
        System.out.println("------------ Показать все заявки --------------");
        System.out.println("------------ Результат : " + Arrays.toString(this.tracker.findAll()) + "------------");
    }


    private void deliteitem() {
        System.out.println("------------ Удаление заявок --------------");
        String id = this.input.ask("Введите id заявки :");
        System.out.println("------------ Результат: " + this.tracker.delete(id) + " --------------");

    }

    private void finditemname() {
        System.out.println("------------ Поиск заявки по имени --------------");
        String name = this.input.ask("Введите имя заявки :");
        System.out.println("---- Результат : " + Arrays.toString(this.tracker.findByName(name)) + " ---------");

    }

    private void findid() {
        System.out.println("------------ Поиск заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        System.out.println("------------ Результат поиска : " + this.tracker.findById(id)  + "-----------");
    }
    /**
     * Метод реализует добавленяи новый заявки в хранилище.
     */
    private void createItem() {
        System.out.println("------------ Добавление новой заявки --------------");
        String name = this.input.ask("Введите имя заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item(name, desc,1);
        this.tracker.add(item);
        System.out.println("------------ Новая заявка с getId : " + item.getId() + "-----------");
    }

    private void edititem() {
        System.out.println("------------ Редактирование заявки --------------");
        String id = this.input.ask("Введите id заявки :");
        String desc = this.input.ask("Введите описание заявки :");
        Item item = new Item("home", desc,2);
        System.out.println("------------ Результат: " + this.tracker.replace(id, item) + " --------------");
    }

    private void showMenu() {
        System.out.println("Меню.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    /**
     * Запускт программы.
     * @param args
     */
    public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
    }
}
