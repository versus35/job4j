package ru.job4j.stream;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class SchoolTest {
	@Test
	public void student10A() {
		List<Student> students = new LinkedList<>();
		Student student = new Student(15);
		Student student1 = new Student(89);
		Student student2 = new Student(72);
		Student student3 = new Student(44);
		Student student4 = new Student(68);
		Student student5 = new Student(81);
		students.addAll(Arrays.asList(student, student1, student2, student3, student4, student5));
		List<Student> result = School.collect(students, x -> x.getScore() >= 70);
		List<Student> expected = new ArrayList<>(Arrays.asList(student1, student2, student5));
		assertThat(result, is(expected));
	}

	@Test
	public void student10B() {
		List<Student> students = new LinkedList<>();
		Student student = new Student(32);
		Student student1 = new Student(56);
		Student student2 = new Student(44);
		Student student3 = new Student(62);
		Student student4 = new Student(43);
		Student student5 = new Student(20);
		students.addAll(Arrays.asList(student, student1, student2, student3, student4, student5));
		List<Student> result = School.collect(students, x -> (x.getScore() >= 50) && (x.getScore() < 70));
		List<Student> expected = new ArrayList<>(Arrays.asList(student1, student3));
		assertThat(result, is(expected));
	}

	@Test
	public void student10C() {
		List<Student> students = new LinkedList<>();
		Student student = new Student(12);
		Student student1 = new Student(55);
		Student student2 = new Student(32);
		Student student3 = new Student(44);
		Student student4 = new Student(54);
		Student student5 = new Student(65);
		students.addAll(Arrays.asList(student, student1, student2, student3, student4, student5));
		List<Student> result = School.collect(students, x -> (x.getScore() >= 0) && (x.getScore() < 50));
		List<Student> expected = new ArrayList<>(Arrays.asList(student, student2, student3));
		assertThat(result, is(expected));
	}

	@Test
	public void studentToMap() {
		Student student = new Student("Vova", "Petrov", 13);
		Student student1 = new Student("Vasya", "Ivanov", 55);
		Student student2 = new Student("Petr", "Sergeev", 68);
		List<Student> students = new LinkedList<>(Arrays.asList(student, student1, student2));
		Map<String, Student> expect = new LinkedHashMap<>();
		expect.put("Petrov", student);
		expect.put("Ivanov", student1);
		expect.put("Sergeev", student2);
		Map<String, Student> result = School.toMap(students);
		assertThat(result, is(expect));
	}
	@Test
	public void levelOfTest() {
		Student student1 = new Student(15);
		Student student2 = new Student(89);
		Student student3 = new Student(55);
		Student student4 = new Student(69);
		Student student5 = new Student(20);
		Student student6 = new Student(40);
		Student student7 = new Student(75);
		List<Student> students = new ArrayList<>(Arrays.asList(student1, null, student2, student3, student4, student5, student6, student7));
		List<Student> result = School.levelOf(students, 50);
		List<Student> expect = new ArrayList<>(Arrays.asList(student2, student7, student4, student3));
		assertThat(result, is(expect));
	}
}