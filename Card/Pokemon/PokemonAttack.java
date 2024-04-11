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

    public Map<PokemonTypes, Integer> getCost() {
        return cost;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
