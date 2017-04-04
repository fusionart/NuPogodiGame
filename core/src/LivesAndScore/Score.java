package LivesAndScore;

public class Score {
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

}
