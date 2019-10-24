package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;

public class TrackerTest {
//	@Test
//	public void whenAddNewItemThenTrackerHasSameItem() {
//		Tracker tracker = new Tracker();
//		Item item = new Item("test name", "test");
//		tracker.add(item);
//		Item result = tracker.findById(item.getId());
//		assertThat(result.getName(), is(item.getName()));
//	}
//
//	@Test
//	public void whenReplaceNameThenReturnNewName() {
//		Tracker tracker = new Tracker();
//		Item previous = new Item("test1", "test1");
//		// Добавляем заявку в трекер. Теперь в объект проинициализирован id.
//		tracker.add(previous);
//		// Создаем новую заявку.
//		Item next = new Item("test2", "test2");
//		// Проставляем старый id из previous, который был сгенерирован выше.
//		next.setId(previous.getId());
//		// Обновляем заявку в трекере.
//		tracker.replace(next, previous.getId());
//		// Проверяем, что заявка с таким id имеет новые имя test2.
//		assertThat(tracker.findById(previous.getId()).getName(), is("test2"));
//	}
//
//	@Test
//	public void whenDelete() {
//		Tracker tracker = new Tracker();
//		Item previous = new Item("test3", "test3");
//		tracker.add(previous);
//		tracker.delete(previous.getId());
//		assertFalse(Arrays.asList(tracker.findAll()).contains(previous));
//
//	}
//
//	@Test
//	public void whenFindAll() {
//		Tracker tracker = new Tracker();
//		Item previous = new Item("test1", "testDescription");
//		Item next = new Item("test2", "testDescription");
//		tracker.add(previous);
//		tracker.add(next);
//		List<Item> list = new ArrayList<>();
//		list.add(previous);
//		list.add(next);
//		assertThat(tracker.findAll(), is(list));
//	}
//
//	@Test
//	public void whenFindByName() {
//		Tracker tracker = new Tracker();
//		Item item = new Item("test7", "test7");
//		Item item1 = new Item("test8", "test8");
//		tracker.add(item);
//		List<Item> list = new ArrayList<>();
//		list.add(item);
//		list.add(item1);
//		//tracker.add(item1);
//		assertThat(Arrays.asList(tracker.findByName("test7")), is(item));
//	}
//
//	@Test
//	public void whenFindId() {
//		Tracker tracker = new Tracker();
//		Item item = new Item("test8", "test8");
//		tracker.add(item);
//		assertThat(tracker.findById(item.getId()), is(item));
//	}

}


