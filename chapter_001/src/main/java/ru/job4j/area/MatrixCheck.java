package ru.job4j.area;

public class MatrixCheck {
	public static boolean isWin(char[][] board) {
		boolean result = false;
		for (int row = 0; row < board.length; row++) {
			int count1 = 0;
			int count2 = 0;
			for (int cell = 0; cell < board.length; cell++) {
				char sign = board[row][cell];
				System.out.print(sign);
				if (board[row][cell] == 'X') {
					count1++;
				}
				if (board[cell][row] == 'X') {
					count2++;
				}
				if ((count1 == board.length) || (count2 == board.length)) {
					result = true;
					break;
				}
			}


			System.out.println();
		}

		return result;
	}


	public static void main(String[] args) {
		char[][] hasWinVertical = {
				{'_', '_', 'X', '_', '_'},
				{'_', '_', 'X', '_', '_'},
				{'_', '_', 'X', '_', '_'},
				{'_', '_', 'X', '_', '_'},
				{'_', '_', 'X', '_', '_'},
		};
		boolean win = isWin(hasWinVertical);
		System.out.println("A board has a winner : " + win);
		System.out.println();
		char[][] hasWinHor = {
				{'_', '_', '_', '_', '_'},
				{'X', 'X', 'X', 'X', 'X'},
				{'_', '_', '_', '_', '_'},
				{'_', '_', '_', '_', '_'},
				{'_', '_', '_', '_', '_'},
		};
		boolean winHor = isWin(hasWinHor);
		System.out.println("A board has a winner : " + winHor);
		System.out.println();
		char[][] notWin = {
				{'_', '_', 'X', '_', '_'},
				{'_', '_', 'X', '_', '_'},
				{'_', 'X', '_', '_', '_'},
				{'_', '_', 'X', '_', '_'},
				{'_', '_', 'X', '_', '_'},
		};
		boolean lose = isWin(notWin);
		System.out.println("A board has a winner : " + lose);
	}
}
