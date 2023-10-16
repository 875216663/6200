package edu.northeastern.csye6200;

public class Rectangle extends GeometricObject {

	// TODO: write your code here
	private double width;
	private double height;
	
	public Rectangle(double width,double height) {
		this.height=height;
		this.width=width;
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return (width*height);
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

}
