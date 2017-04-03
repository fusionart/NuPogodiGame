package com.nupogodi.game.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.nupogodi.game.Background;

import net.nupogodi.game.screens.Splash;

public class StartScreen extends Game {
	static Stage gameHomeStage;
	public static final String TITLE = "HomeScreen";
	
	@Override
	public void create() {
//		gameHomeStage = new Stage(new ScreenViewport());
//		Background background = new Background();
//		gameHomeStage.addActor(background);
		setScreen(new Splash());
       

	}


	@Override
	public void render() {
//		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
//		gameHomeStage.draw();
        super.render();
	}

	@Override
	public void pause() {
		super.pause();

	}

	@Override
	public void resume() {
		super.resume();

	}

	@Override
	public void dispose() {
		super.dispose();

	}


	@Override
	public void resize(int width, int height) {
		super.resize(width, height);
		
	}
	public void addActorOnStage(Object object) {
		gameHomeStage.addActor((Actor) object);

	}

}
