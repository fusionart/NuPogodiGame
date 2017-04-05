package Hands;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.nupogodi.game.GameScreen;

public class CreateHands {

	GameScreen screen = new GameScreen();
	private ArmDownLeft armDownLeft = new ArmDownLeft();
	private ArmUpLeft armUpLeft = new ArmUpLeft();
	private ArmDownRight armDownRight = new ArmDownRight();
	private ArmUpRight armUpRight = new ArmUpRight();
	private static int handPossition;

	public void addHands() {
		screen.addActorOnStage(armDownLeft);
		screen.addActorOnStage(armUpLeft);
		screen.addActorOnStage(armDownRight);
		screen.addActorOnStage(armUpRight);
		armDownLeft.setVisible(false);
		armUpLeft.setVisible(false);
		armDownRight.setVisible(false);
		armUpRight.setVisible(false);
	}

	public void armDownLeft(boolean input) {
		armDownLeft.setVisible(input);
	}

	public void armUpLeft(boolean input) {
		armUpLeft.setVisible(input);
	}

	public void armDownRight(boolean input) {
		armDownRight.setVisible(input);
	}

	public void armUpRight(boolean input) {
		armUpRight.setVisible(input);
	}

	public void setHandPossition(int i) {
		handPossition = i;
	}

	public int getHandPossition() {
		return handPossition;
	}

}
