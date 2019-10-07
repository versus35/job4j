package ru.job4j.tracker;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;


public class StartUITest {
	@Test
	public void whenExit() {
		StubInput input = new StubInput(
				new String[] {"0"}
		);
		StubAction action = new StubAction();
		new StartUI().init(input, new Tracker(), new UserAction[] { action });
		assertThat(action.isCall(), is(true));
	}

	@Test
	public void whenAddItem() {
		String[] answers = {"Fix PC"};
		Input input = new StubInput(answers);
		Tracker tracker = new Tracker();
		StartUI.createItem(input, tracker);
		Item created = tracker.findAll()[0];
		Item expected = new Item("Fix PC");
		assertThat(created.getName(), is(expected.getName()));
	}
	@Test
		public void whenReplaceItem() {
			Tracker tracker = new Tracker();
			Item item = new Item("new item");
			tracker.add(item);
			String[] answers = {
					item.getId(), // id сохраненной заявки в объект tracker.
					"replaced item"
			};
			StartUI.replaceItem(new StubInput(answers), tracker);
			Item replaced = tracker.findById(item.getId());
			assertThat(replaced.getName(), is("replaced item"));
		}
		@Test
	public void deleteItem() {
		Tracker tracker = new Tracker();
		Item item = new Item(null);
		tracker.add(item);
		String[] answers = {
				item.getId(),
				"null"
		};
		StartUI.deleteItem(new StubInput(answers), tracker);
		Item delete = null;
			assertThat(tracker.findById(item.getId()), is (delete));
		}
	@Test
	public void whenPrtMenu() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		PrintStream def = System.out;
		System.setOut(new PrintStream(out));
		StubInput input = new StubInput(
				new String[] {"0"}
		);
		StubAction action = new StubAction();
		new StartUI().init(input, new Tracker(), new UserAction[] { action });
		String expect = new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
				.add("Menu.")
				.add("0. Stub action")
				.toString();
		assertThat(new String(out.toByteArray()), is(expect));
		System.setOut(def);
	}

}