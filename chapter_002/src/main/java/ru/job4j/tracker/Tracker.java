package ru.job4j.tracker;

import java.util.ArrayList;
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
		this.items.add(this.position++, item);
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
		for (int index = 0; index != items.size(); index++) {
			if (this.items.get(index).getId().equals(id)) {
				this.items.remove(index);
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
//		return items.stream()
//				.filter(i -> i.getName().equals(key))
//				.collect(Collectors.toList());
		List<Item> list = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) == null) {
				break;
			}
			if (list.get(i).getName().equals(key)) {
				list.add(list.get(i));
			}
		}
		return list;
	}


	public Item findById(String id) {
//		return items.stream()
//				.filter(i -> i.getId().equals(id))
//				.findFirst().orElse(null);
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
}
