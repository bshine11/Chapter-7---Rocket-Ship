import java.awt.Color;
import java.awt.Graphics;

public class Moon {
	public static void drawBody(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillArc(-100, 500, 1000, 600, 180, -180);
		g.setColor(Color.white);
		g.fillRect(0, 600, 1000, 1000);
	}
}
