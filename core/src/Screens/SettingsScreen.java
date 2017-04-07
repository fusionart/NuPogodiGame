package Screens;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.nupogodi.game.GameStartScreen;

public class SettingsScreen implements Screen {
	final GameStartScreen game;
	private Skin mySkin;
	private Stage stage;
	private Texture background;
	private Texture backArrow;
	private Texture screenBox;

	float backArrowX;
	float backArrowY;
	float touchX;
	float touchY;

	public SettingsScreen(final GameStartScreen NuPagadi) {
		this.game = NuPagadi;
		stage = new Stage();
		background = new Texture("BackgroundScreen.png");
		backArrow = new Texture("Settings/backArrow3.png");
		screenBox = new Texture("Settings/screen2.png");
		backArrowX = 25;
		backArrowY = 55;

		// stage.addActor(_Main.titlee);
	}

	@Override
	public void show() {

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 1, 1, 0);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		game.batch.begin();
		game.batch.draw(background, 0, 0);
		game.batch.draw(screenBox, 15, 45);
		game.batch.draw(backArrow, backArrowX, backArrowY);

		if (Gdx.input.isTouched()) {
			game.setScreen(new MainMenu(game));
		}
		// if (Gdx.input.isTouched()) { // check if the touch is within the area
		// of
		// // the first texture
		// if (touchX > backArrowX && touchX < (backArrowX +
		// backArrow.getWidth()) && touchY > backArrowY
		// && touchY < (backArrowY + backArrow.getHeight())) {
		// System.out.println("working");
		// game.dispose();
		// game.setScreen(new MenuScreens(game));
		// }
		// }
		game.batch.end();

	}

	@Override
	public void resize(int width, int height) {
		// game.screenPort.update(width, height);

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
