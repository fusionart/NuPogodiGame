package WolfBody;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.nupogodi.game.GameScreen;

public class WolfActor extends Actor {
	GameScreen screen = new GameScreen();
	private WolfBodyLeft wolfBodyLeft = new WolfBodyLeft();
	private WolfBodyRight wolfBodyRight = new WolfBodyRight();

	public void createBody() {
		screen.addActorOnStage(wolfBodyLeft);
		screen.addActorOnStage(wolfBodyRight);
		wolfBodyLeft.setVisible(false);
		wolfBodyRight.setVisible(false);
	}
	
	public void wolfBodyLeft(boolean input){
		wolfBodyLeft.setVisible(input);
	}
	public void wolfBodyRight(boolean input){
		wolfBodyRight.setVisible(input);
	}

}
