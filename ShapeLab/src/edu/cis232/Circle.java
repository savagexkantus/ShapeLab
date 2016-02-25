package edu.cis232;

public class Circle implements Shape {
	
	private double area, perimeter,radius;
	
	public Circle(Double r){
		radius = r;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getArea(){
		area = Math.pow((Math.PI * radius), 2);
		return area;
	}
	
	public double getPerimeter(){
		
		perimeter = (2 * Math.PI * radius);
		
		return perimeter;
	}
	
	


}
