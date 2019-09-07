package ru.job4j.loop;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        //напишите здесь тест, проверяющий, что факториал для числа 5 равен 120.
        Factorial fact = new  Factorial();
        int result = fact.calc(5);
        assertThat(result, is (120));
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        //напишите здесь тест, проверяющий, что факториал для числа 0 равен 1.
        Factorial fact = new Factorial();
        int result = fact.calc(0);
        assertThat(result, is (1));
    }
}