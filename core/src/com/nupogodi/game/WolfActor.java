package com.nupogodi.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class WolfActor extends Actor {
	Texture wolfTexture = new  Texture(Gdx.files.internal("WolfWithArmsPosition1.png"));

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(wolfTexture, Gdx.graphics.getWidth()/2-wolfTexture.getWidth()/2, Gdx.graphics.getHeight()/2-wolfTexture.getHeight()/2);
	}

}
