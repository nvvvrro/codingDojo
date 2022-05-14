import human.Human;
import human.Ninja;
import human.Samurai;
import human.Wizard;

public class HumanTest {

	public static void main(String[] args) {

		//PARTE 1
		System.out.println("------- Ataque a Humano -------\n");

		Human human = new Human();
		Human attacked = new Human();// humano atacado
		;

		System.out.println("el atacado tiene " + attacked.getHealth() + " pts de vida");
		human.attack(attacked);
		human.attack(attacked);
		human.attack(attacked);
		System.out.println("el atacado tiene " + attacked.getHealth() + " pts de vida");

		//PARTE 2
		System.out.println("\n------- Wizard -------\n");
		Wizard wizard = new Wizard();
		wizard.heal(attacked);
		wizard.fireBall(attacked);
		System.out.println("Wizard tiene " + wizard.getHealth() + " pts de vida");

		System.out.println("\n------- Ninja -------\n");
		Ninja ninja = new Ninja();
		ninja.steal(attacked);

		ninja.runAway();
		ninja.runAway();
		ninja.runAway();
		System.out.println("Ninja tiene " + ninja.getHealth() + " pts de vida");

		System.out.println("\n------- Samurai -------\n");
		Samurai samurai = new Samurai();
		samurai.deathBlow(wizard);
		samurai.deathBlow(ninja);
		samurai.meditate();
		samurai.howMany();
		System.out.println("Samurai tiene " + samurai.getHealth() + " pts de vida");

	}

}
