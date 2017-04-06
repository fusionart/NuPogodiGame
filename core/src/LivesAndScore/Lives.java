package LivesAndScore;

import com.badlogic.gdx.graphics.Texture;

public class Lives {
	private static final int LIVES = 50;
	private static int currentLives = LIVES;
	
	
	public void lostLive (){
		currentLives-=1;
	}
	public int getLives(){
		return currentLives;
	}
	
}
