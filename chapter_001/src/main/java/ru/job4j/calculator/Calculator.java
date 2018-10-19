package ru.job4j.calculator;
/**
 * Class Класс для выполнения простых математических действий.
 * @author nakimov.
 * @since 19.10.2018.
 * @version 1.0.
 */

public class Calculator {
    /**
     * result пременная которая сохраняет результат действия
     */
    private double result;

    /**
     * Сложение
     * @param first первый аргумент.
     * @param second второй аргумент.
     */

    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Вычитание.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }

    /**
     * Деление.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Умножение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }

    public double getResult() {
        return this.result;
    }
}