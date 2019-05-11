package ru.job4j.calculator;

/**
 * Calculator.
 * @author Davud Utsumuev (dav.u2015@yandex.ru)
 * @version $Id$
 * @since 13.05.2019
 */
 public class Calculator {
    /**
     * Сложение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public double add(double first, double second) {
        return first + second;
    }
    /**
     * Вычетание.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public double subtract(double first, double second) {
        return first - second;
    }
    /**
     * Деление.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public double div(double first, double second) {
         return first / second;
    }
    /**
     * Умножение.
     * @param first первый аргумент.
     * @param second второй аргумент.
     */
    public double multiple(double first, double second) {
         return first * second;
    }
}