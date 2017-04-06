package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
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
	private Lives lives = new Lives();
	
	
//	public GameScreen(final NuPagadiStartScreen nuPagadi) {
//		this.game = nuPagadi;
//		gameStage = new Stage();
//		
//	}


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
		

		Chickens chickens = new Chickens();
		gameStage.addActor(chickens);

		Actor buttons = new Actor();
		gameStage.addActor(buttons);

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
		gameStage.draw();
		batch.begin();
		if (lives.getLives() > 0) {
			//eggsGenerator.drawEveryEgg(batch);
			eggsGenerator.update(batch);
		}
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
