package com.nupogodi.game.desktop;

import java.nio.Buffer;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.sun.prism.Image;
import com.sun.prism.MediaFrame;
import com.sun.prism.PixelFormat;
import com.sun.prism.Texture;
import com.sun.prism.Texture.WrapMode;

public class Egg extends Actor {
	Texture egg = new Texture(Gdx.files.internal("Egg.png"));

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(egg, 0, 0);

	}

	@Override
	public void dispose() {
		egg.dispose();

	}

}
