package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FindByIdAction extends BaseAction {
	private final Consumer<String> output;

	protected FindByIdAction(int key, String name, Consumer<String> output) {
		super(key, name);
		this.output = output;
	}

	@Override
	public String name() {
		return "=== Поиск заявки по ID ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Поиск заявки по ID --");
		System.out.println("Введите ID заявки: ");
		String id = (input.ask(""));
		Item item = tracker.findById(id);
			if (item != null) {
				System.out.println("Заявка " + item.getId());
				System.out.println("Имя " + item.getName());
			} else if (tracker.findById(id) == null) {
				System.out.println("Заявка " + id + " не найдена");
			}

		return true;
	}
}
