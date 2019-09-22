package viRUSSIA;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RussiaFrame extends Frame{
	Color c = new Color(180,0,0);
	BufferedImage img;

	public RussiaFrame() {
		super();
		try {
			img = ImageIO.read(getClass().getResourceAsStream("hs.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	int getW(){
		double d = (double)this.getHeight()/1992.0*1732.0;
		return (int) d;
	}
	
	@Override
	public void paint(Graphics g){
		super.paint(g);
		g.setColor(c);
		g.fillRect(0, 0, getWidth(), getHeight());
		Graphics2D g2 = (Graphics2D) g;
		g.drawImage(img, this.getWidth()/2-getW()/2, 0, getW(), this.getHeight(), null);
		
	}
	
}
