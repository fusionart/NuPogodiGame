package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

public class GameScreen extends ApplicationAdapter {
	Stage stage;
	
	@Override
	public void create () {
		stage = new Stage(new ScreenViewport());
		WolfActor wolfActor = new WolfActor();
		Background background = new Background();
		stage.addActor(background);
		stage.addActor(wolfActor);
		Gdx.input.setInputProcessor(stage);
		
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.draw();
	}
	
}
