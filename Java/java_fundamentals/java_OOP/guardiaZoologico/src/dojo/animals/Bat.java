package animals;

public class Bat extends Mammal {

	public Bat() {
		super();
		setEnergyLevel(300);
	}

	public int fly() {
		setEnergyLevel(getEnergyLevel() - 50);
		System.out.println("-50 <" + getEnergyLevel() + "> hoooohoo (volando)");
		return getEnergyLevel();
	}

	public int eatHumans() {
		setEnergyLevel(getEnergyLevel() + 25);
		System.out.println("+25 <" + getEnergyLevel() + "> bueno no importa (comiendo humanos)");
		return getEnergyLevel();
	}

	public int attackTown() {
		setEnergyLevel(getEnergyLevel() - 100);
		System.out.println("-100 <" + getEnergyLevel() + "> buum craak bum (atacando ciudad)");
		return getEnergyLevel();
	}

}
