package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Tracker {
	private final List<Item> items = new ArrayList<>(100);
	private int position = 0;

	private String generateId() {
		long time = System.currentTimeMillis();
		long rm = (long) (Math.random() * time);
		return String.valueOf(rm);

	}

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items.add(this.position++, item);
		return item;
	}

	public boolean replace(Item item, String id) {
		boolean result = false;
		for (int i = 0; i < position; i++) {
			if (items.get(i).getId().equals(id)) {
				item.setId(id);
				items.set(i, item);
				result = true;
			}
		}
		return result;
	}

	public boolean delete(String id) {
		boolean result = false;
		for (int i = 0; i < position; i++) {
			if (items.get(i).getId().equals(id)) {
				items.remove(i);
				position--;
				result = true;
				break;

			}
			;
		}
		return result;
	}

	public List<Item> findAll() {
		return items;
	}

	public List<Item> findByName(String key) {
		ArrayList<Item> result = new ArrayList<>(position);
		for (int i = 0; i < position; i++) {
			if (key.equals(this.items.get(i).getName())) {
				result.add(items.get(i));
			}
		}
		return result;
	}

	public Item findById(String id) {
		Item result = new Item();
		for (Item item : items) {
			if (id.equals(item.getId())) {
				result = item;
				break;
			}
		}
		return result;
	}
}
