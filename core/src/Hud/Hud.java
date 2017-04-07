package Hud;
//Place where we keep stuff like score and lives.Gonna be merged with the lives and score classes 
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.nupogodi.game.GameScreen;

import LivesAndScore.Score;

public class Hud {
GameScreen stage;
private Integer scoreInGame;
private Integer livesInGame;
private Integer levelInGame;
Label score;
Label livesLabel;
Label levelLabel;
Label scoreLabel;

public Hud(SpriteBatch sb, GameScreen gameStage) {
	stage = gameStage;
	scoreInGame = 0;
	livesInGame = 5;
	levelInGame = 1;
//	viewport = new FitViewport(MainScreen., worldHeight);
			
			Table table  = new Table();
			table.top();
			table.setFillParent(true);
			
			livesLabel = new Label(String.format("%03d", livesInGame), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
			scoreLabel = new Label(String.format("%03d", scoreInGame), new Label.LabelStyle(new BitmapFont(), Color.WHITE));
            table.add(scoreLabel).expandX().padTop(10);
            table.add(livesLabel).expandX().padTop(10);
            table.add(levelLabel).expandX().padTop(10);
            table.row();
            
          stage.addActorOnStage(table);


}
}
