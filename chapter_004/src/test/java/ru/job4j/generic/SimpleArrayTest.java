package ru.job4j.generics;

import org.junit.Test;

import java.util.Iterator;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class SimpleArrayTest {

    @Test
    public void intHasNext() {
        SimpleArray<Integer> testArray = new SimpleArray<Integer>(10);
        testArray.add(1);
        testArray.add(2);
        Iterator it = testArray.iterator();
        assertThat(it.hasNext(), is(true));
        it.next();
        assertThat(it.hasNext(), is(true));
        it.next();
        assertThat(it.hasNext(), is(false));
    }

    @Test
    public void intNext() {
        SimpleArray<Integer> testArray = new SimpleArray<Integer>(10);
        testArray.add(1);
        testArray.add(2);
        Iterator it = testArray.iterator();
        assertThat(it.hasNext(), is(true));
        it.next();
        assertThat(it.hasNext(), is(true));
        it.next();
        assertThat(it.hasNext(), is(false));
    }

    @Test
    public void addIntegerTwo() {
        SimpleArray<Integer> testArray = new SimpleArray<Integer>(10);
        testArray.add(2);
        int result = testArray.get(0);
        assertThat(result, is(2));
    }

    @Test
    public void setInteger() {
        SimpleArray<Integer> testArray = new SimpleArray<>(10);
        testArray.add(2);
        testArray.set(0, 3);
        int result = testArray.get(0);
        assertThat(result, is(3));
    }

    @Test
    public void deleteInteger() {
        SimpleArray<Integer> testArray = new SimpleArray<>();
        testArray.add(1);
        testArray.add(2);
        testArray.add(3);
        testArray.remove(1);
        int result = testArray.get(1);
        assertThat(result, is(2));
    }


}