package ru.job4j.tracker;

import java.util.function.Consumer;

public class DeleteItem extends BaseAction {
	private final Consumer<String> output;

	protected DeleteItem(int key, String name, Consumer<String> output) {
		super(key, name);
		this.output = output;
	}

	@Override
	public String name() {
		return "=== Удаление заявки ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Удаление заявки --");
		System.out.println("Введите имя: ");
		String name = input.ask(" ");
		System.out.println("Введите ID заявки: ");
		String id = input.ask("");
		if (tracker.delete(id)) {
			System.out.println("Заявка " + id + " удалена");
		}
		return true;
	}
}
