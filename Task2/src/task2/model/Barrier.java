package task2.model;


public abstract class Barrier {
	
	private String kind;
	private double length;
	private int level;
	
	
	public Barrier(String kind, double length) {
		this.kind = kind;
		this.length = length;
	}
	
	public Barrier(String kind, int level) {
		this.kind = kind;
		this.level = level;
	}
	
	public void overcome(Competitor competitor) {
		competitor.jump();
		competitor.run();
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
}

