package Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Splash implements Screen {
	private SpriteBatch batch;
	private Sprite splashPic; // for the pic that would be displayed

	@Override
	public void show() {
		batch = new SpriteBatch();

		Texture splashTexture = new Texture("BackgroundScreen.png");
		splashPic = new Sprite(splashPic);
		splashPic.setSize(Gdx.graphics.getHeight(), Gdx.graphics.getWidth()); // setting the size of the splash pic
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 1, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		batch.begin();
		splashPic.draw(batch);
		batch.end();

	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {

	}

	@Override
	public void resume() {

	}

	@Override
	public void dispose() {
    batch.dispose(); // to free some memory when we don't need the batch any more 
    splashPic.getTexture().dispose(); // good to dispose textures unless we're using them yet
	}

	@Override
	public void hide() {

	}

}
