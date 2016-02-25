package edu.cis232;

public class Rectangle implements Shape {
	
	private double area, perimeter, base, height;
	
	public Rectangle(Double b, Double h){
		base  = b;
		height = h;
	}
	public double getBase(){
		return base;
	}
	public double getHeight(){
		return height;
	}
	
	public double getArea(){
		area = (base * height);
		return area;
	}
	public double getPerimeter(){
		perimeter = (base + base) + (height + height);
		return perimeter;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public void setHeight(double height) {
		this.height = height;
	}

}
