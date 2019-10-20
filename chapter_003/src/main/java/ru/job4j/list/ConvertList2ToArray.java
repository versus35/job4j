package ru.job4j.list;

import java.util.ArrayList;
import java.util.List;

public class ConvertList2ToArray {
	public int[][] toArray(List<Integer> list, int rows) {
		int cells = (int) Math.ceil((double) list.size() / (double) rows);
		int[][] array = new int[rows][cells];
		int row = 0;
		int cell = 0;
		for (Integer i : list) {
			array[row][cell++] = i;
			if(cell >= cells) {
				cell = 0;
				row++;
			}
		}

		return array;
	}


}
