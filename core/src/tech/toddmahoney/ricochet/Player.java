package tech.toddmahoney.ricochet;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

public class Player extends ActorRicochet {

    public Player(){
        super();
    }

    public void act(float dt){
        super.act(dt);
        //move the tank
        if(Gdx.input.isKeyPressed(Input.Keys.LEFT))
            this.moveBy(-2, 0);
        if(Gdx.input.isKeyPressed(Input.Keys.RIGHT))
            this.moveBy(2, 0);
        if(Gdx.input.isKeyPressed(Input.Keys.UP))
            this.moveBy(0, 2);
        if(Gdx.input.isKeyPressed(Input.Keys.DOWN))
            this.moveBy(0, -2);

    }
}
