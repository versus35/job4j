package ru.job4j.stream;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

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
}