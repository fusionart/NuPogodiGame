package com.nupogodi.game;

import com.badlogic.gdx.scenes.scene2d.Actor;

import WolfBody.WolfBodyLeft;
import WolfBody.WolfBodyRight;

public class WolfActor extends Actor {
	GameScreen screen = new GameScreen();
	WolfBodyLeft wolfBodyLeft = new WolfBodyLeft();
	WolfBodyRight wolfBodyRight = new WolfBodyRight();

	public void createBody() {
		screen.addActorOnStage(wolfBodyLeft);
		screen.addActorOnStage(wolfBodyRight);
		wolfBodyLeft.setVisible(false);
		wolfBodyRight.setVisible(false);
	}

}
