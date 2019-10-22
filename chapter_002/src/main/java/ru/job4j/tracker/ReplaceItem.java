package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class ReplaceItem extends BaseAction {
	private final Consumer<String> output;

	protected ReplaceItem(int key, String name, Consumer<String> output) {
		super(key, name);
		this.output = output;
	}

	@Override
	public String name() {
		return "=== Редактирование заявки ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Редактирование заявки --");
		System.out.println("Введите ID заявки: ");
		String id = input.ask("");
		System.out.println("Введите имя: ");
		String name = input.ask("");
		Item item1 = new Item(name);
		if (tracker.replace(item1, id)) {
			System.out.println("Заявка: " + id + " обновлена");
		} else {
			System.out.println("Заявки с ID: " + id + " не существует");
		}
		return true;
	}
}
