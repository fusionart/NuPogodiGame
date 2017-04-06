package LivesAndScore;

import Chickens.Egg;
import Chickens.EggsGenerator;
import Hands.CreateHands;

public class Score {
	CreateHands handsPossition = new CreateHands();
	int score;

	public Score(int score) {
		setScore(score);
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
		System.out.println(score);
	}

	public boolean addScore(Egg egg) {
		if (handsPossition.getHandPossition() == 1 && egg.getEggLocation() == 1
				&& egg.getEggX() > EggsGenerator.LEFT_END_X - EggsGenerator.RANGE
				&& egg.getEggX() < EggsGenerator.LEFT_END_X) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 2 && egg.getEggLocation() == 2
				&& egg.getEggX() > EggsGenerator.LEFT_END_X - EggsGenerator.RANGE
				&& egg.getEggX() < EggsGenerator.LEFT_END_X) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 3 && egg.getEggLocation() == 3
				&& egg.getEggX() > EggsGenerator.RIGHT_END_X
				&& egg.getEggX() < EggsGenerator.RIGHT_END_X + EggsGenerator.RANGE) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 4 && egg.getEggLocation() == 4
				&& egg.getEggX() > EggsGenerator.RIGHT_END_X
				&& egg.getEggX() < EggsGenerator.RIGHT_END_X + EggsGenerator.RANGE) {
			scoreUpdate();
			return true;
		}

		return false;
	}

}
