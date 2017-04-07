package InputProcessor;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;

public class UserInput extends InputAdapter implements ApplicationListener {

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		System.out.println("click:" + screenX + "," + screenY);
		return true;
	}

	@Override
	public void create() {
		Gdx.input.setInputProcessor(this);
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render() {
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

}
