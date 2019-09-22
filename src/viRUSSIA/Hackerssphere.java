package viRUSSIA;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.util.Random;

public class Hackerssphere extends Frame {
	
	
	@Override
	public void paint(Graphics g) {
		
		Random r = new Random();
		
		super.paint(g);
		
		Font font = new Font("Consolas",Font.PLAIN ,15);	
		g.setFont(font);
		
		
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());		
		g.setColor(Color.WHITE);
		
		g.drawString("1",r.nextInt(getWidth()), 10);
		
		
		
		
		
	}
	
}
