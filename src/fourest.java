//TESTING SCENARIO 
import java.util.Scanner;

public class fourest {
	
	public static combat_base cmb = new combat_base();
	
	public fourest() {
		
	}
	
	public static void instance() {
		introA();
		System.out.println("What do you do?");
		Scanner input = new Scanner(System.in);
		String x =input.nextLine();
		if(x.equals("A")) {
			System.out.println("You come across an enemy");
			cmb.flat_instance();
		}else if(x.equals("C")) {
				
		}else if(x.equals("D")) {
			
		}else {
			System.out.println();
			System.out.println("Input not recognized try again");
			System.out.println();
		}
		
	}
	
	public static void introA() {
		System.out.println("A baseline description is given with three optional paths");
	}
	

	public static void main(String[] args) {
		new fourest();

	}

}
