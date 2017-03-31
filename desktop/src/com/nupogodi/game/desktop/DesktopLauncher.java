package com.nupogodi.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.nupogodi.game.GameScreen;

public class DesktopLauncher {
	private static final int SCREEN_WIDTH = 600;
	private static final int SCREEN_HEIGH = 450;
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config1 = new LwjglApplicationConfiguration();
		config1.title = "Ну Погоди";
		config1.width = SCREEN_WIDTH;
		config1.height = SCREEN_HEIGH;
		
		
		LwjglApplicationConfiguration config2 = new LwjglApplicationConfiguration();
		config2.title = "Ну Погоди Game Screen";
		config2.width = SCREEN_WIDTH;
		config2.height = SCREEN_HEIGH;
		
		//new LwjglApplication(new StartScreen(), config1);
		new LwjglApplication(new GameScreen(), config2);
	}
}
