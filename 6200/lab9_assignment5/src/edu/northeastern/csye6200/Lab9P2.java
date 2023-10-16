package edu.northeastern.csye6200;

public class Lab9P2 {
	public static void main(String[] args) {
		Square square1 = new Square(2);
		System.out.printf("Area is %.2f\n", square1.getArea());
		square1.howToColor();

		Circle circle1 = new Circle(5);
		System.out.printf("Area is %.2f\n", circle1.getArea());

		Square square2 = new Square(5);
		System.out.printf("Area is %.2f\n", square2.getArea());
		square2.howToColor();

		Rectangle rectangle1 = new Rectangle(3, 4);
		System.out.printf("Area is %.2f\n", rectangle1.getArea());

		Square square3 = new Square(4.5);
		System.out.printf("Area is %.2f\n", square3.getArea());
		square3.howToColor();
	}
}

interface Colorable {
	// TODO: write your code here
	public void howToColor();
}

class Square extends GeometricObject implements Colorable {

	// TODO: write your code here7
	private double side;
	
	public Square(double side) {
		super();
		this.side=side;
	}
	
	@Override
	public double getArea() {
		return side * side;
	}

	@Override
	public double getPerimeter() {
		return 4 * side;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}

}
