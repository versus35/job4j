package ru.job4j.stragery;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TriangleTest {
	@Test
	public void whenTriangle() {
		Triangle triangle = new Triangle();
		assertThat(triangle.draw(),
				is(
						new StringBuilder()
								.append("    △")
								.append("   △ △")
								.append("  △   △")
								.append(" △     △")
								.append("△△△△△△△")
								.toString()

				));
	}
}
