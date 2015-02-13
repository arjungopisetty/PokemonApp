package nlaz.pokemonapp;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by nlazaris on 2/11/15.
 */
public interface PokemonService {

    @GET("/pokemon/{index}")
    void getPokemon(@Path("index") int index, Callback<Pokemon> callback);

    @GET("/pokedex/{index}")
    void getPokedex(@Path("index") int index, Callback<Pokedex> callback);
}
