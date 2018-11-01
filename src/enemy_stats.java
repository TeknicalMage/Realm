
public class enemy_stats {
	
	//Stats
	private double health, Strength, Dexterity, Intelligence;
	private double damage = .1;
	private double dodge = 1;
	
//Getters and Setters for Attributes(Stats)
	
	public double getHealth() {
		return health;
	}
	public void setHealth(double health) {
		this.health = health;
	}
	public double getStrength() {
		return Strength;
	}
	public void setStrength(double strength) {
		Strength = strength;
	}
	public double getDexterity() {
		return Dexterity;
	}
	public void setDexterity(double dexterity) {
		Dexterity = dexterity;
	}
	public double getIntelligence() {
		return Intelligence;
	}
	public void setIntelligence(double intelligence) {
		Intelligence = intelligence;
	}
	public void setDamage(double damage) {
		this.damage = damage;
	}
	public double getDamage() {
		return damage;
	}
	public void setDodge(double dodge) {
		this.dodge = dodge;
	}
	public double getdodge() {
		return dodge;
	}
	
	public enemy_stats() {	
	}

}
