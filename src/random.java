import java.util.Random; 
public class random {
	
	private double value;
	
	public random(){
		value = 0;
	}
	
	public double getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	//Straight up Random Roll
	public double roll() {
		Random rnd = new Random();
		value = (rnd.nextInt(100) + 1)/10.0;
		return value;
	}
	
	public double raw_roll() {
		Random rnd = new Random();
		value = (rnd.nextInt(100) + 1);
		return value;
	}
	
	
	
	

	public static void main(String[] args) {
		new random();
	}
}
 