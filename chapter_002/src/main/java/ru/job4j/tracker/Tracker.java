package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Tracker {
	private final List<Item> items = new ArrayList<>();
	private int position = 0;

	private String generateId() {
		long time = System.currentTimeMillis();
		long rm = (long) (Math.random() * time);
		return String.valueOf(rm);

	}

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items.add(position++, item);
		return item;
	}

	public boolean replace(Item item, String id) {
		boolean result = false;
		if (position != 0) {
			for (int i = 0; i < position; i++) {
				if (items.get(i).getId().equals(id)) {
					item.setId(id);
					items.set(i, item);
					result = true;
					break;
				}
			}
		}
		return result;
	}

	public boolean delete(String id) {
		boolean result = false;
		for (int i = 0; i < position; i++) {
			if (items.get(i) != null && items.get(i).equals(id)) {
				System.arraycopy(this.items, i + 1, items, i, this.position - i);
				position--;
				result = true;
				break;

			}

		}
		return result;
	}

	public List<Item> findAll() {
		return this.items;
	}

	public List<Item> findByName(String key) {
		return items.stream()
				.filter(i -> i.getName() == key)
				.collect(Collectors.toList());
	}

	public Item findById(String id) {
		return items.stream()
				.filter(i -> i.getId() == id)
				.findFirst().orElse(null);
	}
}
