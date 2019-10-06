package ru.job4j.pojo;

public class Library {
	public static void main(String[] args) {
		Book first = new Book("Clean code", 100);
		Book second = new Book("Java", 200);
		Book third = new Book("JVM", 150);
		Book forth = new Book("Algorithm", 200);
		Book[] book = new Book[4];
		book[0] = first;
		book[1] = second;
		book[2] = third;
		book[3] = forth;
		for (int index = 0; index < book.length; index++) {
			Book i = book[index];
			System.out.println(i.getName() + " - " + i.getNumberOfPages());
			System.out.println();
		}
		Book fifth = book[0];
		book[0] = book[3];
		book[3] = fifth;
		for (int index = 0; index < book.length; index++) {
			Book i = book[index];
			System.out.println(i.getName() + " - " + i.getNumberOfPages());
		}
		System.out.println();
		if (book[3] == fifth) {
			System.out.println(fifth.getName());
		}
	}
}





