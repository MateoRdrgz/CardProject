package Card.Pokemon;

import Card.Card;

import java.util.ArrayList;

public class PokemonCard extends Card {
    PokemonTypes pokemonType;
    ArrayList<PokemonAttack> attacks;
    Integer healthPoint;

    public PokemonCard(PokemonTypes pokemonType, String name, PokemonAttack baseAttack, Integer healthPoint) {
        super(name);
        this.attacks = new ArrayList<>();
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

    public String displayCard(){
        String displayToReturn =  "Carte Pokémon  " + cardName + ", " + healthPoint + "PV : \n";
        displayToReturn += "Type : " + pokemonType.name() + "\n";
        displayToReturn += "Attaques : \n";
        for (PokemonAttack attack : attacks){
            displayToReturn += " - ";
            for (PokemonTypes type : attack.cost.keySet()){
                displayToReturn += type.name() + " : " + attack.cost.get(type) + " " ;
            }
            displayToReturn += " | " + attack.name + " |  " ;
            displayToReturn +=  attack.damage + "\n";
            displayToReturn += "   Description : " + attack.description + "\n\n";
        }
        
        return displayToReturn;
    }
}
