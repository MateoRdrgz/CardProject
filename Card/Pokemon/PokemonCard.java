package Card.Pokemon;

import Card.Card;
import jdk.jfr.Unsigned;

import java.util.ArrayList;

public class PokemonCard extends Card {
    PokemonTypes pokemonType;
    ArrayList<PokemonAttack> attacks;
    Integer healthPoint;

    public PokemonCard(PokemonTypes pokemonType, String name, PokemonAttack baseAttack, Integer healthPoint) {
        super(name);
        this.pokemonType = pokemonType;
        attacks.add(baseAttack);
        this.healthPoint = healthPoint;
    }

    public void addNewAttack(PokemonAttack attack){
        attacks.add(attack);
    }

    public PokemonTypes getPokemonType() {
        return pokemonType;
    }

    public void setPokemonType(PokemonTypes pokemonType) {
        this.pokemonType = pokemonType;
    }

    public ArrayList<PokemonAttack> getAttacks() {
        return attacks;
    }

    public void setAttacks(ArrayList<PokemonAttack> attacks) {
        this.attacks = attacks;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(Integer healthPoint) {
        this.healthPoint = healthPoint;
    }
}
