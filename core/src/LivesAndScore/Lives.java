package LivesAndScore;

public class Lives {
	private static final int LIVES = 3;
	private static int currentLives = LIVES;
	
	public void lostLive (){
		currentLives-=1;
	}
	public int getLives(){
		return currentLives;
	}
	
}
