package ua.ithillel.lms;

import ua.ithillel.lms.api.СalculateArea;
import ua.ithillel.lms.model.Circle;
import ua.ithillel.lms.model.Square;
import ua.ithillel.lms.model.Triangle;

public class Main {
	
	public static void main(String[] args) {
		
		СalculateArea[] arrFigures = {
				
				new Square("Square", "Flat geometric figure",
						"Green", 4, 8),
				new Triangle("Triangle", "Flat geometric figure",
						"Yellow", 3, 5),
				new Circle("Circle", "Flat geometric figure", "White", 9)
		};
		
		System.out.println("=".repeat(80));
		for (СalculateArea figure : arrFigures) {
			
			System.out.println(figure);
			System.out.println("The area of this figure is - " + figure.calcArea());
			System.out.println();
			System.out.println("=".repeat(80));
			System.out.println();
			
			
		}
		System.out.println("The total area of all figures is " + calcSumArea(arrFigures));
		System.out.println();
		System.out.println("=".repeat(80));
	}
	
	public static double calcSumArea(СalculateArea[] arrFigures) {
		double sum = 0;
		for (СalculateArea figure : arrFigures) {
			sum += figure.calcArea();
		}
		return sum;
	}
}


