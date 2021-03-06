/**
 * @author DRTN
 * Team Website with download:
 * https://nicopinedo.github.io/SEPR4/
 *
 * This Class contains either modifications or is entirely new in Assessment 4
 **/

package duckrelatedteamname.desktop;

import com.badlogic.gdx.Files;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import drtn.game.Main;

/**
 * URL for executable: https://teamfractal.github.io/assessment3/Game.jar
 */
public class DesktopLauncher {
	/**
	 * Creates a new window with the specified title, size and behaviour parameters before assigning a fresh
	 * game-state to it, which is managed by the Main() class and all classes recursively spawned by it
	 */
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();

		//GAME CONFIG
		config.title = "Duck-Related Game";
		config.addIcon("icon.png", Files.FileType.Internal);
		config.backgroundFPS = 1;
		config.vSyncEnabled = true;
		config.width = 1024;
		config.height = 512;
		config.resizable = false;

		new LwjglApplication(new Main(), config);
	}
}
