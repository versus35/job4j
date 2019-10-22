package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FindByNameAction extends BaseAction {
	private final Consumer<String> output;

	protected FindByNameAction(int key, String name, Consumer<String> output) {
		super(key, name);
		this.output = output;
	}

	@Override
	public String name() {
		return "=== Поиск заявки по имени ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		boolean found = false;
		System.out.println("-- Поиск заявки по имени --");
		System.out.println("Введите имя: ");
		String name = input.ask("");
//		Item item = tracker.findByName(name);
		for(Item item :tracker.findByName(name))
		if (item != null) {
			System.out.println("Заявка " + item.getName());
			System.out.println("Имя " + item.getId());
			found = true;
		}
		if (!found) {
			System.out.println("Заявка не найдена: ");
		}

		return true;
	}
}
