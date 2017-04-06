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

public class GameOver implements Screen {
	private static final int Screen_CenterX = GameStartScreen.Screen_WIDTH / 3;
	private static final int Screen_CenterY = GameStartScreen.Screen_HEIGH / 2;

	final GameStartScreen game;
	private Stage stage;
	SpriteBatch sprite;
	Texture msgGameOver;
	private Texture scoreIcon;
	private Texture homeIcon;
	private Texture background;
	private Texture replayIcon;
	private Texture score;
	private Texture bestScore;

	public GameOver(final GameStartScreen nuPagadi) {
		this.game = nuPagadi;
		stage = new Stage();
		background = new Texture("GameOver/BackgroundScreen.png");
		msgGameOver = new Texture("GameOver/GameOverMSG.png");
		scoreIcon = new Texture("GameOver/sc2.png");
		homeIcon = new Texture("GameOver/home.png");
		replayIcon = new Texture("GameOver/replay2.png");
		score = new Texture("GameOver/scoreLabel.png");
		bestScore = new Texture("GameOver/bestscore.png");

	}

	@Override
	public void show() {
		// white = new BitmapFont(Gdx.files.internal("src/fonts/white.fnt"),
		// false);

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();

		game.batch.draw(background, 0, 0);
		game.batch.draw(background, 0, 0);
		game.batch.draw(msgGameOver, 8, 30);
		game.batch.draw(bestScore, 150, 220);
		game.batch.draw(homeIcon, 150, 50);
		game.batch.draw(replayIcon, 245, 80);
		game.batch.draw(scoreIcon, 350, 50);
		game.batch.draw(score, 150, 230);

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
