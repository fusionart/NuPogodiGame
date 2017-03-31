package com.nupogodi.game.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.nupogodi.game.Background;

public class StartScreen implements ApplicationListener {
	static Stage gameHomeStage;
	
	@Override
	public void create() {
		gameHomeStage = new Stage(new ScreenViewport());
		Background background = new Background();
		gameHomeStage.addActor(background);

	}


	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameHomeStage.draw();

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}


	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}
	public void addActorOnStage(Object object) {
		gameStage.addActor((Actor) object);

	}

}
