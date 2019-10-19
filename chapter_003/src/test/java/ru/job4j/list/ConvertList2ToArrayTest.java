package ru.job4j.list;

import org.junit.Test;

import java.util.Arrays;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ConvertList2ToArrayTest {
	@Test
	public void when7ElementsThen9() {
		ConvertList2ToArray list = new ConvertList2ToArray();
		int[][] result = list.toArray(Arrays.asList(1, 2, 3, 4, 5, 6, 7),
		3);
		int[][] expected = {
				{1,2,3},
				{4,5,6},
				{7,0,0}
		};
		assertThat(result, is (expected));
	}

}