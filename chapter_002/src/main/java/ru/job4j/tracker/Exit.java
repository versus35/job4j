package ru.job4j.tracker;


public class Exit extends BaseAction {

	protected Exit(int key, String name) {
		super(key, name);
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

