package ru.job4j.oop;

public class College {

	public static void main(String[] args) {
		Student std = new Student();
		Freshman fr = new Freshman();
		Object object = new Object();
		Object obj = std;
		Object obj1 = fr;
		Student student = fr;
		Object obj2 = object;
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(student);

	}
}
