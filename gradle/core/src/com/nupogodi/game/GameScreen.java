package com.nupogodi.game;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GameScreen extends ApplicationAdapter {
	static Stage gameStage;

	@Override
	public void create() {
		gameStage = new Stage(new ScreenViewport());
		WolfActor wolfActor = new WolfActor();
		Background background = new Background();
		CreateHands createHands = new CreateHands() {
		};
		gameStage.addActor(background);
		gameStage.addActor(wolfActor);
		Gdx.input.setInputProcessor(gameStage);
		createHands.addHands();

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
