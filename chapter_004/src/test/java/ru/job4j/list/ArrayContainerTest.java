package ru.job4j.list;
/**
 * Тестирование класса ArrayContainer.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 10.01.2020.
 */
import org.junit.Before;
import org.junit.Test;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ArrayContainerTest {
    ArrayContainer<String> container;

    @Before
    public void setContainer() {
        container = new ArrayContainer<>(2);
    }

    @Test
    public void whenAddItem() {
        container.add("1");
        assertThat(container.get(0), is("1"));
    }

    @Test
    public void whenTwoArraySize() {
        container.add("1");
        container.add("2");
        container.add("3");
        assertThat(container.get(2), is("3"));
    }

    @Test
    public void whenIteratorTest() {
        container.add("1");
        container.add("2");
        Iterator<String> it = container.iterator();
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is("1"));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is("2"));
        assertThat(it.hasNext(), is(false));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void whenCheckMod() {
        container.add("1");
        Iterator<String> it = container.iterator();
        assertThat(it.hasNext(), is(true));
        container.add("2");
        it.hasNext();
    }
}