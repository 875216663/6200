package edu.northeastern.csye6200;

public class Lab9P1 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Octagon o1 = new Octagon(9);
		System.out.printf("Area is %.2f\n", o1.getArea());
		System.out.println("Perimeter is " + o1.getPerimeter());
		Octagon o2 = (Octagon) o1.clone();

		System.out.println("Compare the methods " + o1.compareTo(o2));
	}
}

class Octagon extends GeometricObject implements Comparable<Octagon>, Cloneable {

	// TODO: write your code here
	private double side;
	public Octagon(double side) {
		this.side=side;
		
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
		// TODO Auto-generated method stub
		return 2 * (1 + Math.sqrt(2)) * side * side;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 8 * side;
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
