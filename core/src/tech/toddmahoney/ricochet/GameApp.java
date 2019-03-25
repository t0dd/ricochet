package tech.toddmahoney.ricochet;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class GameApp extends ApplicationAdapter {
    private Texture redTankImage;
    private Texture blueTankImage;
    private Sound cannonSound;
    private Sound ricochetSound;
    private OrthographicCamera camera;
    private SpriteBatch batch;
    private Rectangle blueTank;
	
	@Override
	public void create () {

        //load the images
		blueTankImage = new Texture(Gdx.files.internal("tank_blue.png"));
		redTankImage = new Texture(Gdx.files.internal("tank_red.png"));
        // load the sounds
        cannonSound = Gdx.audio.newSound(Gdx.files.internal("cannon.mp3"));
        cannonSound = Gdx.audio.newSound(Gdx.files.internal("rico.mp3"));
        //load the camera
        camera = new OrthographicCamera();
        camera.setToOrtho(false, 800, 480);
        //load the spritebatch
        batch = new SpriteBatch();
        //starting position
		blueTank = new Rectangle();
		blueTank.x = 800 / 2 - 64 / 2;
		blueTank.y = 20;
		blueTank.width = 64;
		blueTank.height = 64;
	}

	@Override
	public void render () {
        Gdx.gl.glClearColor(255/255f, 229/255f, 204/255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        camera.update();
        //render
        batch.setProjectionMatrix(camera.combined);
        batch.begin();
        batch.draw(blueTankImage, blueTank.x, blueTank.y);
        batch.end();
        //move the tank
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT)) blueTank.x -= 200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT)) blueTank.x += 200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.UP)) blueTank.y -= -200 * Gdx.graphics.getDeltaTime();
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN)) blueTank.y -= 200 * Gdx.graphics.getDeltaTime();
        //screen limits
        if(blueTank.x < 0) blueTank.x = 0;
        if(blueTank.x > 800 - 64) blueTank.x = 800 - 64;
        if(blueTank.y < 0) blueTank.y = 0;
        if(blueTank.y > 800 - 64) blueTank.y = 800 - 64;
	}
	
	@Override
	public void dispose () {

	}
}
