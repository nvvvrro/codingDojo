package animals;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}

	public int throwSomething() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("-5 <" + getEnergyLevel() + "%> --> lanzando algo");
		return getEnergyLevel();

	}

	public int eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("+10 <" + getEnergyLevel() + "%> --> comiendo bananas *GORILA FELIZ*");
		return getEnergyLevel();
	}

	public int climb() {
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("-10 <" + getEnergyLevel() + "%> --> escalando arbol");
		return getEnergyLevel();
	}
}
