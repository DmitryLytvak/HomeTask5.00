package task2.model;


public class Wall extends Barrier {
	
	public Wall(String kind, int level) {
		super(kind, level);
	}
	
	@Override
	public void overcome(Competitor competitor) {
		System.out.println(competitor.getName() + " starts the competition.");
		if (competitor.getJumpLevel() >= getLevel()) {
			competitor.jump();
		} else {
			System.out.println(competitor.getName() + " can't overcome " + getKind());
		}
	}
}


