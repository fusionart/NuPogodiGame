package com.nupogodi.game;
import com.badlogic.gdx.scenes.scene2d.Actor;

import Hands.ArmDownLeft;
import Hands.ArmDownRight;
import Hands.ArmUpLeft;
import Hands.ArmUpRight;

public abstract class CreateHands extends Actor {
	GameScreen screen = new GameScreen();
	ArmDownLeft armDownLeft = new ArmDownLeft();
	ArmUpLeft armUpLeft = new ArmUpLeft();
	ArmDownRight armDownRight = new ArmDownRight();
	ArmUpRight armUpRight = new ArmUpRight();

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
	
	

}