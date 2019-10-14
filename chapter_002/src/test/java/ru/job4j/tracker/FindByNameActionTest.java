package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FindByNameActionTest {
	@Test
	public void whenByName() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PrintStream def = System.out;
		System.setOut(new PrintStream(out));
		Tracker tracker = new Tracker();
		Item item = new Item("Find Name");
		tracker.add(item);
		FindByNameAction act = new FindByNameAction(4, "Поиск завки по имени");
		act.execute(new StubInput(new String[]{}), tracker);
		String expect = new StringJoiner(System.lineSeparator())
				.add(item.getName())
				.toString();
		assertThat(item.getName(), is(expect));
		System.setOut(def);
	}
}
