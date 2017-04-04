package Chickens;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.nupogodi.game.GameScreen;

import LivesAndScore.Score;

public class EggsGenerator {
	GameScreen gameScreen = new GameScreen();
	private static final float MINIMUM_TIME_BETWEEN_EGGS = .5f;
	private static final float LEFT_START_X = 40;
	private static final float LEFT_END_X = 150;
	private static final float RIGHT_START_X = 560;
	private static final float RIGHT_END_X = 450;
	private static final float DOWN_START_Y = 150;
	private static final float DOWN_END_Y = 50;
	private static final float UP_START_Y = 270;
	private static final float UP_END_Y = 210;
	private float speed = 0.9f;
	private float elapsed = 0.01f;
	private Texture eggTexture;
	private Egg newEgg;
	private List<Egg> eggList = new ArrayList<Egg>();
	private float timeSinceLastEgg = 0;
	private Random rand = new Random();
	private Score score = new Score(0);

	public EggsGenerator(Texture eggTexture) {
		this.eggTexture = eggTexture;
	}

	public void addEggs() {
		switch (generateRandom()) {
		case 1:
			createEggs(LEFT_START_X, LEFT_END_X, DOWN_START_Y, DOWN_END_Y, eggTexture);
			break;
		case 2:
			createEggs(LEFT_START_X, LEFT_END_X, UP_START_Y, UP_END_Y, eggTexture);
			break;
		case 3:
			createEggs(RIGHT_START_X, RIGHT_END_X, DOWN_START_Y, DOWN_END_Y, eggTexture);
			break;
		case 4:
			createEggs(RIGHT_START_X, RIGHT_END_X, UP_START_Y, UP_END_Y, eggTexture);
			break;

		default:
			break;
		}

	}

	private void createEggs(float startX, float endX, float startY, float endY, Texture eggTexture) {
		if (canCreateEgg()) {
			newEgg = new Egg(startX, endX, startY, endY, eggTexture);
			newEgg.setEggX(startX);
			newEgg.setEggY(startY);
			eggList.add(newEgg);
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

	public void drawEveryEgg(SpriteBatch batch) {
		for (Egg egg : eggList) {
			egg.draw(batch);
		}
	}

	public void update() {
		Iterator<Egg> i = eggList.iterator();
		while (i.hasNext()) {
			Egg egg = i.next();
			moveEggs(egg);
			removeEggs(egg,i);
		}
		timeSinceLastEgg += Gdx.graphics.getDeltaTime();
	}

	private void removeEggs(Egg egg, Iterator<Egg> i) {
		if (egg.getStartX() == LEFT_START_X) {
			if (egg.getEggX() >= egg.getEndX()) {
				score.scoreUpdate();
				i.remove();
			}
		} else {
			if (egg.getEggX() <= egg.getEndX()) {
				score.scoreUpdate();
				i.remove();
			}
		}
		
	}

	private void moveEggs(Egg egg) {
		// System.out.println(egg.getStartX());
		// System.out.println(egg.getEggX() +
		// egg.directionX(egg.getStartX(), egg.getEndX()) * speed * elapsed);
		if (egg.getStartX() == LEFT_START_X) {
			egg.setEggX(egg.getEggX() + egg.directionX(egg.getStartX(), egg.getEndX()) * speed * elapsed);
			egg.setEggY(egg.getEggY() + egg.directionY(egg.getStartY(), egg.getEndY()) * speed * elapsed);
		} else {
			egg.setEggX(egg.getEggX() + egg.directionX(egg.getStartX(), egg.getEndX()) * speed * elapsed);
			egg.setEggY(egg.getEggY() + egg.directionY(egg.getStartY(), egg.getEndY()) * speed * elapsed);
		}

	}

}
