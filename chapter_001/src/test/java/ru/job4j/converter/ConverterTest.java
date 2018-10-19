package ru.job4j.converter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Корвертор валюты.
 */

public class ConverterTest {

    @Test

    public void when60RubleToDollarThen1() {
        Converter converter = new Converter();
        int result = converter.RubleToDollar(60);
        assertThat(result, is(1));
    }

    @Test
       public void when70RubleToEuroThen1() {
        Converter converter = new Converter();
        int result = converter.RubleToEuro(70);
        assertThat(result, is(1));
    }
    @Test

    public void whenTwoDollarTo60RubleThen120() {
        Converter converter = new Converter();
        int result = converter.DollarToRuble(2);
        assertThat(result, is(120));
    }
    @Test

    public void whenEuroTo70RubleThen70() {
        Converter converter = new Converter();
        int result = converter.EuroToRuble(1);
        assertThat(result, is(70));
    }
}
