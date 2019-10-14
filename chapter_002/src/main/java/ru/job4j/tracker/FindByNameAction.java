package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
	@Override
	public String name() {
		return "=== Поиск заявки по имени ===";
	}

	@Override
	public boolean execute(Input input, Tracker tracker) {
		System.out.println("-- Писк заявки по имени --");
		System.out.println("Введите имя: ");
		String name = input.askStr("");
		Item[] item = tracker.findByName(name);
		for (int i = 0; i < item.length; i++) {
			System.out.println("Заявка " + item[i].getId());
			System.out.println("Имя " + item[i].getName());
		}

		return true;
	}
}
