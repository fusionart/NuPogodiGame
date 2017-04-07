package com.nupogodi.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nupogodi.game.GameScreen;

import com.nupogodi.game.GameStartScreen;

public class DesktopLauncher {
	private static final int SCREEN_WIDTH = 600;
	private static final int SCREEN_HEIGH = 450;

	public static void main(String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "Nu Pogodi!";
		config.width = SCREEN_WIDTH;
		config.height = SCREEN_HEIGH;

		new LwjglApplication(new GameScreen(), config);
		//new LwjglApplication(new GameStartScreen(), config);
	}
}
