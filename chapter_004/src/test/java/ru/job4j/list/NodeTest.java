package ru.job4j.list;
/**
 * Тестирование класса Node;
 *
 * @author Bulankin Viktor.
 * @version $Id$.
 * @since 15.01.2020.
 */

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class NodeTest {
    Node<Integer> first;
    Node<Integer> second;
    Node<Integer> third;
    Node<Integer> four;

    @Before
    public void setUp() {
        first = new Node<>(1);
        second = new Node<>(2);
        third = new Node<>(3);
        four = new Node<>(4);
    }

    @Test
    public void whenHashCycleOneFourElementThenResultTrue() {
        first.next = second;
        second.next = third;
        third.next = four;
        four.next = first;
        assertThat(Node.hashCycle(first), is(true));
    }

    @Test
    public void whenHashCycleOneSecondElementThenResultTrue() {
        first.next = second;
        second.next = first;
        third.next = four;
        assertThat(Node.hashCycle(first), is(true));
    }

    @Test
    public void whenHashNotCycleThenResultFalse() {
        first.next = second;
        second.next = third;
        third.next = four;
        assertThat(Node.hashCycle(first), is(false));
    }
}