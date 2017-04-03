package Chickens;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.nupogodi.game.GameScreen;

public class EggsNewTest {
	GameScreen gameScreen = new GameScreen();
	private static final float MINIMUM_TIME_BETWEEN_EGGS = .7f;
	private static final float LEFT_START_X = 50;
	private static final float LEFT_END_X = 350;
	private static final float RIGHT_START_X = 0;
	private static final float RIGHT_END_X = 0;
	private static final float DOWN_START_Y = 350;
	private static final float DOWN_END_Y = 50;
	private static final float UP_START_Y = 0;
	private static final float UP_DOWN_Y = 0;
	private float speed = 0.5f;
	private float elapsed = 0.01f;
	private Texture eggTexture;
	private SingleEgg newEgg;
	private List<SingleEgg> eggList = new ArrayList<SingleEgg>();
	private float timeSinceLastEgg = 0;
	private Random rand = new Random();

	public EggsNewTest(Texture eggTexture) {
		this.eggTexture = eggTexture;
	}

	public void addEggs() {
		switch (generateRandom()) {
		case 1:
			createEggs(LEFT_START_X, LEFT_END_X, DOWN_START_Y, DOWN_END_Y, eggTexture);
			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;

		default:
			break;
		}

	}

	private void createEggs(float startX, float endX, float startY, float endY, Texture eggTexture) {
		if (canCreateEgg()) {
			newEgg = new SingleEgg(startX, endX, startY, endY, eggTexture);
			newEgg.setEggX(startX);
			newEgg.setEggY(startY);
			eggList.add(newEgg);
			timeSinceLastEgg = 0;
		}

	}

	private int generateRandom() {
		int n = rand.nextInt(1) + 1;
		return n;
	}

	private boolean canCreateEgg() {
		return timeSinceLastEgg > MINIMUM_TIME_BETWEEN_EGGS;
	}

	public void drawEveryEgg(SpriteBatch batch) {
		for (SingleEgg egg : eggList) {
			egg.draw(batch);
		}
	}

	public void update() {
		Iterator<SingleEgg> i = eggList.iterator();
		while (i.hasNext()) {
			SingleEgg egg = i.next();
			moveLeftSide(egg);
			// if (egg.getX() > 100){
			// i.remove();
		}
		timeSinceLastEgg += Gdx.graphics.getDeltaTime();
	}

	private void moveLeftSide(SingleEgg egg) {
		System.out.println(egg.getStartX());
		System.out.println(egg.getEggX() + " "+egg.directionX(egg.getStartX(), egg.getEndX()) * speed * elapsed);
		egg.setEggX(egg.getEggX()+egg.directionX(egg.getStartX(), egg.getEndX()) * speed * elapsed);
		egg.setEggY(egg.getEggY()+egg.directionY(egg.getStartY(), egg.getEndY()) * speed * elapsed);

	}

}
