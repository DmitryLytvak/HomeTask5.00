package task2.model;


public class Robot extends Competitor {
	
	public Robot(String name, double height, int age, double weight, int jumpLevel, int runLength) {
		super(name, height, age, weight, jumpLevel, runLength);
	}
	
	@Override
	public void jump() {
		System.out.println(getName() + " jumps " + getJumpLevel() + "m. over the wall");
	}
	
	@Override
	public void run() {
		System.out.println(getName() + " running " + getRunLength() + "m. along the running track");
	}
}

