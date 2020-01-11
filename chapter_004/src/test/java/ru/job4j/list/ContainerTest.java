package ru.job4j.list;
/**
 * Тестирование класса Container.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 11.01.2020.
 */
import org.hamcrest.core.Is;
import org.junit.Before;
import org.junit.Test;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ContainerTest {

    private Container<Integer> list;

    @Before
    public void fillList() {
        list = new Container<>();
        list.add(1);
        list.add(2);
        list.add(3);
    }

    @Test
    public void whenAdd() {
        assertThat(list.get(2), is(3));
    }

    @Test
    public void whenDelete() {
        assertThat(list.delete(), is(1));
        assertThat(list.getSize(), is(2));
    }

    @Test
    public void whenIteratorTest() {
        Iterator<Integer> iterator = list.iterator();
        assertTrue(iterator.hasNext());
        assertThat(iterator.next(), is(1));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void whenCheckMod() {
        list.add(1);
        Iterator<Integer> it = list.iterator();
        assertThat(it.hasNext(), Is.is(true));
        list.add(2);
        it.hasNext();
    }


}