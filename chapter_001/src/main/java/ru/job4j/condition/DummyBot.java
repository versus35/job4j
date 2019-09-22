package ru.job4j.condition;

import java.util.Scanner;

public class DummyBot {
	public static String answer(String question) {
		String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
		if ("Привет, Бот.".equals(question)) {
			// заменить ... на правильный ответ rsl = "ответ по заданию".
			rsl = "Привет, умник.";
		} else if ("Пока.".equals(question)) { // заменить ... на проверку, известен ли боту этот вопрос и он знает как на него ответить.
			// заменить ... на правильный ответ rsl = "ответ по заданию".
			rsl = "До скорой встречи.";
		}
		return rsl;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String rsl1 = sc.nextLine();
		System.out.println(answer(rsl1));
		String rsl2 = sc.nextLine();
		System.out.println(answer(rsl2));
		String rsl3 = sc.nextLine();
		System.out.println(answer(rsl3));
	}
}


