import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class Rocket {
	public static void drawTop(Graphics g) {
		g.setColor(Color.red);
		Polygon top = new Polygon(); // top of rocket
		top.addPoint(200, 10);
		top.addPoint(100, 100);
		top.addPoint(300, 100);
		g.fillPolygon(top);
	}

	public static void drawBody(Graphics g) {
		g.setColor(Color.white);
		g.fillRect(100, 100, 200, 400); // body of rocket
		g.setColor(Color.gray);
		g.fillRect(150, 500, 100, 35); // bottom piece of rocket
		g.setColor(Color.black);
		g.drawRect(150, 500, 100, 35); // outline
	}

	public static void drawWings(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(195, 400, 13, 175); // middle wing
		g.fillRect(100, 400, -25, 13); // left wing
		g.fillRect(85, 400, -13, 185); // left wing
		g.fillRect(300, 400, 25, 13); // right wing
		g.fillRect(315, 400, 13, 185); // right wing
	}

	public static void drawWindow(Graphics g) {
		g.setColor(Color.DARK_GRAY); //outside window
		g.fillOval(125, 125, 150, 150);
		g.setColor(Color.LIGHT_GRAY); //inside window
		g.fillOval(135, 135, 130, 130);
	}
}
