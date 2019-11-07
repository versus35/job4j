package ru.job4j.tracker;

import java.util.List;
import java.util.function.Consumer;

public class FindAllAction extends BaseAction {
	private final Consumer<String> output;

	public FindAllAction(int key, String info, Consumer<String> output) {
		super(key, info);
		this.output = output;
	}

	@Override
	public void execute(Input input, Tracker tracker) {
		for (Item item : tracker.findAll()) {
			output.accept("--------- Показать все заявки -----------");
			output.accept("Результат:");
			output.accept(
					"ID заявки:   |" + item.getId() + '\n' + '\r'
							+
							"Имя заявки:  |" + item.getName() + '\n' + '\r'
							+
							"Описание:    |" + item.getDesc());
		}
	}
}