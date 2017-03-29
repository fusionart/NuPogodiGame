package Hands;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ArmUpLeft extends Actor {
	Texture armUpLeft = new Texture(Gdx.files.internal("WolfArmsUpLeft.png"));

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(armUpLeft, 0, 50);
	}

}
