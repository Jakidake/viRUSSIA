package viRUSSIA;

import java.awt.Desktop;
import java.net.URI;

public class Url {
	
	public Url (String url) {
		
		try {
			  Desktop desktop = java.awt.Desktop.getDesktop();
			  URI oURL = new URI(url);
			  desktop.browse(oURL);
			} catch (Exception e) {
			}
		
	}
		
	
}
