package Hands;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ArmDownLeft extends Actor {

	Texture armDownLeft = new Texture(Gdx.files.internal("WolfArmsDownLeft.png"));

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(armDownLeft, 130, 70);
	}
}
