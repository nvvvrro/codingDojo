import animals.Bat;

public class BatTest {

	public static void main(String[] args) {
		System.out.println("-------- ENEGIA DE MURCIELAGO -------\n");
		Bat bat = new Bat();
		bat.displayEnergy();
		
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		
		bat.eatHumans();
		bat.eatHumans();
		
		bat.fly();
		bat.fly();
		bat.displayEnergy();
	}

}
