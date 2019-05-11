package ru.job4j.calculator;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Calculator test.
 *
 * @author Davud Utsumuev (dav.u2015@yandex.ru)
 * @version $Id$
 * @since 13.05.2019
 */
public class CalculatorTest {
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        double result = calc.add(1D, 1D);
        double expected = 2D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenSubtract5On2Then3() {
        Calculator calc = new Calculator();
        double result = calc.subtract(5D, 2D);
        double expected = 3D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenDiv2On2Then1() {
        Calculator calc = new Calculator();
        double result = calc.div(2D, 2D);
        double expected = 1D;
        assertThat(result, is(expected));
    }

    @Test
    public void whenMultiple3On3Then9() {
        Calculator calc = new Calculator();
        double result = calc.multiple(4D, 3D);
        double expected = 12D;
        assertThat(result, is(expected));
    }
}

