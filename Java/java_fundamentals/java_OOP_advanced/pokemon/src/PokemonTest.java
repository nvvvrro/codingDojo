public class PokemonTest {
	public static void main(String[] args) {

		System.out.println("-------------- POKEMONES ---------------\n");
		Pokedex pokedex = new Pokedex();

		Pokemon Charmander = pokedex.createPokemon("Charmander", 100, "fire");
		Pokemon Pikachu = pokedex.createPokemon("Pikachu", 200, "electric");

		Charmander.attackPokemon(Pikachu);
		Pikachu.attackPokemon(Charmander);

		pokedex.add(Charmander);
		pokedex.add(Pikachu);

		System.out.println("\nPOKEMONES CREADOS: " + Pokemon.Count());
		pokedex.listPokemon();
	}

}
