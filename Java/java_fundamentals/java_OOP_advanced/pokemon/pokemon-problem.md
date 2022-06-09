# Pokemon

En esta actividad, crearemos una Pokedex que nos dé información acerca de los Pokemon.

### Objetivos

- Practicar con variables y métodos estáticos.
- Definir clases abstractas.
- Definir interfaces.
- Implementar clases que utilicen clases abstractas e interfaces.

## Actividades

- Crear una clase Pokemon con:
    - **name, health y type** como variables principales.
    - **void attackPokemon(Pokemon pokemon)** Este método reduce la salud del Pokemon atacado en 10 puntos.
    - Una variable **static count** para mantener el número de Pokemones creados en el programa.
    - Getter y Setter para cada variable principal.
    - Un constructor para establecer **name, health y type** en la creación de la instancia.

**Pokemon.java**

    public class Pokemon {
    // su código aquí
    }

- Crear una interfaz para los siguientes métodos:
    - **Pokemon createPokemon(String name, int health, String type)** : Este método crea y retorna un Pokemon.
    -**String pokemonInfo(Pokemon pokemon)** : Este método devuelve un string con el name, health, y type del Pokemon.
    -**void listPokemon()**: Lista el nombre de todos los Pokemones que tienes en la Pokedex.

**PokemonInterface.java**

    public interface PokemonInterface {
    // su código aquí
    }

- Crear una clase abstracta que sólo implementa **createPokemon y pokemonInfo(Pokemon pokemon)** de PokemonInterface.

**AbstractPokemon.java**

    public abstract class AbstractPokemon implements PokemonInterface {
    // su código aquí
    }

- Crear una clase Pokedex que extienda de la clase abstracta anterior e implemente **listPokemon()**. Su clase Pokedex necesita un atributo llamado **myPokemons** donde usted tendrá el número de Pokemones creados.

**Pokedex.java**

    public class Pokedex extends AbstractPokemon {
    // su código aquí
    }

- Crear un archivo de pruebas donde se instancie un Pokemon, ataque un Pokemon y liste todos los Pokemones de la Pokedex.
