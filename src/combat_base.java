
public class combat_base {
	
	public static Player pl = new Player();
	public static reader rdr = new reader();
	public encounters e = new encounters();
	public static random r = new random();	
	public static enemy_stats es = new enemy_stats();	
	
	public combat_base() {
		
	}
	
	public void instance(){
		r.raw_roll();
		if(r.getValue() <= 50) {
			//Player First
		}else {
			//Enemy First
		}
	}
	
	

}
