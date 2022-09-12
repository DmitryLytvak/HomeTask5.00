package ua.ithillel.lms.model;


public class Circle extends GeometricFigure {
	
	private double radius;
	
	public Circle(String name, String kind, String color, double radius) {
		super(name, kind, color);
		this.radius = radius;
	}
	
	@Override
	public double calcArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
}