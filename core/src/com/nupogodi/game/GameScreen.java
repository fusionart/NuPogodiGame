package com.nupogodi.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.utils.viewport.ScreenViewport;

import Chickens.Chickens;
import Chickens.EggsGenerator;

public class GameScreen extends ApplicationAdapter {
	public static Stage gameStage;
	private EggsGenerator eggsNewTest;
	private SpriteBatch batch;
	private Texture eggTexture;
	private int lives = 3;

	@Override
	public void create() {
		batch = new SpriteBatch();
		eggTexture = new Texture(Gdx.files.internal("newEgg.png"));
		eggsNewTest = new EggsGenerator(eggTexture);
		gameStage = new Stage(new ScreenViewport());
		final WolfActor wolfActor = new WolfActor();
		Background background = new Background();
		gameStage.addActor(background);
		final CreateHands createHands = new CreateHands() {
		};

		Chickens chickens = new Chickens();
		gameStage.addActor(chickens);

		createHands.addHands();

		gameStage.addActor(wolfActor);
		wolfActor.createBody();

		Actor buttons = new Actor();
		gameStage.addActor(buttons);

		Gdx.input.setInputProcessor(gameStage);
		gameStage.addListener(new InputListener() {
			@Override
			public boolean keyDown(InputEvent event, int keycode) {
				switch (keycode) {
				case Input.Keys.LEFT:
					createHands.armDownLeft.setVisible(true);
					createHands.armDownRight.setVisible(false);
					createHands.armUpLeft.setVisible(false);
					createHands.armUpRight.setVisible(false);
					wolfActor.wolfBodyLeft.setVisible(true);
					wolfActor.wolfBodyRight.setVisible(false);
					break;
				case Input.Keys.UP:
					createHands.armDownLeft.setVisible(false);
					createHands.armDownRight.setVisible(false);
					createHands.armUpLeft.setVisible(true);
					createHands.armUpRight.setVisible(false);
					wolfActor.wolfBodyLeft.setVisible(true);
					wolfActor.wolfBodyRight.setVisible(false);
					break;
				case Input.Keys.DOWN:
					createHands.armDownLeft.setVisible(false);
					createHands.armDownRight.setVisible(true);
					createHands.armUpLeft.setVisible(false);
					createHands.armUpRight.setVisible(false);
					wolfActor.wolfBodyLeft.setVisible(false);
					wolfActor.wolfBodyRight.setVisible(true);
					break;
				case Input.Keys.RIGHT:
					createHands.armDownLeft.setVisible(false);
					createHands.armDownRight.setVisible(false);
					createHands.armUpLeft.setVisible(false);
					createHands.armUpRight.setVisible(true);
					wolfActor.wolfBodyLeft.setVisible(false);
					wolfActor.wolfBodyRight.setVisible(true);
					break;

				default:
					break;
				}

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
		// egg.drawEveryEgg(batch);
		batch.end();
		createEggs();
		eggsNewTest.update();
		// egg.update();
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
