package human;

public class Human {
	int strength, stealth, intelligence, health;

	public Human() {
		super();
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
		this.health = 100;
	}

	public Human(int strength, int stealth, int intelligence, int health) {
		super();
		this.strength = strength;
		this.stealth = stealth;
		this.intelligence = intelligence;
		this.health = health;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStealth() {
		return stealth;
	}

	public void setStealth(int stealth) {
		this.stealth = stealth;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	@Override
	public String toString() {
		return "Human [Strength()=" + getStrength() + ", Stealth()=" + getStealth() + ", Intelligence()="
				+ getIntelligence() + ", Health()=" + getHealth() + "]";
	}

	public Human attack(Human enemy) {
		int damage = enemy.getHealth();
		damage -= getStrength();

		enemy.setHealth(damage);
		System.out.println("   " + enemy.getHealth() + "% ~ ataque a un " + enemy.getClass().getSimpleName());

		return this;
	}

}
