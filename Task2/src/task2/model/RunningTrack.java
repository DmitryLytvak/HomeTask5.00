package task2.model;


public class RunningTrack extends Barrier {
	
	public RunningTrack(String kind, double length) {
		super(kind, length);
	}
	
	@Override
	public void overcome(Competitor competitor) {
		if (competitor.getRunLength() >= getLength()) {
			competitor.run();
		} else {
			System.out.println(competitor.getName() + " can't overcome " + getKind());
		}
	}
}


