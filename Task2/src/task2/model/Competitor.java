package task2.model;


public abstract class Competitor {
	
	private String name;
	private double height;
	private int age;
	private double weight;
	private int jumpLevel;
	private int runLength;
	
	
	public Competitor(String name, double height, int age, double weight, int jumpLevel,
			int runLength) {
		this.name = name;
		this.height = height;
		this.age = age;
		this.weight = weight;
		this.jumpLevel = jumpLevel;
		this.runLength = runLength;
	}
	
	
	public abstract void jump();
	
	
	public abstract void run();
	
	@Override
	public String toString() {
		return "Competitor{" +
				"name='" + name + '\'' +
				", height=" + height +
				", age=" + age +
				", weight=" + weight +
				", jumpLevel=" + jumpLevel +
				", runLength=" + runLength +
				'}';
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getWeight() {
		return weight;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public int getJumpLevel() {
		return jumpLevel;
	}
	
	public void setJumpLevel(int jumpLevel) {
		this.jumpLevel = jumpLevel;
	}
	
	public int getRunLength() {
		return runLength;
	}
	
	public void setRunLength(int runLength) {
		this.runLength = runLength;
	}
}

