package ru.job4j.list;

import static org.hamcrest.core.Is.is;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleQueueTest {
    private SimpleQueue<String> queue;

    @Before
    public void createQueue() {
        queue = new SimpleQueue();
    }

    @Test
    public void whenOneToSecondToThird() {
        queue.push("1");
        queue.push("2");
        queue.push("3");
        assertThat(queue.poll(), is("1"));
        assertThat(queue.poll(), is("2"));
        assertThat(queue.poll(), is("3"));
    }

    @Test
    public void whenFalse() {
        queue.push("1");
        queue.push("2");
        queue.poll();
        queue.push("3");
        assertThat(queue.poll(), is("2"));
        assertThat(queue.poll(), is("3"));
    }

}