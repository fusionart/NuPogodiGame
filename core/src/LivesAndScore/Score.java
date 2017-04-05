package LivesAndScore;

import Chickens.Egg;
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
		if(handsPossition.getHandPossition()==1&&egg.getEggY()<150){
			scoreUpdate();
			return true;
		}
		if(handsPossition.getHandPossition()==2&&egg.getEggY()>200){
			scoreUpdate();
			return true;
		}
		
		return false;
	}

}
