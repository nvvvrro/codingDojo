import human.Human;

public class HumanTest {

	public static void main(String[] args) {

		System.out.println("------- Ataque a Humano -------\n");

		Human human = new Human();
		Human attacked = new Human();// humano atacado
		;
	
		  System.out.println("el atacado tiene " + attacked.getHealth() + "% de vida");
		  human.attack(attacked); human.attack(attacked); human.attack(attacked);
		  System.out.println("el atacado tiene " + attacked.getHealth() + "% de vida");

	}

}
