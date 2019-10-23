package ru.job4j.stragery;

public class Square implements ru.job4j.stragery.Shape {
	@Override
	public String draw() {
		StringBuilder pic = new StringBuilder();
		pic.append("□□□□□□□□□").append(SHAPE);
		pic.append("□       □").append(SHAPE);
		pic.append("□       □").append(SHAPE);
		pic.append("□       □").append(SHAPE);
		pic.append("□□□□□□□□□").append(SHAPE);
		return pic.toString();
	}

	public static void main(String[] args) {
		Square square = new Square();
		System.out.println(square.draw());
	}
}
