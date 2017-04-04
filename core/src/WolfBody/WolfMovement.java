package WolfBody;

import com.badlogic.gdx.Input;
import com.nupogodi.game.*;

public class WolfMovement {
	CreateHands hands = new CreateHands(){};
	WolfActor wolfActor = new WolfActor();
	public void wolfMovement(int keycode){
		hands.addHands();
		wolfActor.createBody();
		switch (keycode) {
		case Input.Keys.LEFT:
			hands.armDownLeft(true);
			hands.armDownRight(false);
			hands.armUpLeft(false);
			hands.armUpRight(false);
			wolfActor.wolfBodyLeft(true);
			wolfActor.wolfBodyRight(false);
			break;
		case Input.Keys.UP:
			hands.armDownLeft(false);
			hands.armDownRight(false);
			hands.armUpLeft(true);
			hands.armUpRight(false);
			wolfActor.wolfBodyLeft(true);
			wolfActor.wolfBodyRight(false);
			break;
		case Input.Keys.DOWN:
			hands.armDownLeft(false);
			hands.armDownRight(true);
			hands.armUpLeft(false);
			hands.armUpRight(false);
			wolfActor.wolfBodyLeft(false);
			wolfActor.wolfBodyRight(true);
			break;
		case Input.Keys.RIGHT:
			hands.armDownLeft(false);
			hands.armDownRight(false);
			hands.armUpLeft(false);
			hands.armUpRight(true);
			wolfActor.wolfBodyLeft(false);
			wolfActor.wolfBodyRight(true);
			break;

		default:
			break;
		}
		
	}
}
