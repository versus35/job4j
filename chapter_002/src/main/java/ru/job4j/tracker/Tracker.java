package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
	private final Item[] items = new Item[100];
	private int position = 0;

	private String generateId() {
		long time = System.currentTimeMillis();
		long rm = (long) (Math.random() * time);
		return String.valueOf(rm);

	}

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[this.position++] = item;
		return item;
	}

	public boolean replace(Item item, String id) {
		boolean result = false;
		for (int i = 0; i < position; i++) {
			if (items[i] != null && items[i].getId().equals(id)) {
				item.setId(id);
				items[i] = item;
				result = true;
				break;
			}
		}
		return result;
	}

	public boolean delete(String id) {
		boolean result = false;
		for (int i = 0; i < position; i++) {
			if (items[i] != null && items[i].getId().equals(id)) {
				System.arraycopy(this.items, i + 1, items, i, this.position - i);
				position--;
				result = true;
				break;

			}

		}
		return result;
	}

	public Item[] findAll() {
		return Arrays.copyOf(this.items, this.position);
	}

	public Item[] findByName(String key) {
		Item[] result = new Item[0];
		int temp = 0;
		if (items != null) {
		for (int i = 0; i < position; i++) {
			if (items[i].getName().equals(key)) {
				result = Arrays.copyOf(result, temp + 1);
				result[temp++] = this.items[i];


			}

			}
		}
		return result;
	}

	public Item findById(String id) {
		Item result = null;
		for (int i = 0; i < position; i++) {
			if (items[i] != null && items[i].getId().equals(id)) {
				result = items[i];
				break;
			}
		}
		return result;
	}
}
