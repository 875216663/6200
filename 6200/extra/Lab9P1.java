package edu.northeastern.csye6200;

public class Lab9P1 {
	public static void main(String[] args) {
		Octagon octagon1 = new Octagon(9);
		System.out.printf("Area is %.2f\n", octagon1.getArea());
		System.out.println("Perimeter is " + octagon1.getPerimeter());
		Octagon octagon2 = (Octagon) octagon1.clone();

		System.out.println("Compare the methods " + octagon1.compareTo(octagon2));
	}
}

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

	private double side;

	public Octagon(double side) {
		super();
		this.side = side;
	}

	@Override
	public Object clone() {
		try {
			return super.clone();
		} catch (CloneNotSupportedException ex) {
			return null;
		}
	}

	@Override
	public int compareTo(Octagon o) {

		if (this.getArea() > o.getArea())
			return 1;
		else if (this.getArea() < o.getArea())
			return -1;
		else
			return 0;
	}

	@Override
	public double getArea() {

		return 2 * (1 + Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

}
