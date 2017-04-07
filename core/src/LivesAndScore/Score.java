package LivesAndScore;

import Chickens.Egg;
import Chickens.EggsGenerator;
import Hands.CreateHands;

public class Score {
	private CreateHands handsPossition = new CreateHands();
    private static int score;
	

	public Score(int score) {
		setScore(score);
	}
	public Score (){
		
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public void scoreUpdate() {
		score += 1;
		setScore(score);
		levelUp(score);
	}
	
	public void levelUp(int score) {
		switch (score) {
		case 10:
			EggsGenerator.increaseSpeed(0.1f);
			break;
		case 20:
			EggsGenerator.increaseSpeed(0.1f);
			break;
		case 30:
			EggsGenerator.increaseSpeed(0.05f);
			break;
		case 40:
			EggsGenerator.increaseSpeed(0.05f);
			break;
		case 50:
			EggsGenerator.increaseSpeed(0.05f);
			break;

		default:
			EggsGenerator.increaseSpeed(0);
			break;
		}

	}

	public boolean addScore(Egg egg) {
		if (handsPossition.getHandPossition() == 1 && egg.getEggY() > EggsGenerator.DOWN_END_Y - EggsGenerator.RANGE
				&& egg.getEggY() < EggsGenerator.DOWN_END_Y + EggsGenerator.RANGE
				&& egg.getEggX() > EggsGenerator.LEFT_END_X - EggsGenerator.RANGE
				&& egg.getEggX() < EggsGenerator.LEFT_END_X && egg.getIsCatchable()) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 2 && egg.getEggY() > EggsGenerator.UP_END_Y - EggsGenerator.RANGE
				&& egg.getEggY() < EggsGenerator.UP_END_Y + EggsGenerator.RANGE
				&& egg.getEggX() > EggsGenerator.LEFT_END_X - EggsGenerator.RANGE
				&& egg.getEggX() < EggsGenerator.LEFT_END_X && egg.getIsCatchable()) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 3 && egg.getEggY() > EggsGenerator.DOWN_END_Y - EggsGenerator.RANGE
				&& egg.getEggY() < EggsGenerator.DOWN_END_Y + EggsGenerator.RANGE && egg.getEggX() > EggsGenerator.RIGHT_END_X
				&& egg.getEggX() < EggsGenerator.RIGHT_END_X + EggsGenerator.RANGE && egg.getIsCatchable()) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 4 && egg.getEggY() > EggsGenerator.UP_END_Y - EggsGenerator.RANGE
				&& egg.getEggY() < EggsGenerator.UP_END_Y + EggsGenerator.RANGE && egg.getEggX() > EggsGenerator.RIGHT_END_X
				&& egg.getEggX() < EggsGenerator.RIGHT_END_X + EggsGenerator.RANGE && egg.getIsCatchable()) {
			scoreUpdate();
			return true;
		}

		return false;
	}

}
