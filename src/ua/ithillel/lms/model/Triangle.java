package ua.ithillel.lms.model;

import ua.ithillel.lms.api.СalculateArea;

public class Triangle extends GeometricFigure implements СalculateArea {
	
	private int sides;
	private double sideLength;
	
	public Triangle(String name, String kind, String color, int sides, double sideLength) {
		super(name, kind, color);
		this.sides = sides;
		this.sideLength = sideLength;
	}
	
	@Override
	public double calcArea() {
		return (Math.sqrt(3) / 4) * (getSideLength() * getSideLength());
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
