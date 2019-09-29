package ru.job4j.oop;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	public Point(int first, int second, int third, int forth){
		this.x1 = first;
		this.y1 = second;
		this.x2 = third;
		this.y2 = forth;
	}

	public  double distance(Point that){
		return Math.sqrt(pow(this.x1 - that.x2, 2) + pow (this.y1 - that.y2, 2));
	}

	public static void main(String[] args) {
		Point a = new Point(2, 3, 5, 1);
		Point b = new Point(4, 2, 1, 5);
		double dist = a.distance(b);
		System.out.println(dist);

	}
}
