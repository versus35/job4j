package ru.job4j.singleton;

import ru.job4j.tracker.*;

public enum TrackerEnum {
	INSTANCE; // Тут указываем перечисления

	public Item add(Item model) {
		return model;
	}
}

