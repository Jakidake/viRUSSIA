package viRUSSIA;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;



public class Frame extends JFrame{
	public Frame(){
		BufferedImage cursorImg = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);

		this.setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
			    cursorImg, new Point(0, 0), "blank cursor") );

		this.setUndecorated(true);
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		this.setTitle("");
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setVisible(true);
		this.setAlwaysOnTop(true);
	
		{
			
			this.addKeyListener(new KeyListener(){

				@Override
				public void keyPressed(KeyEvent arg0) {

					if(arg0.getKeyCode() == KeyEvent.VK_ESCAPE){
						dispose();
					}else if(arg0.getKeyCode() == KeyEvent.VK_SPACE){
						
					}
				}

				@Override
				public void keyReleased(KeyEvent arg0) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyTyped(KeyEvent arg0) {
					
				}
				
			});
		}

	}
	
	public void closeFrame(){
		this.dispose();
	}
	

}
