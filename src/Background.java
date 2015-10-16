import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Background {
	public static void drawSky(Graphics g) {
		g.setColor(Color.black);
		g.fillRect(0, 0, 800, 600);
	}

	public static void drawStars(Graphics g) {
		g.setColor(Color.yellow);
		for (int k = 0; k <= 30; k++) {
			int x = (int) (Math.random() * 800); // x coord
			int y = (int) (Math.random() * 600); // y coord

			Polygon star = new Polygon(); // random stars
			star.addPoint(x, y);
			star.addPoint((x - 5), (y - 12));
			star.addPoint((x + 12), (y - 5));
			star.addPoint((x - 12), (y - 5));
			star.addPoint((x + 5), (y - 12));
			g.fillPolygon(star);
		}
	}

	public static void drawPlanet(Graphics g) {
		g.setColor(Color.MAGENTA);
		g.fillOval(650, 30, 120, 120);
	}
}