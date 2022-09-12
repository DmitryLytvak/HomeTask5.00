package ua.ithillel.lms.model;

import ua.ithillel.lms.api.СalculateArea;

public abstract class GeometricFigure implements СalculateArea {
	
	private String name;
	private String kind;
	private String color;
	
	
	public GeometricFigure(String name, String kind, String color) {
		this.name = name;
		this.kind = kind;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "GeometricFigure{" +
				"name='" + name + '\'' +
				", kind='" + kind + '\'' +
				", color='" + color + '\'' +
				'}';
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
}
