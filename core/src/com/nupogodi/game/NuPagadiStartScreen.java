package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;

public class NuPagadiStartScreen extends ApplicationAdapter {
	private static final String title = "Nu pagadi Game";

	@Override
	public void create() {
		setScreen(new Splash());

	}

	@Override
	public void resize(int width, int height) {
		super.resize(300, 600);
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
