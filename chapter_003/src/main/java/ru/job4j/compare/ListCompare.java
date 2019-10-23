package ru.job4j.compare;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListCompare implements Comparator <String> {

	@Override
	public int compare(String left, String right) {
		int size1 = left.length();
		int size2 = right.length();
		int result = size1 - size2;
		int min = Math.min(size1, size1);
		int index = 0;
		while (index < min) {
			if(Character.compare(left.charAt(index), right.charAt(index)) != 0) {
				result = Character.compare(left.charAt(index), right.charAt(index));
				break;
			}
			index++;
		}
		return result;
	}
}
