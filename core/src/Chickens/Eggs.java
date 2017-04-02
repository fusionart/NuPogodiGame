package Chickens;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.nupogodi.game.GameScreen;

public class Eggs {
	GameScreen gameScreen = new GameScreen();
	private static final float MINIMUM_TIME_BETWEEN_EGGS = .7f;
	private static final int DOWN_POSSITION = 120;
	private static final int UP_POSSITION = 230;
	private static final float OFFSET_POSSITION = 20;
	private static final float VELOCITY_X = 150;
	private static final float VELOCITY_Y = 150;
	private Texture eggTexture;
	private Sprite newEgg;
	private Vector2 velocity = new Vector2();
	private List<Sprite> eggsListLeft = new ArrayList<Sprite>();
	private List<Sprite> eggsListRight = new ArrayList<Sprite>();
	private float timeSinceLastEgg = 0;
	private Random rand = new Random();

	public Eggs(Texture eggTexture) {
		this.eggTexture = eggTexture;
		setVelocity(new Vector2(VELOCITY_X, VELOCITY_Y));
	}

	public void addEggs() {
		switch (generateRandom()) {
		case 1:
			addEggDownLeft();
			break;
		case 2:
			addEggUpLeft();
			break;
		case 3:
			addEggDownRight();
			break;
		case 4:
			addEggUpRight();
			break;

		default:
			break;
		}

	}

	private void addEggUpRight() {
		if (canCreateEgg()) {
			newEgg = new Sprite(eggTexture);
			newEgg.setPosition(gameScreen.gameStage.getWidth() - OFFSET_POSSITION, UP_POSSITION);
			eggsListRight.add(newEgg);
			timeSinceLastEgg = 0;
		}

	}

	private void addEggDownRight() {
		if (canCreateEgg()) {
			newEgg = new Sprite(eggTexture);
			newEgg.setPosition(gameScreen.gameStage.getWidth() - OFFSET_POSSITION, DOWN_POSSITION);
			eggsListRight.add(newEgg);
			timeSinceLastEgg = 0;
		}

	}

	private void addEggUpLeft() {
		if (canCreateEgg()) {
			newEgg = new Sprite(eggTexture);
			newEgg.setPosition(OFFSET_POSSITION, UP_POSSITION);
			eggsListLeft.add(newEgg);
			timeSinceLastEgg = 0;
		}

	}

	private void addEggDownLeft() {
		if (canCreateEgg()) {
			newEgg = new Sprite(eggTexture);
			newEgg.setPosition(OFFSET_POSSITION, DOWN_POSSITION);
			eggsListLeft.add(newEgg);
			timeSinceLastEgg = 0;
		}

	}

	private int generateRandom() {
		int n = rand.nextInt(4) + 1;
		return n;
	}

	private boolean canCreateEgg() {
		return timeSinceLastEgg > MINIMUM_TIME_BETWEEN_EGGS;
	}

	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}

	public void drawEveryEgg(SpriteBatch batch) {
		for (Sprite egg : eggsListLeft) {
			egg.draw(batch);
		}
		for (Sprite egg : eggsListRight) {
			egg.draw(batch);
		}

	}

	public void update() {
		Iterator<Sprite> i = eggsListLeft.iterator();
		while (i.hasNext()) {
			Sprite egg = i.next();
			moveLeftSide(egg);
			if (egg.getX() > 100)
				i.remove();
		}
		Iterator<Sprite> j = eggsListRight.iterator();
		while (j.hasNext()) {
			Sprite egg = j.next();
			moveRightSide(egg);
			if (egg.getX() < gameScreen.gameStage.getWidth() - 100)
				j.remove();
		}
		timeSinceLastEgg += Gdx.graphics.getDeltaTime();
	}

	private void moveRightSide(Sprite egg) {
		int xMovement = (int) (-velocity.x * Gdx.graphics.getDeltaTime());
		int yMovement = (int) (-velocity.y * Gdx.graphics.getDeltaTime());
		// System.out.println("x "+newEgg.getX() + xMovement+" y "+
		// newEgg.getY() + yMovement);
		egg.setPosition(egg.getX() + xMovement, egg.getY() + yMovement);

	}

	private void moveLeftSide(Sprite egg) {
		int xMovement = (int) (velocity.x * Gdx.graphics.getDeltaTime());
		int yMovement = (int) (-velocity.y * Gdx.graphics.getDeltaTime());
		// System.out.println("x "+newEgg.getX() + xMovement+" y "+
		// newEgg.getY() + yMovement);
		egg.setPosition(egg.getX() + xMovement, egg.getY() + yMovement);
	}

}
