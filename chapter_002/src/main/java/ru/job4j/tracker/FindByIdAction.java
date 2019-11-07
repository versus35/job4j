package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class FindByIdAction extends BaseAction {
	private final Consumer<String> output;

	public FindByIdAction(int key, String info, Consumer<String> output) {
		super(key, info);
		this.output = output;
	}

	@Override
	public void execute(Input input, Tracker tracker) {
		output.accept("----------- Поиск заявки по ID -----------");

		Item item = tracker.findById(input.ask("Введите Id заявки, для ее поиска :"));
		if (item != null) {
			output.accept("Результат:");
			output.accept("----------- Заявка найдена! --------------");
			output.accept(
					"ID заявки:   |" + item.getId() + '\n' + '\r'
							+
							"Имя заявки:  |" + item.getName() + '\n' + '\r'
							+
							"Описание:    |" + item.getDesc());
		} else {
			output.accept("----------- Заявка не найдена! --------------");
		}
	}
}