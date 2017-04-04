package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import Chickens.Chickens;
import Chickens.EggsGenerator;
import LivesAndScore.Score;
import WolfBody.WolfMovement;

public class GameScreen extends ApplicationAdapter {
	static Stage gameStage;
	private Background background;
	private EggsGenerator eggsNewTest;
	private SpriteBatch batch;
	private Texture eggTexture;
	private Score score;
	private WolfMovement wolfMovement;
	private int lives = 3;

	@Override
	public void create() {
		batch = new SpriteBatch();
		score = new Score(0);
		wolfMovement = new WolfMovement();
		eggTexture = new Texture(Gdx.files.internal("newEgg.png"));
		eggsNewTest = new EggsGenerator(eggTexture);
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
		eggsNewTest.drawEveryEgg(batch);
		batch.end();
		createEggs();
		eggsNewTest.update();
	}

	@Override
	public void dispose() {
		batch.dispose();
	}

	private void createEggs() {
		if (lives > 0) {
			eggsNewTest.addEggs();
		}
	}

	public void addActorOnStage(Object object) {
		gameStage.addActor((Actor) object);
	}

}
