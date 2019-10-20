package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList {
	public List<Integer> convert(List<int[]> list) {
		List<Integer> result = new ArrayList<>();
		for(int[] i : list) {
			for (int j : i) {
				result.add(j);
			}
		}
		return result;
	}
}
