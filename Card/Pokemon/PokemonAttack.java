package Card.Pokemon;

import java.util.Map;

public class PokemonAttack {
    Map<PokemonTypes, Integer> cost;
    int damage;
    String name;
    String description;

    public PokemonAttack(Map<PokemonTypes, Integer> cost, int damage, String name, String description) {
        this.cost = cost;
        this.damage = damage;
        this.name = name;
        this.description = description;
    }
}
