package InputProcessor;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.Screen;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

public class UserInput extends InputAdapter implements ApplicationListener {
	private static int touchPointX, touchPointY;

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		System.out.println("click:" + screenX + "," + screenY);
		System.out.println(touchPointX + " " + touchPointY);
	
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
