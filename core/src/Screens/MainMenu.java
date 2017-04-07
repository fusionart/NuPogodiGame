package Screens;

import java.lang.management.PlatformLoggingMXBean;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputAdapter;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Camera;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.nupogodi.game.GameScreen;
import com.nupogodi.game.GameStartScreen;

import InputProcessor.UserInput;

public class MainMenu extends InputAdapter implements Screen, ApplicationListener {
	private static final int Screen_CenterX = GameStartScreen.Screen_WIDTH / 3;
	private static final int Screen_CenterY = GameStartScreen.Screen_HEIGH / 2;

	final GameStartScreen game;
	private Stage stage;
	private TextureAtlas atlas;
	private Skin skin; // the appearance of everything
	//private Table table; // For easier positioning of the objects
	private TextButton btnPlayGame, btnSettings, btnHelp, btnHighestScore;
	private BitmapFont white;
	private Label heading;
	Vector3 touchPoint = new Vector3();
	private Camera camera;


	SpriteBatch sprite;
	private Texture background;
	private Skin mySkin;
	private Texture btnPlayGameTexture;
	private Texture btnSettingsTexture;
	private Texture btnHelpTexture;
	private Texture texture, btnHighestScoreTexture;
	private Sprite playBTNSprite;
	UserInput inputprocessor;

<<<<<<< HEAD
	// Gdx.input.setInputProcessor(inputProcessor);
	public MainMenu(final GameStartScreen nuPogodi) {
		this.game = nuPogodi;
=======

	public MainMenu(final GameStartScreen nuPagadi) {
		this.game = nuPagadi;
>>>>>>> 4d4668181b612085ac441efe0d14bf9dd50c9d1b
		inputprocessor = new UserInput();

		stage = new Stage();
		background = new Texture(Gdx.files.internal("BackgroundScreen.png"));
		btnPlayGameTexture = new Texture(Gdx.files.internal("MainMenu/BtnPlay.png"));
		btnHelpTexture = new Texture(Gdx.files.internal("MainMenu/BtnHelp.png"));
		btnSettingsTexture = new Texture(Gdx.files.internal("MainMenu/BtnSettings.png"));
		btnHighestScoreTexture = new Texture("MainMenu/BtnScore.png");
<<<<<<< HEAD
		playBTNSprite = new Sprite(btnPlayGameTexture);
=======
		//btnPlayGame.getTouchable();
>>>>>>> 4d4668181b612085ac441efe0d14bf9dd50c9d1b
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(this);

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		game.batch.draw(background, 1, 1);

<<<<<<< HEAD
		game.batch.draw(playBTNSprite, Screen_CenterX, 300);

		// game.batch.draw(btnHelpTexture, Screen_CenterX + Screen_CenterX / 5,
		// 250);
=======
		game.batch.draw(btnPlayGameTexture, Screen_CenterX, 300);
		 
		 if(Gdx.input.justTouched())
		   {
//			   
				//touchPointX.set(Gdx.input.getX());
				//touchPointY.set(Gdx.input.getY());
			   // if( btnPlayGameTexture).getBoundingRectangles().contains(touchPointX,touchPointY))
			     
			   game.setScreen(new GameScreen());
			     }
			   
			
		game.batch.draw(btnHelpTexture, Screen_CenterX + Screen_CenterX / 5, 250);
>>>>>>> 4d4668181b612085ac441efe0d14bf9dd50c9d1b

		// game.batch.draw(btnSettingsTexture, Screen_CenterX + Screen_CenterX /
		// 5, 200);

		// game.batch.draw(btnHighestScoreTexture, Screen_CenterX +
		// Screen_CenterX / 5, 150);

		game.batch.end();

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
	public void hide() {
		Gdx.input.setInputProcessor(null);
	}
   public void update() {
//	   if(Gdx.input.justTouched())
//	   {
//	   
//		touchPointX.set(Gdx.input.getX());
//		touchPointY.set(Gdx.input.getY());
//	    if( btnPlayGameTexture).getBoundingRectangles().contains(touchPointX,touchPointY))
//	     {
//	   game.
//	     }
//	   }
   }
	@Override
<<<<<<< HEAD
	public boolean keyDown(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyUp(int keycode) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean keyTyped(char character) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// camera.unproject(touchPoint.set(Gdx.input.getX(), Gdx.input.getY(),
		// 0));
//		System.out.println("coord" + screenX + " : " + screenY);
//		System.out.println("x" + Screen_CenterX + " / " + (Screen_CenterX + playBTNSprite.getWidth()));
//		System.out.println("y " + (GameStartScreen.Screen_HEIGH - 300) + " / "
//				+ (GameStartScreen.Screen_HEIGH - 300 - playBTNSprite.getHeight()));
		if ((screenX > Screen_CenterX && screenX < (Screen_CenterX + playBTNSprite.getWidth()))
				&& (screenY < GameStartScreen.Screen_HEIGH - 300)
				&& screenY > (GameStartScreen.Screen_HEIGH - 300 - playBTNSprite.getHeight())) {
			System.out.println("playBTNSprite clicked");
			game.setScreen(new GameScreen(game));
		}
		return true;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void create() {
		// TODO Auto-generated method stub

=======
	public void dispose() {
		stage.dispose();
>>>>>>> 4d4668181b612085ac441efe0d14bf9dd50c9d1b
	}

	@Override
	public void render() {
		// TODO Auto-generated method stub

	}
	@Override
	public void dispose() {
		stage.dispose();
	}
}
