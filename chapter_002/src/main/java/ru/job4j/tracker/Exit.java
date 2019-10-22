package ru.job4j.tracker;


import java.util.function.Consumer;

public class Exit extends BaseAction {
	private final Consumer<String> output;

	protected Exit(int key, String name, Consumer<String> output) {
		super(key, name);
		this.output = output;
	}

	@Override
	public String name() {
		return "=== Выход из программы ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		boolean run = true;
		while (true) {
			System.out.println("Вы вышли из программы");
			run = false;
			break;
		}
		return run;
	}

}

