package ru.job4j.tracker;

public class CreateAction implements UserAction {
	@Override
	public String name() {
		return "=== Добавление новой заявки ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("Введите имя: ");
		String name = input.askStr(" ");
		Item item = new Item(name);
		tracker.add(item);
		return true;
	}
}
