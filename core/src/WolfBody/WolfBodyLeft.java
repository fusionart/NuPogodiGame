package WolfBody;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class WolfBodyLeft extends Actor{
	Texture wolfTextureLeft = new  Texture(Gdx.files.internal("WolfBodyLeft.png"));
	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(wolfTextureLeft, Gdx.graphics.getWidth()/2-wolfTextureLeft.getWidth()/2, Gdx.graphics.getHeight()/2-wolfTextureLeft.getHeight()/2);
	}
}
