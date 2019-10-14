package ru.job4j.tracker;


public class WhenExist implements UserAction {
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

