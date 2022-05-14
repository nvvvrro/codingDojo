package human;

public class Wizard extends Human {

	public Wizard() {
		super();
		setHealth(50);
		setIntelligence(8);
	}

	public Wizard(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, intelligence, health);
	}

	public int heal(Human otherHuman) {
		int heal = otherHuman.getHealth();
		heal += this.getIntelligence();
		otherHuman.setHealth(heal);

		System.out.println("   CURANDO: " + otherHuman.getHealth() + " pts + de vida a un "
				+ otherHuman.getClass().getSimpleName());

		return otherHuman.getHealth();
	}

	public int fireBall(Human enemy) {
		int health = enemy.getHealth();
		health -= this.getIntelligence() * 3;
		enemy.setHealth(health);

		System.out.println(
				"   FIREBALL(DA�O): " + enemy.getHealth() + " pts - de vida a un " + enemy.getClass().getSimpleName());

		return enemy.getHealth();
	}

}
