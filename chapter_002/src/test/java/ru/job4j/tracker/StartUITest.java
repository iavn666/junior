package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    // поле содержит дефолтный вывод в консоль.
    private final PrintStream stdout = System.out;
    // буфер для результата.
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();


   // public final StartUI   = new StartUI();



    @Before
    public void loadOutput() {
        System.out.println("execute before method");
        System.setOut(new PrintStream(this.out));
    }

    @After
    public void backOutput() {
        System.setOut(this.stdout);
        System.out.println("execute after method");
    }

    @Test
    public void allItemRefa() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Item item = tracker.add(new Item("test name", "desc", 1));
        Input input = new StubInput(new String[]{"1", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(this.out.toString(), is(new StringBuilder()
                .append("Меню.")
                .append(System.lineSeparator())
                .append("0. Add new Item")
                .append(System.lineSeparator())
                .append("1. Show all items")
                .append(System.lineSeparator())
                .append("2. Edit item")
                .append(System.lineSeparator())
                .append("3. Delete item")
                .append(System.lineSeparator())
                .append("4. Find item by Id")
                .append(System.lineSeparator())
                .append("5. Find items by name")
                .append(System.lineSeparator())
                .append("6. Exit Program")
                .append(System.lineSeparator())
                .append("------------ Показать все заявки --------------")
                .append(System.lineSeparator())
                .append(item + "")
                .append(System.lineSeparator())
                .append("------------ Результат : " + Arrays.toString(new Item[]{item}) + "------------")
                .append(System.lineSeparator())
                .append("Меню.")
                .append(System.lineSeparator())
                .append("0. Add new Item\r\n")
                .append("1. Show all items\r\n")
                .append("2. Edit item\r\n")
                .append("3. Delete item\r\n")
                .append("4. Find item by Id\r\n")
                .append("5. Find items by name\r\n")
                .append("6. Exit Program\r\n")
                .toString()
        ));

    }


    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(this.out.toString(), is(new StringBuilder()
                .append("Меню.\r\n")
                .append("0. Add new Item\r\n")
                .append("1. Show all items\r\n")
                .append("2. Edit item\r\n")
                .append("3. Delete item\r\n")
                .append("4. Find item by Id\r\n")
                .append("5. Find items by name\r\n")
                .append("6. Exit Program\r\n")
                .append("------------ Добавление новой заявки --------------\r\n")
                .append("------------ Новая заявка с getId : " + tracker.findAll()[0].getId() + "-----------\r\n")
                .append("Меню.\r\n")
                .append("0. Add new Item\r\n")
                .append("1. Show all items\r\n")
                .append("2. Edit item\r\n")
                .append("3. Delete item\r\n")
                .append("4. Find item by Id\r\n")
                .append("5. Find items by name\r\n")
                .append("6. Exit Program\r\n")
                .toString()
        ));
    }

    @Test
    public void whenUserDeleteItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();// создаём Tracker
        Item item = tracker.add(new Item("test name", "desc", 1));
        Input input = new StubInput(new String[]{"3", item.getId(), "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(this.out.toString(), is(new StringBuilder()
                .append("Меню.\r\n")
                .append("0. Add new Item\r\n")
                .append("1. Show all items\r\n")
                .append("2. Edit item\r\n")
                .append("3. Delete item\r\n")
                .append("4. Find item by Id\r\n")
                .append("5. Find items by name\r\n")
                .append("6. Exit Program\r\n")
                .append("------------ Удаление заявок --------------\r\n")
                .append("Item with id : " + "$s was delete" + "\r\n")
                .append("Меню.\r\n")
                .append("0. Add new Item\r\n")
                .append("1. Show all items\r\n")
                .append("2. Edit item\r\n")
                .append("3. Delete item\r\n")
                .append("4. Find item by Id\r\n")
                .append("5. Find items by name\r\n")
                .append("6. Exit Program\r\n")
                .toString()
        ));
    }

    @Test
    public void whenUserFindItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();// создаём Tracker
        Item item = tracker.add(new Item("test name", "desc", 1));
        Input input = new StubInput(new String[]{"4", item.getId(), "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(this.out.toString(), is(new StringBuilder()
                .append("0. Add new Item.\r\n")
                .append("1. Show all items.\r\n")
                .append("2. Edit items.\r\n")
                .append("3. Delete items.\r\n")
                .append("4. Find Item By Id.\r\n")
                .append("5. Find Items by name\r\n")
                .append("6. Exit Program\r\n")
                .append("------------ Find Item By Id. -------------\r\n")
                .append("------------ Search results -----------\r\n")
                .append(tracker.findById(item.getId())+ "\r\n")
                .append("0. Add new Item.\r\n")
                .append("1. Show all items.\r\n")
                .append("2. Edit items.\r\n")
                .append("3. Delete items.\r\n")
                .append("4. Find Item By Id.\r\n")
                .append("5. Find Items by name\r\n")
                .append("6. Exit Program\r\n")
                .append("------------ Exit program. -------------\r\n")
                .toString()
        ));
    }

    //Результат : " +
    @Test
    public void whenUserFindItembyName() {
        Tracker tracker = new Tracker();// создаём Tracker
        Item item = tracker.add(new Item("test name", "desc", 1));
        Input input = new StubInput(new String[]{"5", item.getName(), "6"});
        new StartUI(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(this.out.toString(),is(new StringBuilder()
                .append("0. Add new Item.\r\n")
                .append("1. Show all items.\r\n")
                .append("2. Edit items.\r\n")
                .append("3. Delete items.\r\n")
                .append("4. Find Item By Id.\r\n")
                .append("5. Find Items by name\r\n")
                .append("6. Exit Program\r\n")
                .append("------------ Find Items by name. -------------\r\n")
                .append("---------- Result : -------------\r\n")
                .append((Arrays.toString(new Item[]{item})) + "\r\n")
                .append("0. Add new Item.\r\n")
                .append("1. Show all items.\r\n")
                .append("2. Edit items.\r\n")
                .append("3. Delete items.\r\n")
                .append("4. Find Item By Id.\r\n")
                .append("5. Find Items by name\r\n")
                .append("6. Exit Program\r\n")
                .append("------------ Exit program. -------------\r\n")
                .toString()
        ));
    }




    @Test
    public void whenUpdateThenTrackerHasUpdatedValue() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item("test name", "desc", 1));
        //создаём StubInput с последовательностью действий(производим замену заявки)
        Input input = new StubInput(new String[]{"2", item.getId(), "test replace", "заменили заявку", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUI(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test replace"));
    }
}
