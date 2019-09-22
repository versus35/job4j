package ru.job4j.array;


public class FindLoop {
	public static int indexOf(int[] data, int el) {
		int rst = -1;
		for (int i = 0; i < data.length; i++) {
			if (data[i] == el) {
				rst = i;
				break;
			}
		}
		return rst;
	}

	public static int indexOf(int[] data, int el, int start, int finish) {
		int rst = -1;
		for (int i = start; i <= finish; i++) {
			if (data[i] == el) {
				rst = i;
				break;
			}
		}

		return rst;
	}

	public static class SortSelected {

		public static int[] sort(int[] data) {
			int min;
			int index;
			for (int i = 0; i < data.length; i++) {
				min = data[i];
				index = i;
				for (int j = i + 1; j < data.length; j++) {
					if (data[j] < min) {
						index = j;
						min = data[j];
					}
				}
				if (data[i] != data[index]) {
					data[index] = data[i];
					data[i] = min;
				}
			}
			return data;
		}

		public static int indexOf(int[] data, int el, int start, int finish) {
			int rst = -1;
			for (int i = start; i <= finish; i++) {
				if (data[i] == el) {
					rst = i;
					break;
				}
			}

			return rst;
		}

		public static int findMin(int[] array, int start, int finish) {
			int min = array[start];
			for (int i = start; i <= finish; i++) {
				if (array[i] <= min) {
					min = array[i];
				}

			}
			return min;
		}
	}

}
