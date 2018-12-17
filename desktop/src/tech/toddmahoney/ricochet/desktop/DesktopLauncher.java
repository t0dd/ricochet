package tech.toddmahoney.ricochet.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import tech.toddmahoney.ricochet.GameApp;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "ricochet";
		config.width = 800;
		config.height = 480;
		new LwjglApplication(new GameApp(), config);
	}
}
