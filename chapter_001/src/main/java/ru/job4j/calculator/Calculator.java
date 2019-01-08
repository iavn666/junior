package ru.job4j.calculator;

/**
* Class Calculator
* @author dvoeglazov
* @since 04.01.2019
*/

public class Calculator {
    private double result;

    /**
     * Сложение
     * @param first первый аргумент
     * @param second второй аргумент
    */

    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Вычитанее
     * @param first первый аргумент
     * @param second второй аргумент
     */

    public void sub(double first, double second) {
        this.result = first - second;
    }
    /**
     * Умножение
     * @param first первый аргумент
     * @param second второй аргумент
     */

    public void mul(double first, double second) {
        this.result = first * second;
    }
    /**
     * Деление
     * @param first первый аргумент
     * @param second второй аргумент
     */

    public void div(double first, double second) {
        this.result = first / second;
    }

    public double getResult() {
        return this.result;
    }
}