package ru.job4j.oop;

public class DummyDic {
	public String engToRus(String eng) {
		String world = "Не известное слово";
		return world;
	}

	public static void main(String[] args) {
		DummyDic dic = new DummyDic();
		String eng = dic.engToRus("qwea");
		System.out.println("qwea - " + eng);

	}
}
