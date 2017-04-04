package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Stage;

import Screens.Splash;

public class NuPogodiStartScreen extends Game {
	public static Stage $gameStage;
	public static final int Screen_HEIGH = 600;
	public static final int Screen_WIDTH = 450;
	private static final String title = "Nu pogodi Game";

	@Override
	public void create() {
		setScreen(new Splash());
	}
	@Override
	public void resize(int width, int height) {
		super.resize(height, width);
	}

	@Override
	public void render() {
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

}