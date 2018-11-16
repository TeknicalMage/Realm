//Enemy Attack Information
public class enemy_actions {
	
	public static Player pl = new Player();
	public static reader rdr = new reader();
	public encounters e = new encounters();
	public static random r = new random();	
	public static enemy_stats es = new enemy_stats();
	
	
	public enemy_actions() {
		
	}
	
	public void determine_state() {
		r.raw_roll();
		if(r.getValue() <= 50) {
			agressive();
		}else {
			passive();
		}
				
			}
	
	public void agressive () {
		attack();		
		for(int i=1; i<0; i++)     
		{  
			if(i % 2 ==0) {
				attack();
			}else {
				passive();
			}
				
		}
	}
				
	
	public void passive() {
		
	}
	
	public void attack() {
		pl.setHealth(es.getDamage() - pl.getHealth());
		System.out.println("(Enemy Name)" + " Attacked for" + es.getDamage());
		System.out.println("You now have " + pl.getHealth() +"Health");
	}
	
	
	
	
	
}
