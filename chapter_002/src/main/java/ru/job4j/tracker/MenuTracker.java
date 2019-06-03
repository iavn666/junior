package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;

public class MenuTracker {
    /**
     * @param хранит ссылку на объект .
     */
    private Input input;
    /**
     * @param хранит ссылку на объект .
     */
    private Tracker tracker;
    /**
     * @param хранит ссылку на массив типа UserAction.
     */
    private List<UserAction> actions = new ArrayList<UserAction>();

    /**
     * Конструктор.
     *
     * @param input   объект типа Input
     * @param tracker объект типа Tracker
     */
    public MenuTracker(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }

    /**
     * Метод для получения массива меню.
     *
     * @return длину массива
     */
    public int getActionsLentgh() {
        return this.actions.size();
    }

    /**
     * Метод заполняет массив.
     */
    public void fillActions() {
        this.actions.add(new AddItem(0, "Add program"));
        this.actions.add(new ShowItems(1, "Show all items"));
        this.actions.add(new UpdateItem(2, "Edit item"));
        this.actions.add(new DeleteItem(3, "Delete item"));
        this.actions.add(new FindItemById(4, "Find item by Id"));
        this.actions.add(new FindItemsByName(5, "Find items by name"));
        this.actions.add(new ExitProgram(6, "Exit Program"));
    }

    public class AddItem implements UserAction {
        public AddItem(int i, String add_program) {

        }

        @Override
        public int key() {
            return 0;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Adding new item --------------");
            String name = input.ask("Please, provide item name:");
            String desc = input.ask("Please, provide item description:");
            Item item = new Item(name, desc, 1);
            tracker.add(item);
            System.out.println("------------ New Item with Id : " + item.getId());
            System.out.println("------------ New Item with Name : " + item.getName());
            System.out.println("------------ New Item with Description : " + item.getDecs());
        }

        @Override
        public String info() {
            return "0. Add new Item.";
        }
    }

    public class ShowItems implements UserAction {
        public ShowItems(int i, String add_program) {

        }

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Show all items -------------");
            for (Item item : tracker.findAll()) {
                System.out.println(String.format("%s. %s", item.getName(), item.getId()));
            }

        }

        @Override
        public String info() {
            return "1. Show all items.";
        }
    }

    public class UpdateItem implements UserAction {
        public UpdateItem(int i, String add_program) {

        }

        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Edit items. -------------");
            String id = input.ask("Enter id item :");
            String name = input.ask("Enter name item :");
            String desc = input.ask("Enter desc item :");
            Item item = new Item(name, desc, 1);
            if (tracker.replace(id, item)) {
                System.out.println("Results : true");
            } else {
                System.out.println("Results : false");
            }

        }

        @Override
        public String info() {
            return "2. Edit items.";
        }
    }

    public class DeleteItem implements UserAction {
        public DeleteItem(int i, String add_program) {

        }

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Delete items. -------------");
            String id = input.ask("Enter id items :");
            if (tracker.delete(id)) {
                System.out.println(String.format("Item with id : $s was delete", id));
            } else {
                System.out.println("Item not found");
            }

        }

        @Override
        public String info() {
            return "3. Delete items.";
        }
    }

    public class FindItemById implements UserAction {
        public FindItemById(int i, String add_program) {

        }

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Find Item By Id. -------------");
            String id = input.ask("Enter id item :");
            Item items = tracker.findById(id);
            if (items != null) {
                System.out.println("------------ Search results -----------");
                System.out.println(items);
            } else {
                System.out.println("------------ Search results : null -----------");
            }

        }

        @Override
        public String info() {
            return "4. Find Item By Id.";
        }
    }

    public class FindItemsByName implements UserAction {
        public FindItemsByName(int i, String add_program) {

        }

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Find Items by name. -------------");
            String name = input.ask("Enter name items :");
            Item[] all = tracker.findByName(name);
            if (all.length > 0) {
                for (Item item : all) {
                    System.out.println("---------- Result : -------------");
                    System.out.println(item);
                }
            } else {
                System.out.println("NO ITEM");
            }

        }

        @Override
        public String info() {
            return "5. Find Items by name";
        }
    }

    public class ExitProgram implements UserAction {
        public ExitProgram(int i, String add_program) {

        }

        @Override
        public int key() {
            return 6;
        }

        @Override
        public void execute(Input input, Tracker tracker) {
            System.out.println("------------ Exit program. -------------");
            MenuTracker menu = new MenuTracker(input, tracker);
            menu.fillActions();
            do {
                int key = Integer.valueOf(input.ask("Are you sure? :"));
                menu.select(key);
               } while (!"y".equals(input.ask("Exit?(y): ")));

        }

        @Override
        public String info() {
            return "6. Exit program";
        }
    }


    /**
     * Метод в зависимости от указанного ключа, выполняет соотвествующие действие.
     *
     * @param key ключ операции
     */
    public void select(int key) {
        this.actions.get(key).execute(this.input, this.tracker);
    }

    /**
     * Метод выводит на экран меню.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }
}