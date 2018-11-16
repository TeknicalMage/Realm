
public class enemies {
	
	public static random r = new random();	
	public static enemy_stats es = new enemy_stats();
	
	public double l = 40.0;
		
	public enemies() {

	}
	
	public void main() {
		
	}
	
	public void spawn() {
		r.roll();
		es.setStrength(r.getValue());
		//System.out.println(es.getStrength());
		
		r.roll();
		es.setDexterity(r.getValue());
		//System.out.println(es.getDexterity());
		
		r.roll();
		es.setIntelligence(r.getValue());		
		es.setHealth(l + (2 * es.getStrength()));
		
		System.out.println("Enemy Spawned");
		enemy_check();
	}
	//Display of Enemy Information
	public void enemy_check() {
		System.out.print("Str is " + es.getStrength() + "\n" + "Dex is " + es.getDexterity() + "\n" );
		System.out.print("Int is " + es.getIntelligence() + "\n" + "Damage is " + es.getDamage() + "\n");
		System.out.print("Health is " + es.getHealth() + "\n" );
	}
	
	
	
	
	
	public static void main(String[] args) {
		new enemies();

	}

}
