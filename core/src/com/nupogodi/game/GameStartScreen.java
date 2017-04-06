package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.utils.viewport.Viewport;

import Screens.GameOver;
import Screens.HelpScreen;
import Screens.MainMenu;

import Screens.Splash;

public class GameStartScreen extends Game {
	public static Stage $gameStage;
	public SpriteBatch batch;
	public Viewport screenPort;
	private Game game;
	private Skin gameSkin;
	public static final int Screen_WIDTH = 600;
	public static final int Screen_HEIGH = 450;

	private static final String title = "Nu pogodi Game";

	public GameStartScreen() {
		game = this;
	}

	@Override
	public void create() {
		batch = new SpriteBatch();
		setScreen(new GameScreen());
		// setScreen(new Splash());
		//setScreen(new MainMenu(this));
	//	gameSkin = new Skin(Gdx.files.internal("skin/glassy-ui.json"));
		// setScreen(new HelpScreen(this));
		// setScreen(new SettingsScreen(this));
		// setScreen(new ScoreScreen(this));
		// setScreen(new GameOver(this));
		// setScreen(new OptionScreen(this));

	}

	public void gotoMenuScreens() {
		MainMenu menu = new MainMenu(this);
		setScreen(menu);
	}

//	public void gotoGameScreen() {
//		GameScreen gameScreen = new GameScreen(this);
//		setScreen(gameScreen);
//	}
//
//	public void gotoSettingsScreen() {
//		SettingsScreen settingsScreen = new SettingsScreen(this);
//		setScreen(settingsScreen);
//	}

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
