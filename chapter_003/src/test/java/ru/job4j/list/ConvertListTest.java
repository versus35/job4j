package ru.job4j.list;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ConvertListTest {

	@Test
	public void convert() {
		ConvertList convert = new ConvertList();
		List<int[]> list = new ArrayList<>();
		list.add(new int[]{1,2});
		list.add(new int[]{3,4,5,6});
		List<Integer> result = convert.convert(list);
		List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		assertThat(result, is (expected));
	}
}