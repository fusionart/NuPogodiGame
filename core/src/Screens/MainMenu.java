package Screens;

import com.badlogic.gdx.ApplicationAdapter;
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
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.nupogodi.game.GameScreen;
import com.nupogodi.game.GameStartScreen;

import InputProcessor.UserInput;

public class MainMenu extends ApplicationAdapter implements Screen {
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


	SpriteBatch sprite;
	private Texture background;
	private Skin mySkin;
	private Texture btnPlayGameTexture;
	private Texture btnSettingsTexture;
	private Texture btnHelpTexture;
	private Texture texture, btnHighestScoreTexture;
	UserInput inputprocessor;
	Sprite img;
	float w,h,tw,th =0;
	SpriteBatch batch;

	public MainMenu(final GameStartScreen nuPagadi) {
		this.game = nuPagadi;
		inputprocessor = new UserInput();
		//img = new Sprite(new Texture(Gdx.files.internal("newEgg.png")));
		stage = new Stage();
		background = new Texture(Gdx.files.internal("BackgroundScreen.png"));
		btnPlayGameTexture = new Texture(Gdx.files.internal("MainMenu/BtnPlay.png"));
		btnHelpTexture = new Texture(Gdx.files.internal("MainMenu/BtnHelp.png"));
		btnSettingsTexture = new Texture(Gdx.files.internal("MainMenu/BtnSettings.png"));
		btnHighestScoreTexture = new Texture("MainMenu/BtnScore.png");
		//btnPlayGame.getTouchable();
	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(inputprocessor);

	}
	
	  @Override
	    public void create () {
	        w = Gdx.graphics.getWidth();
	        h = Gdx.graphics.getHeight();
	        batch = new SpriteBatch();
	        img = new Sprite(new Texture(Gdx.files.internal("iceCream.png")));

	        tw = img.getWidth();
	        th = img.getHeight();
	        img.setBounds(30, 50, h, w);
	        Gdx.input.setInputProcessor(new InputAdapter(){

	            @Override
	            public boolean touchDown(int screenX, int screenY, int pointer, int button) {

	                if(img.getBoundingRectangle().contains(screenX, screenY))
	                       System.out.println("Image Clicked");

	                return true;
	            }

	        });
	    }
	

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		game.batch.draw(background, 1, 1);

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

		game.batch.draw(btnSettingsTexture, Screen_CenterX + Screen_CenterX / 5, 200);

		game.batch.draw(btnHighestScoreTexture, Screen_CenterX + Screen_CenterX / 5, 150);

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
	public void dispose() {
		stage.dispose();
	}

}
