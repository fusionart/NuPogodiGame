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

public class HelpScreen implements Screen {
	private static final int Screen_CenterX = GameStartScreen.Screen_WIDTH / 3;
	private static final int Screen_CenterY = GameStartScreen.Screen_HEIGH / 2;

	final GameStartScreen game;
	private Stage stage;
	SpriteBatch sprite;
	private Texture background;
	private Texture helpLabel, backArrow;
	UserInput inputprocessor;

	public HelpScreen(final GameStartScreen nuPagadi) {
		this.game = nuPagadi;
		background = new Texture(Gdx.files.internal("HelpScreen/BackgroundScreen.png"));
		helpLabel = new Texture(Gdx.files.internal("HelpScreen/HelpScreen5.png"));
		backArrow = new Texture("HelpScreen/backArrow3.png");
		

	}

	@Override
	public void show() {
		Gdx.input.setInputProcessor(inputprocessor);


	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();

		game.batch.draw(background, 0, 0);
		game.batch.draw(helpLabel, 2, 25);
		game.batch.draw(backArrow, 3, 35);
		
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
		Gdx.input.setInputProcessor(null);

	}

}
