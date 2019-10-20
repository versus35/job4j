package ru.job4j.search;

import java.util.LinkedList;
import java.util.ListIterator;

public class PriorityQueue {
	private LinkedList<Task> tasks = new LinkedList<>();

	public void put(Task task) {
		int count = tasks.size();
			for (int i = 0; i < tasks.size(); i++) {
				if (task.getPriority() < tasks.get(i).getPriority()) {
					count = i;
					break;
				}
			}
		tasks.add(count, task);
		}


	public Task take() {
		return this.tasks.poll();
	}
}
