
public class enemy_actions {
	
	public static Player pl = new Player();
	public static reader rdr = new reader();
	public encounters e = new encounters();
	public static random r = new random();	
	public static enemy_stats es = new enemy_stats();
	
	
	public enemy_actions() {
		
	}
	
	public void determine_state() {
		if(pl.getDamage() <= (es.getDamage())){
			//agro();
			}
			
		}
	
	public void agressive () {
		
	}
	
	public void passive() {
		
	}
	
}
