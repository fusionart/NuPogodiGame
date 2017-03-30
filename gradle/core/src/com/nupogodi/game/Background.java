package com.nupogodi.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Background extends Actor {
	
	Texture background = new Texture(Gdx.files.internal("BackgroundScreen.png"));


	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(background, 0, 0);

	}

}
