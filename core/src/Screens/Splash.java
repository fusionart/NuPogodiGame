package Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Splash implements Screen {
	private SpriteBatch batch;
	private Sprite splashPic; // for the pic that would be displayed


	@Override
	public void show() {
		batch = new SpriteBatch();
		
		Texture splashTexture = new Texture("img/bg.jpg");
		splashPic = new Sprite(splashPic);
		splashPic.setSize(Gdx.graphics.getHeight(), Gdx.graphics.getWidth()); //setting the size of the pic equal to the screen 

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}


	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

}
