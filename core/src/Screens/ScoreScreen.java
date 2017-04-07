package Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.nupogodi.game.GameScreen;
import com.nupogodi.game.GameStartScreen;

import InputProcessor.UserInput;

public class ScoreScreen implements Screen {
	private static final int Screen_CenterX = GameStartScreen.Screen_WIDTH / 3;
	private static final int Screen_CenterY = GameStartScreen.Screen_HEIGH / 2;

	final GameStartScreen game;
	Texture background, msgBox, backArrow, Score, bestScore, currentScore;
	UserInput inputprocessor;

	public ScoreScreen(final GameStartScreen nuPagadi) {
		this.game = nuPagadi;
		background = new Texture("BackgroundScreen.png");
		msgBox = new Texture("ScoreScreen/screen2.png");
		backArrow = new Texture("ScoreScreen/backArrow3.png");
		bestScore = new Texture("ScoreScreen/HighestScoreLabel.png");
		currentScore = new Texture("ScoreScreen/currentscore.png");
	}

	@Override
	public void show() {
		// white = new BitmapFont(Gdx.files.internal("src/fonts/white.fnt"),
		// false);

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 1, 0, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();

		game.batch.draw(background, 0, 0);
		game.batch.draw(msgBox, 15, 50);
		game.batch.draw(bestScore, 20, 325);
		game.batch.draw(currentScore, 150, 270);
		game.batch.draw(backArrow, 30, 55);

		if (Gdx.input.isTouched()) {

			game.setScreen(new MainMenu(game));

		}
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

	}

	@Override
	public void dispose() {

	}

}
