package tech.toddmahoney.ricochet;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.scenes.scene2d.Stage;

/**
 * Simplifies/better organizes the game loop
 */
public abstract class GameStage extends Game {

    protected Stage mainStage;

    public void create(){
        mainStage = new Stage();
        initialize();
    }

    public abstract void initialize();

    // Gameloop stages:
    // (1) process input
    // (2) update state of game world
    // (3) render the graphics

    public void render()
    {
        float dt = Gdx.graphics.getDeltaTime();

        // act method
        mainStage.act(dt);

        // defined by user
        update(dt);

        // clear the screen
        Gdx.gl.glClearColor(255/255f, 229/255f, 204/255f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        //camera.update();


        // draw the graphics
        mainStage.draw();
    }

    public abstract void update(float dt);

}
