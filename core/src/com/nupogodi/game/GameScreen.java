package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import Chickens.Chickens;
import Chickens.EggsGenerator;
import LivesAndScore.Lives;
import LivesAndScore.Score;
import Screens.GameOver;
import Screens.MainMenu;
import WolfBody.WolfMovement;

public class GameScreen extends ApplicationAdapter implements Screen {
	static Stage gameStage;
	private Game game;
	private Background background;
	private EggsGenerator eggsGenerator;
	private SpriteBatch batch;
	private TextureRegion eggTextReg;
	private Texture eggTexture, scoreLabel;
	private WolfMovement wolfMovement;
	private Lives lives;
	boolean gameOver = false;
	BitmapFont font;
	private Score score;
	
	@Override
	public void create() {
		batch = new SpriteBatch();
		wolfMovement = new WolfMovement();
		eggTexture = new Texture(Gdx.files.internal("newEgg.png"));
		eggTextReg = new TextureRegion(new Texture(Gdx.files.internal("newEgg.png")),20,27);
		eggsGenerator = new EggsGenerator(eggTextReg);
		gameStage = new Stage(new ScreenViewport());
		background = new Background();
		gameStage.addActor(background);
		score = new Score();
		lives = new Lives();
		

		Chickens chickens = new Chickens();
		gameStage.addActor(chickens);

		font = new BitmapFont(Gdx.files.internal("fonts/font.fnt"));

		addListenerToStage();
	}

	private void addListenerToStage() {
		Gdx.input.setInputProcessor(gameStage);
		gameStage.addListener(new InputListener() {
			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				wolfMovement.wolfMovement(keycode);
				return true;
			}
		});
	}

	@Override
	public void render() {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		gameStage.act();
		gameStage.draw();
		batch.begin();
		if (lives.getLives() > 0) {
			eggsGenerator.update(batch);
		}
		if(lives.getLives() == 0) {
	//		game.setScreen(new GameOver(game));
		}
		font.setColor(Color.BLACK);
		font.draw(batch, "Score: "+String.valueOf(score.getScore()), 450, 420);
		font.draw(batch, "Lives: "+String.valueOf(lives.getLives()), 150,420);
		System.out.println(score.getScore());
		batch.end();
		createEggs();
		
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	private void createEggs() {
		if (lives.getLives() > 0) {
			eggsGenerator.addEggs();
		}
		else if(lives.getLives()==0) {
			gameOver=true;
		}
	}

	public void addActorOnStage(Object object) {
		gameStage.addActor((Actor) object);
	}

	@Override
	public void show() {
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
