package Chickens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Chickens extends Actor{

	Texture chickens = new Texture(Gdx.files.internal("chickens.png"));

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(chickens, 0, 0);
	}
}
