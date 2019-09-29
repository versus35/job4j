package ru.job4j.oop;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}


	public double period(double ab, double bc, double ac) {
		return (ab + bc + ac) / 2;
	}

	public double area() {
		double rsl = -1;
		double ab = a.distance(this.b);
		double ac = a.distance(this.c);
		double bc = b.distance(this.c);
		double p = period(ab, bc, ac);
		if (this.exist(ab, bc, ac)) {
			rsl = Math.sqrt((p * (p - ab) * (p - ac) * (p - bc)));
		} else {
			rsl = -1;
		}
		return rsl;
	}

	private boolean exist(double ab, double ac, double bc) {
		boolean exist = false;
		if (ab < (ac + bc) && ac < (ab + bc) && bc < (ab + ac)) {
			exist = true;
		}
		return exist;
	}

}
