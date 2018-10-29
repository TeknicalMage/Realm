import java.util.Random;

public class Rolls {
	
	private double value;
	
	public Rolls() {
	}
	
	
	public double roll() {
		Random rnd = new Random();
		value = rnd.nextInt(100) + 1;
		return value;
		}

public static void main(String[] args) {
	new Rolls();

	}

}
