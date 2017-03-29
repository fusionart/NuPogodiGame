package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;

import Hands.ArmDownLeft;
import Hands.ArmDownRight;
import Hands.ArmUpLeft;
import Hands.ArmUpRight;

public abstract class CreateHands extends ApplicationAdapter {
	GameScreen gameScreen = new GameScreen();

	public CreateHands() {
		super();
	}

	public void addHands() {
		ArmDownLeft armDownLeft = new ArmDownLeft();
		ArmUpLeft armUpLeft = new ArmUpLeft();
		ArmDownRight armDownRight = new ArmDownRight();
		ArmUpRight armUpRight = new ArmUpRight();
		armDownLeft.setIsArmVisible(true);
		armUpLeft.setVisible(false);
		armDownRight.setVisible(false);
		armUpRight.setVisible(false);
		gameScreen.addActorOnStage(armDownLeft);
		//gameStage.addActor(armUpLeft);
		//gameStage.addActor(armDownRight);
		//gameStage.addActor(armUpRight);
	}

}