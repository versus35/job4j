package ru.job4j.oop;

public class Doctor extends Profession {
	private String qualification;
	private String experience;

	public Doctor(String qualification, String experience) {
		super("Vasay", "Ivanov", "terapevt", "01.01.1970");
		this.qualification = qualification;
		this.experience = experience;
	}
	
}

