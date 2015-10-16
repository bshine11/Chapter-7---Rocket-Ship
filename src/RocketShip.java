/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 10-15-15             
 * Creating Class Methods            *
 *                                   *
 ************************************/
import java.awt.*;
import java.applet.*;

public class RocketShip extends Applet {
	public void init() {
		setSize(800, 600);
	}

	public void paint(Graphics g) {
		Background.drawSky(g);
		Background.drawStars(g);
		Background.drawPlanet(g);
		Moon.drawBody(g);
		Flag.drawPole(g);
		Flag.drawFlag(g);
		Rocket.drawTop(g);
		Rocket.drawBody(g);
		Rocket.drawWings(g);
		Rocket.drawWindow(g);

	}

}
