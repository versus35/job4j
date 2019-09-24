package ru.job4j.condition;

import java.util.Scanner;

public class DummyBot {
	public static String answer(String question) {
		String bot = "Это ставит меня в тупик. Задайте другой вопрос.";
		if ("Привет, Бот.".equals(question)) {
			// заменить ... на правильный ответ rsl = "ответ по заданию".
			bot = "Привет, умник.";
		} else if ("Пока.".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
			// заменить ... на правильный ответ rsl = "ответ по заданию".
			bot = "До скорой встречи.";
		}
		return bot;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String bot1 = sc.nextLine();
		System.out.println(answer(bot1));
		String bot2 = sc.nextLine();
		System.out.println(answer(bot2));
		String bot3 = sc.nextLine();
		System.out.println(answer(bot3));
	}
}


