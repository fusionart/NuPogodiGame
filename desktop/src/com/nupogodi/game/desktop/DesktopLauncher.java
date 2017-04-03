package com.nupogodi.game.desktop;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nupogodi.game.GameScreen;
import com.nupogodi.game.NuPagadiStartScreen;

public class DesktopLauncher {
	private static final int SCREEN_WIDTH = 600;
	private static final int SCREEN_HEIGH = 450;

	public static void main(String[] arg) {
		LwjglApplicationConfiguration config2 = new LwjglApplicationConfiguration();
		config2.title = "Ну Погоди ";
		config2.width = SCREEN_WIDTH;
		config2.height = SCREEN_HEIGH;

		// new LwjglApplication (new GameScreen(), config2); //Commented in ordet to try out the splash Screen
		new LwjglApplication(new NuPagadiStartScreen(), config2);
	}
}
