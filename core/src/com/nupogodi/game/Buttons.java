package com.nupogodi.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;

public class Buttons {

	Texture Buttons = new Texture(Gdx.files.internal("Size2.png"));
  
	
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(Buttons, 0, 0);
	}

}


