package edu.cis232;

public class Square implements Shape {
	
	private double area, perimeter, side;

	public Square(double s){
	
	}
	
	public double getArea(){
		area = side*side; 
		return area;
	}
	
	public double getPerimeter(){
		perimeter = 4 * side;
		return perimeter;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	
}
