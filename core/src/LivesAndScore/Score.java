package LivesAndScore;

import Chickens.Egg;
import Hands.CreateHands;

public class Score {
	CreateHands handsPossition = new CreateHands() {
	};
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
		System.out.println("downleft"+handsPossition.getHandPossition()+""+egg.getEggY());
		if(handsPossition.getHandPossition()==1&&egg.getEggY()<150){
			System.out.println("downleft"+handsPossition.getHandPossition()+""+egg.getEggY());
			scoreUpdate();
			return true;
		}
		if(handsPossition.getHandPossition()==2&&egg.getEggY()>200){
			System.out.println("downright"+handsPossition.getHandPossition()+""+egg.getEggY());
			scoreUpdate();
			return true;
		}
		
		return false;
	}

}
