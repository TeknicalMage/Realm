import java.util.Scanner;

public class encounters {
	public encounters() {
		
	}
	
	public static enemies en = new enemies();

		
	public void main() {
		String A;
		String B;
		String C;
		System.out.println("Type A");
		Scanner input = new Scanner(System.in);
		String x =input.nextLine();
		
		if (x.equals("A")) {
			base();
		}else if (x.equals("B")) {
			
		}
	}
	public void base() {
		System.out.println("You wake up in front of an enemy for testing purposes");
		try {
			en.spawn();
		}finally {}		
		
	}
	
	public static void main(String[] args) {
		new encounters();
		
	}
}