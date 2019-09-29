package ru.job4j.oop;

import org.junit.Ignore;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class TriangleTest {

	@Test
	public void whenExist() {
		Point a = new Point(2, 3);
		Point b = new Point(0, 0);
		Point c = new Point(1, 0);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = 1.500000000000002;
		assertThat(result, is(expected));

	}

	@Test
	public void notExist() {
		Point a = new Point(2, 0);
		Point b = new Point(0, 0);
		Point c = new Point(1, 0);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = -1;
		assertThat(result, is(expected));
	}
}

