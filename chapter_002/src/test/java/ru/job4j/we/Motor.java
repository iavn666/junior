package ru.job4j.we;

public class Motor implements Signal {

    public void motorOn() {
        System.out.println("Мотор завелся");
    }

    @Override
    public void signal() {
        motorOn();
    }
}
