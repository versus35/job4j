package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


public class Tracker {

	private final List<Item> items = new ArrayList<>();

	private static final Random RN = new Random();

	public Item add(Item item) {
		item.setId(this.generateId());
		this.items.add(item);
		return item;
	}

	private String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
	}

	public boolean replace(String id, Item item) {
		boolean result = false;
		System.out.println(id);
		int index = 0;
		for (Item it : items) {
			if (it != null && it.getId().equals(id)) {
				item.setId(id);
				items.set(index, item);
				result = true;
				break;
			}
			index++;
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

	public ArrayList<Item> findAll() {
		return new ArrayList<>(items);
	}

	public List<Item> findByName(String key) {
		return items.stream().filter(x -> x.getName().equals(key)).collect(Collectors.toList());
	}

	public Item findById(String id) {
		return items.stream().filter(x -> x.getId().equals(id)).findFirst().orElse(null);
	}
}