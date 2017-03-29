package Hands;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ArmDownRight extends Actor {
	Texture armDownRight = new Texture(Gdx.files.internal("WolfArmsDownRight.png"));

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(armDownRight, 360, 70);
	}

}
