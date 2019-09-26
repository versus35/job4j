package ru.job4j.oop;

public class Jukebox {
	public void music(int position) {
		if (position == 1) {
			System.out.println(position + ": Пусть бегут неуклюже");
		} else if (position == 2) {
			System.out.println(position + ": Спокойной ночи малыши");
		} else {
			System.out.println(position + ": Песня не найдена");
		}
	}

	public static void main(String[] args) {
		Jukebox box = new Jukebox();
		box.music(2);
		box.music(3);
		box.music(1);

	}
}
