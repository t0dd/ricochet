package tech.toddmahoney.ricochet;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class GameApp extends ApplicationAdapter {
    private Texture redTankImage;
    private Texture blueTankImage;
    private Sound cannonSound;
    private Sound ricochetSound;
	
	@Override
	public void create () {

        //load the images
		redTankImage = new Texture(Gdx.files.internal("blue_tank.png"));
		blueTankImage = new Texture(Gdx.files.internal("red_tank.png"));
        // load the sounds
        cannonSound = Gdx.audio.newSound(Gdx.files.internal("cannon.mp3"));
        cannonSound = Gdx.audio.newSound(Gdx.files.internal("rico.mp3"));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}
	
	@Override
	public void dispose () {

	}
}
