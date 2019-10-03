package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
	public static void main(String[] args) {
		int answer = new Random().nextInt(3);
		Scanner scanner = new Scanner(System.in);
			System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
				System.out.println("Введите свой вопрос: ");
				String name = scanner.nextLine();
				System.out.println("введите число: ");
				int num = scanner.nextInt();
				if (num == answer) {
					System.out.println("Da");
				}
				if (num == -1) {
					System.out.println("No");

				}
				if (num > answer) {
					System.out.println("Может быть");

				}
			}
		}


