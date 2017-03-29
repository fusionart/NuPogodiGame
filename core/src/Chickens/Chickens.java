package Chickens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Chickens extends Actor{
	
	private static final int DOWN_POSSITION = 120;
	private static final int UP_POSSITION = 230;
	Texture chickenDownLeft = new Texture(Gdx.files.internal("ChickenDL.png"));
	Texture chickenDownRight = new Texture(Gdx.files.internal("ChickenDR.png"));
	Texture chickenUpLeft = new Texture(Gdx.files.internal("ChickenDL.png"));
	Texture chickenUpRight = new Texture(Gdx.files.internal("ChickenDR.png"));

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(chickenDownLeft, 0, DOWN_POSSITION);
		batch.draw(chickenDownRight, Gdx.graphics.getWidth()-chickenDownRight.getWidth(), DOWN_POSSITION);
		batch.draw(chickenUpLeft, 0, UP_POSSITION);
		batch.draw(chickenUpRight, Gdx.graphics.getWidth()-chickenUpRight.getWidth(), UP_POSSITION);
	}
}
