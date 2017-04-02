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
	private List<Sprite> eggsList = new ArrayList<Sprite>();
	private float timeSinceLastEgg = 0;
	private Random rand = new Random();

	public Eggs(Texture eggTexture) {
		this.eggTexture = eggTexture;
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
			newEgg.setPosition(gameScreen.gameStage.getWidth()-OFFSET_POSSITION, DOWN_POSSITION);
			this.setVelocity(new Vector2(-VELOCITY_X, -VELOCITY_Y));
			eggsList.add(newEgg);
			timeSinceLastEgg = 0;
		}
		
	}

	private void addEggDownRight() {
		if (canCreateEgg()) {
			newEgg = new Sprite(eggTexture);
			newEgg.setPosition(gameScreen.gameStage.getWidth()-OFFSET_POSSITION, DOWN_POSSITION);
			this.setVelocity(new Vector2(-VELOCITY_X, -VELOCITY_Y));
			eggsList.add(newEgg);
			timeSinceLastEgg = 0;
		}
		
	}

	private void addEggUpLeft() {
		if (canCreateEgg()) {
			newEgg = new Sprite(eggTexture);
			newEgg.setPosition(OFFSET_POSSITION, UP_POSSITION);
			this.setVelocity(new Vector2(VELOCITY_X, VELOCITY_Y));
			eggsList.add(newEgg);
			timeSinceLastEgg = 0;
		}
		
	}

	private void addEggDownLeft() {
		if (canCreateEgg()) {
			newEgg = new Sprite(eggTexture);
			newEgg.setPosition(OFFSET_POSSITION, DOWN_POSSITION);
			this.setVelocity(new Vector2(VELOCITY_X, VELOCITY_Y));
			eggsList.add(newEgg);
			timeSinceLastEgg = 0;
		}
		
	}

	private int generateRandom() {
		int n = rand.nextInt(4)+1;
		return n;
	}

	private boolean canCreateEgg() {
		return timeSinceLastEgg > MINIMUM_TIME_BETWEEN_EGGS;
	}

	public void setVelocity(Vector2 velocity) {
		this.velocity = velocity;
	}

	public void drawEveryEgg(SpriteBatch batch) {
		for (Sprite egg : eggsList) {
			egg.draw(batch);
		}

	}

	public void update() {
		System.out.println("Eggggs "+eggsList.size());
		Iterator<Sprite> i = eggsList.iterator();
		while (i.hasNext()) {
			Sprite egg = i.next();
			move(egg);
			if (egg.getY() > 400)
				i.remove();
		}
		timeSinceLastEgg += Gdx.graphics.getDeltaTime();
	}

	private void move(Sprite egg) {
		int xMovement = (int) (velocity.x * Gdx.graphics.getDeltaTime());
		int yMovement = (int) (velocity.y * Gdx.graphics.getDeltaTime());
		//System.out.println("x "+newEgg.getX() + xMovement+" y "+ newEgg.getY() + yMovement);
		egg.setPosition(egg.getX() + xMovement, egg.getY() + yMovement);
	}

}
