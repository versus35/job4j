package ru.job4j.stragery;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PaintTest {
	private String std = System.lineSeparator();

	@Test
	public void whenDrawSquare() {
		// получаем ссылку на стандартный вывод в консоль.
		PrintStream stdout = System.out;
		// Создаем буфур для хранения вывода.
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		//Заменяем стандартный вывод на вывод в пямять для тестирования.
		System.setOut(new PrintStream(out));
		// выполняем действия пишушиее в консоль.
		new Paint().draw(new Square());
		// проверяем результат вычисления
		assertThat(
				new String(out.toByteArray()),
				is(
						new StringBuilder()
								.append("□□□□□□□□□").append(std)
								.append("□       □").append(std)
								.append("□       □").append(std)
								.append("□       □").append(std)
								.append("□□□□□□□□□").append(std)
								.append(System.lineSeparator())
								.toString()
				)
		);

	}

	@Test
	public void whenTriangle() {
		// получаем ссылку на стандартный вывод в консоль.
		PrintStream stdout = System.out;
		// Создаем буфур для хранения вывода.
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		//Заменяем стандартный вывод на вывод в пямять для тестирования.
		System.setOut(new PrintStream(out));
		// выполняем действия пишушиее в консоль.
		new Paint().draw(new Triangle());
		// проверяем результат вычисления
		assertThat(
				new String(out.toByteArray()),
				is(
						new StringBuilder()
								.append("    △").append(std)
								.append("   △ △").append(std)
								.append("  △   △").append(std)
								.append(" △     △").append(std)
								.append("△△△△△△△").append(std)
								.append(System.lineSeparator())
								.toString()
				)
		);
	}
}
