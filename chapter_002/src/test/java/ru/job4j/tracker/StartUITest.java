package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.StringJoiner;


public class StartUITest {
	private final PrintStream stdout = System.out;
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private final String menu = "0. Add new Item." + System.lineSeparator()
			+ "1. Edit Item." + System.lineSeparator()
			+ "2. Show all items." + System.lineSeparator()
			+ "3. Delete item." + System.lineSeparator()
			+ "4. Find item by ID." + System.lineSeparator()
			+ "5. Find item by Name." + System.lineSeparator()
			+ "6. Exit program." + System.lineSeparator();

	@Before
	public void loadOutput() {
		System.out.println("execute before method");
		System.setOut(new PrintStream(out));
	}
	@After
	public void backOutput() {
		System.setOut(stdout);
		System.out.println("execute after method");
	}
	@Test
	public void whenExit() {
		StubInput input = new StubInput(
				new String[] {"0"}
		);
		StubAction action = new StubAction();
		new StartUI().init(input, new Tracker(), new UserAction[] { action });
		assertThat(action.isCall(), is(true));
	}

//	@Test
//	public void whenAddItem() {
//		String[] answers = {"Fix PC"};
//		Input input = new StubInput(answers);
//		Tracker tracker = new Tracker();
//		StartUI.createItem(input, tracker);
//		Item created = tracker.findAll()[0];
//		Item expected = new Item("Fix PC");
//		assertThat(created.getName(), is(expected.getName()));
//	}
//	@Test
//		public void whenReplaceItem() {
//			Tracker tracker = new Tracker();
//			Item item = new Item("new item");
//			tracker.add(item);
//			String[] answers = {
//					item.getId(), // id сохраненной заявки в объект tracker.
//					"replaced item"
//			};
//			StartUI.replaceItem(new StubInput(answers), tracker);
//			Item replaced = tracker.findById(item.getId());
//			assertThat(replaced.getName(), is("replaced item"));
//		}
//		@Test
//	public void deleteItem() {
//			Tracker tracker = new Tracker();
//			long created = System.currentTimeMillis();
//			Item item = tracker.add(new Item("test name", "desc", created));
//			Input input = new StubInput(new String[]{"3", item.getId(), "y"});
//			new StartUI(input, tracker).init();
//			Item delItem = null;
//			assertThat(tracker.findById(item.getId()), is(delItem));
//		}
	@Test
	public void whenPrtMenu() {
		StubInput input = new StubInput(
				new String[] {"0"}
		);
		StubAction action = new StubAction();
		new StartUI().init(input, new Tracker(), new UserAction[] { action });
		String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("0. Stub action")
				.toString();
		assertThat(new String(out.toByteArray()), is(expect));
		System.setOut(stdout);
	}

}