package ru.job4j.singleton;

import org.junit.Test;
import ru.job4j.tracker.Tracker;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

public class SingletonTest {
	@Test
	public void TrackerEnumTest() {
		TrackerEnum trackerFirst = TrackerEnum.INSTANCE;
		TrackerEnum trackerSecond = TrackerEnum.INSTANCE;
		assertThat(trackerFirst.toString(), is(trackerSecond.toString()));
	}

	@Test
	public void TrackerLazyTest() {
		TrackerLazy trackerFirst = TrackerLazy.getInstance();
		TrackerLazy trackerSecond = TrackerLazy.getInstance();
		assertThat(trackerFirst.toString(), is(trackerSecond.toString()));
	}

	@Test
	public void TrackerEagerTest() {
		TrackerEager trackerFirst = TrackerEager.getInstance();
		TrackerEager trackerSecond = TrackerEager.getInstance();
		assertThat(trackerFirst.toString(), is(trackerSecond.toString()));
	}

	@Test
	public void TrackerFinalLazyTest() {
		TrackerFinalLazy trackerFirst = TrackerFinalLazy.getInstance();
		TrackerFinalLazy trackerSecond = TrackerFinalLazy.getInstance();
		assertThat(trackerFirst.toString(), is(trackerSecond.toString()));
	}
}
