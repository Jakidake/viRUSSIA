package viRUSSIA;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Epilepsie extends Frame {
	   
	   Random r = new Random();
	   
	    @Override
	    public void paint(Graphics g) {
	        super.paint(g);
	        g.setColor(new Color(r.nextInt(255), r.nextInt(255), r.nextInt(255)));
	        g.fillRect(0, 0, getWidth(), getHeight());
	        repaint();
	    }
	
}
