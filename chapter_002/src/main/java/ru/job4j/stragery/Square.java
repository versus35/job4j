package ru.job4j.stragery;

public class Square implements Shape {
	@Override
	public String draw() {
		StringBuilder pic = new StringBuilder();
		pic.append("□□□□□□□□□").append(std);;
		pic.append("□       □").append(std);;
		pic.append("□       □").append(std);;
		pic.append("□       □").append(std);;
		pic.append("□□□□□□□□□").append(std);;
		return pic.toString();
	}

	public static void main(String[] args) {
		Square square = new Square();
		System.out.println(square.draw());
	}
}
