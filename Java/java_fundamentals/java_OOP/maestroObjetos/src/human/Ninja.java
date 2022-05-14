package human;

public class Ninja extends Human {

	public Ninja() {
		super();
		setStealth(10);
	}

	public Ninja(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, intelligence, health);
	}

	public int steal(Human enemy) {
		int damage = enemy.getHealth();
		damage -= this.stealth;

		int health = this.getHealth();
		health += this.stealth;

		enemy.setHealth(damage);
		setHealth(health);

		System.out.println("   ROBANDO SALUD(enemy): " + enemy.getHealth() + " pts - de vida a un "
				+ enemy.getClass().getSimpleName());
		System.out.println("   A�ADIENDO SALUD(ninja): " + this.getHealth() + " pts + de vida robada a un "
				+ enemy.getClass().getSimpleName());

		return enemy.getHealth();
	}

	public int runAway() {
		setHealth(getHealth() - 10);
		System.out.println("   CORRIENDO: " + this.getHealth() + " pts - vida por correr");

		return getHealth();
	}

}
