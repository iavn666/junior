package ru.job4j.we;

public class Wheel implements Signal {

    public void whellOn() {
        System.out.println("Колесо крутится");
    }

    @Override
    public void signal() {
        whellOn();
    }
}
