package ru.job4j.map;
/**
 * Тестирование класса MyHashMap.
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 08.02.2020.
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MyHashMapTest {
    MyHashMap<String, String> map;

    @Before
    public void setupMyMap() {
        map = new MyHashMap<>();
        for (int i = 0; i < 100; i++) {
            map.insert(Integer.toString(i), "User" + i);
        }
    }

    @Test
    public void whenAddSameElementThenFalse() {
        assertFalse(map.insert("5", "User5"));
    }

    @Test
    public void whenGetElementThenTrue() {
        assertThat(map.get("8"), is("User8"));
    }

    @Test
    public void whenDeleteElementThenTrue() {
        assertTrue(map.delete("1"));
        assertNull(map.get("1"));
    }

    @Test
    public void whenIteratorHasNextThenNext() {
        Iterator<String> myIterator = map.iterator();
        while (myIterator.hasNext()) {
            assertNotNull(myIterator.next());
        }
    }

    @Test
    public void whenNoNextThenException() {
        Iterator<String> myIterator = map.iterator();
        while (myIterator.hasNext()) {
            assertNotNull(myIterator.next());
        }
        try {
            myIterator.next();
            fail("Expected NoSuchElementException");
        } catch (NoSuchElementException e) {
            assertNotEquals("", e.getMessage());
        }
    }

    @Test
    public void whenChangeMapAndGetNextThenException() {
        Iterator<String> myIterator = map.iterator();
        map.delete("1");
        try {
            myIterator.next();
            fail("Expected ConcurrentModificationException");
        } catch (ConcurrentModificationException e) {
            assertNotEquals("", e.getMessage());
        }
    }

    @Test
    public void whenEqualsHashCodeTrue() {
        assertTrue(map.get("8").equals(map.get("8")));
        assertTrue(map.get("8").hashCode() == (map.get("8").hashCode()));
    }

    @Test
    public void whenEqualsHashcodeFalse() {
        assertFalse(map.get("5").equals(map.get("9")));
        assertFalse(map.get("5").hashCode() == (map.get("9").hashCode()));
    }
}
