package ru.job4j.stragery;

public class Triangle implements ru.job4j.stragery.Shape {

	@Override
	public String draw() {
		StringBuilder pic = new StringBuilder();
		pic.append("    △");
		pic.append("   △ △");
		pic.append("  △   △");
		pic.append(" △     △");
		pic.append("△△△△△△△");
		pic.append(SHAPE);
		return pic.toString();
	}

	public static void main(String[] args) {
		Triangle triangle = new Triangle();
		System.out.println(triangle.draw());
	}
}
