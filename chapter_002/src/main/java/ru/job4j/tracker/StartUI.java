package ru.job4j.tracker;


import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StartUI {

	private boolean exit = true;
	private MenuTracker menu;

	private final Input input;


	public StartUI(Input input, Tracker tracker, Consumer<String> output) {
		this.input = input;
		this.menu = new MenuTracker(output, this.input, tracker);

	}

	public void init() {
		menu.fillActions(this);
		List<Integer> key = menu.range();
		do {
			menu.show();
			int ask = this.input.ask("ВВЕДИТЕ ПУНКТ МЕНЮ : ", key);
			menu.select(ask);
		} while (this.exit);
	}


	public void exit() {
		this.exit = false;
	}

	public static void main(String[] args) {
		new StartUI(
				new ValidateInput(
						new ConsoleInput()
				),
				new Tracker(),
				System.out::println)
				.init();
	}
}