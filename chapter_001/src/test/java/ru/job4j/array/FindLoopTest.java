package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {5, 10, 3};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }
    @Test
    public void  whenArrayHas5Then2() {
        FindLoop find = new FindLoop();
        int[] input = new int[] {10, 3, 5};
        int value = 5;
        int result = find.indexOf(input, value);
        int expect = 2;
        assertThat(result, is(expect));

    }
    @Test
    public  void whenArrayHas3Then2(){
        FindLoop find = new FindLoop();
        int [] input = new int [] {3, 2, 6};
        int value = -1;
        int result = find.indexOf(input, value);
        int expect = -1;
        assertThat(result, is (expect));
    }
    @Test
        public void whenFind3() {
            int[] input = new int[]{5, 2, 10, 3, 4};
            int value = 4;
            int start = 2;
            int finish = 4;
            int result = FindLoop.indexOf(input, value, start, finish);
            int expect = 4;
            assertThat(result, is(expect));
        }

    @Test
    public void whenArrayHasLeigh5Then0() {
        int[] input = new int[] {5, 10, 3};
        int value = -1;
        int start = 10;
        int finish = 6;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}


