package ru.job4j.calculator;

/**
* Class Calculator
* @author dvoeglazov
* @since 04.01.2019
*/

public class Calculator {
    private double result;



    public void add(double first, double second) {
        this.result = first + second;
    }


    public void sub(double first, double second) {
        this.result = first - second;
    }


    public void mul(double first, double second) {
        this.result = first * second;
    }


    public void div(double first, double second) {
        this.result = first / second;
    }

    public double getResult() {
        return this.result;
    }
}