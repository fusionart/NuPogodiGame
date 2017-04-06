package Hands;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ArmUpRight extends Actor {
	Texture armUpRight = new Texture(Gdx.files.internal("arms/armUpRight.png"));

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(armUpRight, 0, 0);
	}

}
