package animals;

public class Mammal {
	private int energyLevel;

	public Mammal() {
		super();
		this.energyLevel = 100;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	@Override
	public String toString() {
		return "Mammal [getEnergyLevel()=" + getEnergyLevel() + "]";
	}

	public int displayEnergy() {
		System.out.println("NIVEL DE ENERGIA: " + this.energyLevel + "%");
		return this.energyLevel;
	}

}
