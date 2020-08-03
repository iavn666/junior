package ru.job4j.we;

public class Main {

    public static void main(String[] args) {
        Gas auto = new Gas();
        Motor motor = new Motor();
        Wheel wheel = new Wheel();
        auto.add(motor);
        auto.add(wheel);
        auto.gasOn();


    }
}
