
public class Driver {
	public static intro start = new intro();

	
	public Driver() {
		main();
	}
	
	public void main() {
		intro();
	
	}
	
	private void intro() {
		start.main();
		
	}

	public static void main(String[] args) {
		new Driver();

	}
}
