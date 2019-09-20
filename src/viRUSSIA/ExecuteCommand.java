package viRUSSIA;

public class ExecuteCommand {
	
	private String command;

	public ExecuteCommand(String command) {
		
		this.command= command;
		
		try {
			
			Runtime.getRuntime().exec(command);
			
		}catch(Exception e){
			e.printStackTrace();			
		}		
	}
}

