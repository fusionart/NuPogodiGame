package com.nupogodi.game;

import com.badlogic.gdx.scenes.scene2d.Actor;

import Hands.ArmDownLeft;
import Hands.ArmDownRight;
import Hands.ArmUpLeft;
import Hands.ArmUpRight;

public abstract class CreateHands extends Actor {

	GameScreen screen = new GameScreen();
	private ArmDownLeft armDownLeft = new ArmDownLeft();
	private ArmUpLeft armUpLeft = new ArmUpLeft();
	private ArmDownRight armDownRight = new ArmDownRight();
	private ArmUpRight armUpRight = new ArmUpRight();

	public CreateHands() {
		super();

	}

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
}
