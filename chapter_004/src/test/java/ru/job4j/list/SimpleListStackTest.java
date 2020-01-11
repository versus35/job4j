package ru.job4j.list;
/**
 * Тестирование класса SimpleListStack.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 12.01.2020.
 */
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SimpleListStackTest {

    private SimpleListStack<String> stack;

    @Before
    public void createStack() {
        stack = new SimpleListStack<>();
    }

    @Test
    public void whenPushItems() {
        stack.push("1");
        stack.push("2");
        stack.push("3");
        assertThat(stack.poll(), is("3"));
        assertThat(stack.poll(), is("2"));
        assertThat(stack.poll(), is("1"));
    }

}