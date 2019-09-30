package ru.job4j.pojo;

public class College {
	public static void main(String[] args) {
		Student student = new Student();
		student.setFirstName("Попов");
		student.setLastName("Андрей");
		student.setGroup("job4j");
		student.setDateOfReceipt("01.09.2019");
		System.out.println(student.getLastName() + " " + student.getFirstName() + " " + student.getGroup() + " " + student.getDateOfReceipt());

	}
}
