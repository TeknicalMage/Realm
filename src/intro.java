import java.util.Scanner;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class intro { 
	public intro() {
		
	}
	public double i = 0;
	public double j = 0;
	public double k = 0;
	public double l = 30;
	public double SMax = 10;
	
	public static Player stats = new Player();
	public static reader rdr = new reader();
	public static enemies en = new enemies();
	public static event_tree et = new event_tree();
	//Options for playing	
	public void main() {
		String A;
		String B;
		String C;
		//Character Creation + Game
		System.out.println("Type A to Start a new game");
		//Pulling stats from a file + game
		System.out.println("Type B to continue a game");
		//Various setup for testing of game features
		System.out.println("Type C to enter Test Zone");
		Scanner input = new Scanner(System.in);
		String x =input.nextLine();
		
		if (x.equals("A")) {
			new_game();
			System.out.println("Character Setup Complete");
		}else if (x.equals("B")) {
			rdr.main();
		}else if (x.equals("C")) {
			System.out.println("Base Event Trigger");
			en.spawn();
			et.frst.instance();
				

			}
		}
	//New Game stat setup 
	public void new_game() {
		System.out.println("You need to distribute " + SMax + " points among Int, Str, and Dex");
		strength_setup();
		dexterity_setup();
		intelligence_setup();
		stats.setHealth(l + (2 * stats.getStrength()));
		System.out.println(stats.getStrength()+" Str\n"+ stats.getDexterity()+" Dex\n"+ stats.getIntelligence()+" Int");
		System.out.println(stats.getHealth());
		
	}
	public void strength_setup() {
		Scanner input = new Scanner(System.in);
		double i = input.nextDouble();
		if(i <= SMax) {
			SMax = SMax - i;
			System.out.println(i);
			System.out.print("You have " + SMax + " Points Left");
			stats.setStrength(i);
		}else {
			System.out.println("You allocated your points incorrectly.");
			System.out.println("Try again Please.");
			i = 0;
			strength_setup();
		}
	}
	public void dexterity_setup() {
		Scanner input = new Scanner(System.in);
		double j = input.nextDouble();
		if(j <= SMax) {
			SMax = SMax - j;
			System.out.println("You have " + SMax + " Points Left");
			stats.setDexterity(j);
		}else {
			System.out.println("You allocated your points incorrectly.");
			System.out.println("Try again Please.");
			j = 0;
			dexterity_setup();
		}
	}
	
	public void intelligence_setup() {	
		Scanner input = new Scanner(System.in);
		double k = input.nextDouble();
		if(k <= SMax) {
			SMax = SMax - k;
			System.out.println("You have " + SMax + " Points Left");
			stats.setIntelligence(k);
		}else {
			System.out.println("You allocated your points incorrectly.");
			System.out.println("Try again Please.");
			intelligence_setup();
			
		}
	}

	public static void main(String[] args) {
		new intro();
	}
}
