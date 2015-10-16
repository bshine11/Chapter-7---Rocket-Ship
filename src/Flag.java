import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Flag {
	public static void drawPole(Graphics g) {
		g.setColor(Color.DARK_GRAY);
		g.fillRect(550, 300, 15, 250);
	}

	public static void drawFlag(Graphics g) {
		int y = 0;
		for (int j = 0; j <= 7; j++) {
			g.setColor(Color.red);
			g.fillRect(565, 300 + y, 175, 10); // red stripes
			y += 20;
		}
		int y1 = 0;
		for (int l = 0; l <= 6; l++) {
			g.setColor(Color.white);
			g.fillRect(565, 310 + y1, 175, 10); // white stripes
			y1 += 20;
		}
		g.setColor(Color.blue);
		g.fillRect(565, 300, 75, 75);
		g.setColor(Color.white);
		Polygon flag = new Polygon(); // flag's star
		flag.addPoint(600, 310);
		flag.addPoint(595, 325);
		flag.addPoint(580, 325);
		flag.addPoint(590, 340);
		flag.addPoint(590, 355);
		flag.addPoint(600, 345);// half way
		flag.addPoint(610, 355);
		flag.addPoint(610, 340);
		flag.addPoint(620, 325);
		flag.addPoint(605, 325);
		g.fillPolygon(flag);
	}
}
