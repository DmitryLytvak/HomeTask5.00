package task2.model;


public class Human extends Competitor {
	
	private String gender;
	
	public Human(String name, double height, int age, double weight, int jumpLevel, int runLength,
			String gender) {
		super(name, height, age, weight, jumpLevel, runLength);
		this.gender = gender;
	}
	
	@Override
	public void jump() {
		System.out.println(getName() + " jumps " + getJumpLevel() + "m. over the wall");
	}
	
	@Override
	public void run() {
		System.out.println(getName() + " running " + getRunLength() + "m. along the running track");
	}
	
	
	public String getGender() {
		return gender;
	}
	
	public void setGender(String gender) {
		this.gender = gender;
	}
}


