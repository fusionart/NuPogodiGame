package Chickens;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class Egg extends Actor {

	private float startX;
	private float endX;
	private float startY;
	private float endY;
	private float eggX;
	private float eggY;
	private Texture eggTexture;

	public Egg(float startX, float endX, float startY, float endY, Texture eggTexture) {
		setStartX(startX);
		setEndX(endX);
		setStartY(startY);
		setEndY(endY);
		this.eggTexture = eggTexture;
	}

	public float getStartX() {
		return startX;
	}

	public void setStartX(float startX) {
		this.startX = startX;
	}

	public float getEndX() {
		return endX;
	}

	public void setEndX(float endX) {
		this.endX = endX;
	}

	public float getStartY() {
		return startY;
	}

	public void setStartY(float startY) {
		this.startY = startY;
	}

	public float getEndY() {
		return endY;
	}

	public void setEndY(float endY) {
		this.endY = endY;
	}

	public float distance(float startX, float endX, float startY, float endY) {
		float distance = (float) Math.sqrt(Math.pow(endX - startX, 2) + Math.pow(endY - startY, 2));
		return distance;
	}

	public float directionX(float startX, float endX) {
		float directionX = endX - startX;
		return directionX;
	}

	public float directionY(float startY, float endY) {
		float directionY = endY - startY;
		return directionY;
	}

	public void draw(Batch batch) {
		batch.draw(eggTexture, eggX, eggY);
	}

	public float getEggX() {
		return eggX;
	}

	public void setEggX(float eggX) {
		this.eggX = eggX;
	}

	public float getEggY() {
		return eggY;
	}

	public void setEggY(float eggY) {
		this.eggY = eggY;
	}

}
