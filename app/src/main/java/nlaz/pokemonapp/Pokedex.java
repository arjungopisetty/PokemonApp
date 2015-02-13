package nlaz.pokemonapp;

import java.util.List;

/**
 * Created by nlazaris on 2/11/15.
 */
public class Pokedex {

    private String name;
    private List<Pokemon> pokemon;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pokemon> getPokemon() {
        return pokemon;
    }

    public void setPokemon(List<Pokemon> pokemon) {
        this.pokemon = pokemon;
    }
}
