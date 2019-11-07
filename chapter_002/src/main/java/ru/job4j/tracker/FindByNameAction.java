package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FindByNameAction extends BaseAction {
	private final Consumer<String> output;

	public FindByNameAction(int key, String info, Consumer<String> output) {
		super(key, info);
		this.output = output;
	}

	@Override
	public void execute(Input input, Tracker tracker) {
		boolean found = false;
		List<Item> items = tracker.findByName(input.ask("Введите имя заявки, для ее поиска :"));
		output.accept("----------- Поиск заявки по имени -----------");
		for (Item item : items) {
			if (item != null) {
				output.accept("Результат:");
				output.accept("----------- Заявка найдена! --------------");
				output.accept("ID заявки:   |" + item.getId() + '\n' + '\r'
						+
						"Имя заявки:  |" + item.getName() + '\n' + '\r'
						+
						"Описание:    |" + item.getDesc());
				found = true;
				break;
			}
		}
		if (!found) {
			output.accept("Результат:");
			output.accept("----------- Заявка не найдена! --------------");
		}
	}
}