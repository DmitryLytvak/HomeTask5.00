package ua.ithillel.lms.model;


public class Square extends GeometricFigure {
	
	private int sides;
	private double sideLength;
	
	public Square(String name, String kind, String color, int sides, double sideLength) {
		super(name, kind, color);
		this.sides = sides;
		this.sideLength = sideLength;
	}
	
	@Override
	public double calcArea() {
		return getSideLength() * getSideLength();
	}
	
	
	public int getSides() {
		return sides;
	}
	
	public void setSides(int sides) {
		this.sides = sides;
	}
	
	public double getSideLength() {
		return sideLength;
	}
	
	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
}
