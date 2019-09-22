package ru.job4j.array;

public class FindLoop1 {
	public int indexOf(int[] data, int el) {
		int rst = -1;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == el) {
				rst = i;
				break;
			} else if (i < 0) {
				return rst;
			}

		}
		return rst;
	}
}
