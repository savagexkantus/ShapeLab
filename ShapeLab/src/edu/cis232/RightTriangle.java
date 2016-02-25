package edu.cis232;

public class RightTriangle implements Shape {
	
	private double area, perimeter, base, height, hypotenuse;

	public RightTriangle(double b, double h){
	
	}
	public double getArea(){
		area = .5*height*base; 
		return area;
	}
	
	public double getHypotenuse(){
		hypotenuse = Math.sqrt((base*base)+(height*height));
		return perimeter;
	}
	
	public double getPerimeter(){
		perimeter = hypotenuse+ base + height;
		return perimeter;
	}

	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	
}
