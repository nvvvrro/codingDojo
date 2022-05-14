package human;

public class Samurai extends Human {
	public static int COUNT = 0;

	public Samurai() {
		super();
		setHealth(200);
		COUNT++;
	}

	public Samurai(int strength, int stealth, int intelligence, int health) {
		super(strength, stealth, intelligence, health);
	}

	public int deathBlow(Human enemy) {
		int health = this.getHealth();
		health /= 2;

		setHealth(health);
		enemy.setHealth(0);

		System.out.println("   ANIQUILANDO(enemy): " + enemy.getHealth() + " pts - " + enemy.getClass().getSimpleName()
				+ " aniquilado");
		System.out.println("   SALUD: " + this.getHealth() + " pts - de vida del Samurai");

		return enemy.getHealth();
	}

	public int meditate() {
		int heal = this.getHealth();
		heal += this.getHealth() / 2;
		setHealth(heal);

		System.out.println("   MEDITANDO: " + this.getHealth() + "pts + vida del Samurai *ammm ammm*");

		return getHealth();
	}

	public int howMany() {
		System.out.println("   EXISTEN: " + COUNT + " Samurais");

		return COUNT;
	}

}
