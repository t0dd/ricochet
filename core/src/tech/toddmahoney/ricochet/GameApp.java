package tech.toddmahoney.ricochet;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.Texture;

/**
 * The main game class
 */
public class GameApp extends GameStage {

    private Player blueTank;
	
	@Override
	public void initialize () {

        blueTank = new Player();
        blueTank.setTexture(new Texture("tank_blue.png"));
        blueTank.setPosition(800 / 2 - 64 / 2, 20);
        mainStage.addActor(blueTank);
	}

    public void update(float dt){

    }



}
