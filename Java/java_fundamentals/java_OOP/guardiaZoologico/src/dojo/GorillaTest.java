import animals.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {

		System.out.println("-------- ENEGIA DE GORILA -------\n");
		Gorilla gorilla = new Gorilla();
		gorilla.displayEnergy();
		
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		
		gorilla.eatBananas();
		gorilla.eatBananas();
		
		gorilla.climb();
		gorilla.displayEnergy();

	}
}
