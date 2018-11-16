
public class Driver {
	public static intro start = new intro();

	//Just the Driver to Run the Game
	public Driver() {
		main();
	}
	
	public void main() {
		//Intro (Basically the actual driver) (mfw when I call main twice)
		intro();
	
	}
	
	private void intro() {
		start.main();
		
	}

	public static void main(String[] args) {
		new Driver();

	}
}
