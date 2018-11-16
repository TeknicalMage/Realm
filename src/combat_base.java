
public class combat_base {
	
	public static Player pl = new Player();
	public static reader rdr = new reader();
	public encounters e = new encounters();
	public static random r = new random();	
	public static enemy_stats es = new enemy_stats();	
	
	public combat_base() {
	
	}
	//Player and Enemy Rolls 
	private double player_roll = r.raw_roll();
	private double enemy_roll = r.raw_roll();
	//Base balanced combat instance.  Only mod is + dex at the start
	public void flat_instance(){
		System.out.println(player_roll);
		System.out.println(enemy_roll);
		if(player_roll + pl.getDexterity() >= enemy_roll + es.getDexterity()) {
			System.out.println("Player attacks First");
		}else {
			System.out.println("Enemy Attacks First");
		}
	}
	
	public void loop() {
		
		while(pl.getHealth() > 0 || es.getHealth() > 0) {
			
		}
		
		
	}
	
	
	
	
	

}
