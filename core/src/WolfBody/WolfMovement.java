package WolfBody;

import com.badlogic.gdx.Input;
import com.nupogodi.game.*;

public class WolfMovement {
	CreateHands hands = new CreateHands() {
	};
	WolfActor wolfActor = new WolfActor();

	public void wolfMovement(int keycode) {
		hands.addHands();
		wolfActor.createBody();
		switch (keycode) {
		case Input.Keys.LEFT:
			changeVisibilityForWolf(true, false, false, false, true, false);
			break;
		case Input.Keys.UP:
			changeVisibilityForWolf(false, false, true, false, true, false);
			break;
		case Input.Keys.DOWN:
			changeVisibilityForWolf(false, true, false, false, false, true);
			break;
		case Input.Keys.RIGHT:
			changeVisibilityForWolf(false, false, false, true, false, true);
			break;

		default:
			break;
		}

	}

	private void changeVisibilityForWolf(boolean armDownLeft, boolean armDownRight, boolean armUpLeft,
			boolean armUpRight, boolean wolfBodyLeft, boolean wolfBodyRight) {
		hands.armDownLeft(armDownLeft);
		hands.armDownRight(armDownRight);
		hands.armUpLeft(armUpLeft);
		hands.armUpRight(armUpRight);
		wolfActor.wolfBodyLeft(wolfBodyLeft);
		wolfActor.wolfBodyRight(wolfBodyRight);
	}
}
