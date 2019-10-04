package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class Matches {
	public static void main(String[] args) {
		int matches = 11;
		String user2 = "Ivan";
		String user1 = "Petya";
		Scanner io = new Scanner(System.in);
		System.out.println("==Игра начинается==");
		System.out.println("==На столе 11 спичек==");
		System.out.println("введите число от 1 до 3: ");
		while (true) {
			int user = Integer.parseInt(String.valueOf(io.nextInt()));
			System.out.println(user1 + " Взял " + user);
			for (int i = 0; i < user; i++) {
				matches--;
				System.out.println("На столе осталось " + matches + " спичек");
			}
			System.out.println("введите число от 1 до 3: ");
			int match = Integer.parseInt(String.valueOf(io.nextInt()));
			System.out.println(user2 + " Взял " + match);
			for (int j = 0; j < match; j++) {
				matches--;
				System.out.println("На столе осталось " + matches + " спичек");
			}
			if (matches == 0) {
				System.out.println("Winner");
				break;

			}
		}
	}
}





