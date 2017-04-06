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
import com.nupogodi.game.NuPagadiStartScreen;

public class MainMenu implements Screen {
	private static final int Screen_CenterX = NuPagadiStartScreen.Screen_WIDTH / 3;
	private static final int Screen_CenterY = NuPagadiStartScreen.Screen_HEIGH / 2;

	final NuPagadiStartScreen game;
	private Stage stage;
	private TextureAtlas atlas;
	private Skin skin; // the appearance of everything
	private Table table; // For easier positioning of the objects
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

	public MainMenu(final NuPagadiStartScreen nuPagadi) {
		this.game = nuPagadi;
		stage = new Stage();
		background = new Texture(Gdx.files.internal("BackgroundScreen.png"));
		btnPlayGameTexture = new Texture(Gdx.files.internal("MainMenu/BtnPlay.png"));
		btnHelpTexture = new Texture(Gdx.files.internal("MainMenu/BtnHelp.png"));
		btnSettingsTexture = new Texture(Gdx.files.internal("MainMenu/BtnSettings.png"));
		btnHighestScoreTexture = new Texture("MainMenu/BtnScore.png");
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
		game.batch.draw(background, 1, 1);

		game.batch.draw(btnPlayGameTexture, Screen_CenterX, 300);
		if (Gdx.input.isTouched()) {
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
		

	}

	@Override
	public void dispose() {
		

	}

}
