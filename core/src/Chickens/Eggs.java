package Chickens;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.nupogodi.game.GameScreen;

public class Eggs {
	GameScreen gameScreen = new GameScreen();
	private static final float MINIMUM_TIME_BETWEEN_EGGS = .5f;
	private Texture eggTexture;
	private Sprite newEgg;
	private Vector2 velocity = new Vector2();
	private List<Sprite> eggsList = new ArrayList<Sprite>();
	private float timeSinceLastEgg = 0;

	public Eggs(Texture eggTexture) {
		this.eggTexture = eggTexture;
	}

	public void addEggs(int eggLocation) {
		if (canCreateEgg()) {
			newEgg = new Sprite(eggTexture);
			newEgg.setPosition(eggLocation, eggLocation);
			this.setVelocity(new Vector2(5, 200));
			eggsList.add(newEgg);
			timeSinceLastEgg = 0;
		}
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
			Sprite eggs = i.next();
			move();
			if (getY() > 250)
				i.remove();
		}
		timeSinceLastEgg += Gdx.graphics.getDeltaTime();
	}

	public int getX() {
		return (int) newEgg.getX();
	}

	public int getY() {
		return (int) newEgg.getY();
	}

	public void move() {
		int xMovement = (int) (velocity.x * Gdx.graphics.getDeltaTime());
		int yMovement = (int) (velocity.y * Gdx.graphics.getDeltaTime());
		newEgg.setPosition(newEgg.getX() + xMovement, newEgg.getY() + yMovement);
	}

}
