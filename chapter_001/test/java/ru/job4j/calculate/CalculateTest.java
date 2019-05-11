package ru.job4j.calculate;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Davud Utsumuev (dav.u2015@yandex.ru)
 * @version 1.3
 * @since 02.05.2019
 */
public class CalculateTest {
 /**
 * Test echo.
 */
 @Test
 public void whenTakeNameThenThreeEchoPlusName() {
    String input = "Davud Utsumuev";
    String expect = "Echo, echo, echo : Davud Utsumuev"; 
    Calculate calc = new Calculate();
    String result = calc.echo(input);
    assertThat(result, is(expect));
 }
}