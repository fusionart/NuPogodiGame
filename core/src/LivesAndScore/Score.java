package LivesAndScore;

import java.time.Duration;

import Chickens.Egg;
import Chickens.EggsGenerator;
import Hands.CreateHands;

public class Score {
	CreateHands handsPossition = new CreateHands();
    public int score;
	

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
	
//	public void levelUp() {
//		if(score>20) {
//		EggsGenerator.MINIMUM_TIME_BETWEEN_EGGS--;
//		EggsGenerator.RANGE++;
//		System.out.println("Level up!");
//		}
//	}

	public boolean addScore(Egg egg) {
		if (handsPossition.getHandPossition() == 1 && egg.getEggY() < EggsGenerator.DOWN_END_Y + EggsGenerator.RANGE
				&& egg.getEggY() > EggsGenerator.DOWN_END_Y
				&& egg.getEggX() > EggsGenerator.LEFT_END_X - EggsGenerator.RANGE
				&& egg.getEggX() < EggsGenerator.LEFT_END_X && egg.getIsEgg()) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 2 && egg.getEggY() < EggsGenerator.UP_END_Y + EggsGenerator.RANGE
				&& egg.getEggY() > EggsGenerator.UP_END_Y
				&& egg.getEggX() > EggsGenerator.LEFT_END_X - EggsGenerator.RANGE
				&& egg.getEggX() < EggsGenerator.LEFT_END_X && egg.getIsEgg()) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 3 && egg.getEggY() < EggsGenerator.DOWN_END_Y + EggsGenerator.RANGE
				&& egg.getEggY() > EggsGenerator.DOWN_END_Y && egg.getEggX() > EggsGenerator.RIGHT_END_X
				&& egg.getEggX() < EggsGenerator.RIGHT_END_X + EggsGenerator.RANGE && egg.getIsEgg()) {
			scoreUpdate();
			return true;
		}
		if (handsPossition.getHandPossition() == 4 && egg.getEggY() < EggsGenerator.UP_END_Y + EggsGenerator.RANGE
				&& egg.getEggY() > EggsGenerator.UP_END_Y && egg.getEggX() > EggsGenerator.RIGHT_END_X
				&& egg.getEggX() < EggsGenerator.RIGHT_END_X + EggsGenerator.RANGE && egg.getIsEgg()) {
			scoreUpdate();
			return true;
		}

		return false;
	}

}
