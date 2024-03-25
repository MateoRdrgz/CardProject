package Card.Pokemon;

import Card.Card;

import java.util.ArrayList;

public class PokemonCard extends Card {
    PokemonTypes pokemonType;
    ArrayList<PokemonAttack> attacks;

    public PokemonCard(PokemonTypes pokemonType, String name) {
        this.pokemonType = pokemonType;
    }
}
