package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GameScreen extends ApplicationAdapter {
	static Stage gameStage;

	@Override
	public void create() {
		gameStage = new Stage(new ScreenViewport());
		WolfActor wolfActor = new WolfActor();
		Background background = new Background();
		final CreateHands createHands = new CreateHands() {
		};
		gameStage.addActor(background);
		gameStage.addActor(wolfActor);
		Gdx.input.setInputProcessor(gameStage);
		createHands.addHands();
		gameStage.addListener(new InputListener(){
			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				switch (keycode) {
				case Input.Keys.LEFT:
					createHands.armDownLeft.setVisible(true);
					createHands.armDownRight.setVisible(false);
					createHands.armUpLeft.setVisible(false);
					createHands.armUpRight.setVisible(false);
					break;
				case Input.Keys.UP:
					createHands.armDownLeft.setVisible(false);
					createHands.armDownRight.setVisible(false);
					createHands.armUpLeft.setVisible(true);
					createHands.armUpRight.setVisible(false);
					break;
				case Input.Keys.DOWN:
					createHands.armDownLeft.setVisible(false);
					createHands.armDownRight.setVisible(true);
					createHands.armUpLeft.setVisible(false);
					createHands.armUpRight.setVisible(false);
					break;
				case Input.Keys.RIGHT:
					createHands.armDownLeft.setVisible(false);
					createHands.armDownRight.setVisible(false);
					createHands.armUpLeft.setVisible(false);
					createHands.armUpRight.setVisible(true);
					break;

				default:
					break;
				}
				
				return true;
			}
		});

	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameStage.draw();
	}

	public void addActorOnStage(Object object) {
		gameStage.addActor((Actor) object);

	}

}
