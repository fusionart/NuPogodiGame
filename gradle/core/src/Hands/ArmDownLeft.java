package Hands;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ArmDownLeft extends Actor {

	Texture armDownLeft = new Texture(Gdx.files.internal("WolfArmsDownLeft.png"));
	Boolean isArmVisible = true;

	@Override
	public void draw(Batch batch, float parentAlpha) {
		batch.draw(armDownLeft, 50, 0);
	}
	
	public Boolean getIsArmVisible() {
		return isArmVisible;
	}

	public void setIsArmVisible(Boolean visible) {
		this.isArmVisible = visible;
	}
}
