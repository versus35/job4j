package ru.job4j.oop;
import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
	private int x;
	private int y;
	private int z;
	public  Point(int first, int second){
		this.x = first;
		this.y = second;
	}
	public  Point(int first, int second, int third){
		this.x = first;
		this.y = second;
		this.z = third;

	}
	public void info() {
		System.out.println(String.format("Point[%s, %s, %s]", this.x, this.y, this.z));
	}

	public  double distance(Point that){
		return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2));
	}

	public double distance3D(Point that){
		return  Math.sqrt(Math.pow(that.x - this.x, 2) + Math.pow(that.y - this.y,2) + Math.pow(that.z - this.z, 2));

	}

	public static void main(String[] args) {
		Point a = new Point(2, 3, 0);
		Point b = new Point(0, 2, 4);
		Point c = new Point(3, 0, 2);
		double dist = a.distance(b);
		a.info();
		System.out.println(dist);
		double dist1 = a.distance(c);
		b.info();
		System.out.println(dist1);
		double dist2 = a.distance3D(c);
		c.info();
		System.out.println(dist2);




	}

}
