package ru.job4j.list;

import org.junit.Test;

import static org.hamcrest.core.Is.is;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class UserConvertTest {

	@Test
	public void process() {
		UserConvert convert = new UserConvert();
		List<User> list = List.of(
				new User("Viktor", 1, "Moscow"),
				new User("Vasay", 2, "S.P"),
				new User("Vova", 3, "Dubna"));
		Map<Integer, User> result = UserConvert.process(list);
		assertThat(result.get(3).getName(), is("Vova"));

	}
}