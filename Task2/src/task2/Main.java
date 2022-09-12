package task2;


public class Main {
	
	public static void main(String[] args) {
		
		Competitor[] competitors = {
				
				new Human("Alex", 185, 25, 75, 5,
						195, "Man"),
				new Robot("Android", 100, 1, 50, 2, 210),
				new Cat("Barsik", 30, 2, 12, 4, 180),
		};
		
		Barrier[] barriers = {
				new Wall("wall", 3),
				new RunningTrack("running track", 200)
		};
		
		for (Competitor competitor : competitors) {
			for (Barrier barrier : barriers) {
				barrier.overcome(competitor);
			}
			System.out.println("=".repeat(50));
			
		}
	}
}


