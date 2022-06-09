import java.util.ArrayList;
import java.util.List;

public class Pokedex extends AbstractPokemon {
	private List<Pokemon> myPokemons = new ArrayList<Pokemon>();

	public void add(Pokemon pokemon) {
		myPokemons.add(pokemon);
	}

	public void listPokemon() {
		System.out.println("\n--------------- Lista de pokemones ------------");
		for (Pokemon pokemon : myPokemons) {
			System.out.println(pokemonInfo(pokemon));
		}
	}

}
