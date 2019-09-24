package ru.job4j.array;

public class Array {
	public static int[] merge(int[] index1, int[] index2, int[] index3) {
		int i = 0;
		int j = 0;
		int k = 0;
		int m = index1.length;
		int n = index2.length;
		while (i < m && j < m) {
			if (index1[i] <= index2[j]) {
				index3[k] = index1[i];
				i++;
			} else {
				index3[k] = index2[j];
				j++;
			}
			k++;
		}
		if (i < m) {
			for (int p = i; p < m; p++) {
				index3[p] = index1[p];
				k++;
			}
		} else {
			for (int p = j; p < n; p++) {
				index3[k] = index2[p];
				k++;
			}
		}
		return index3;
	}
}







