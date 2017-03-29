package WolfBody;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class WolfBodyRight extends Actor{
	Texture wolfTextureRight = new  Texture(Gdx.files.internal("WolfBodyRight.png"));
	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(wolfTextureRight, Gdx.graphics.getWidth()/2-wolfTextureRight.getWidth()/2, Gdx.graphics.getHeight()/2-wolfTextureRight.getHeight()/2);
	}
}
