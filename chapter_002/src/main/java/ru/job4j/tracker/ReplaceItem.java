package ru.job4j.tracker;

public class ReplaceItem implements UserAction {
	@Override
	public String name() {
		return "=== Редактирование заявки ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("=== Введите ID заявки ===");
		String id = input.askStr("");
		System.out.println("=== Введите имя ===");
		String name = input.askStr("");
		Item item1 = new Item(name);
		if (tracker.replace(item1, id)) {
			System.out.println("Заявка: " + id + " обновлена");
		} else {
			System.out.println("Заявки с ID: " + id + " не существует");
		}
		return true;
	}
}
