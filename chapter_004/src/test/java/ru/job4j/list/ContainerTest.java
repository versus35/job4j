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

    private Container<String> cont = new Container<>();
    private String first = "1";
    private String second = "2";
    private String third = "3";

    @Before
    public void fillList() {
        cont.add(first);
        cont.add(second);
        cont.add(third);
    }

    @Test
    public void whenAdd() {
        assertThat(cont.get(2), is(third));
    }

    @Test
    public void whenIteratorTest() {
        Iterator<String> iterator = cont.iterator();
        assertTrue(iterator.hasNext());
        assertThat(iterator.next(), is(first));
    }

    @Test(expected = ConcurrentModificationException.class)
    public void whenCheckMod() {
        cont.add("1");
        Iterator<String> it = cont.iterator();
        assertThat(it.hasNext(), Is.is(true));
        cont.add("2");
        it.hasNext();
    }


}