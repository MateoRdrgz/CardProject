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
        this.attacks = new ArrayList<>();
        this.pokemonType = pokemonType;
        if(baseAttack != null){
            attacks.add(baseAttack);
        }

        if(healthPoint == null){
            healthPoint = 0;
        }else{
            this.healthPoint = healthPoint;
        }
    }

    public void addNewAttack(PokemonAttack attack){
        attacks.add(attack);
    }

    public PokemonTypes getPokemonType() {
        return pokemonType;
    }

    public ArrayList<PokemonAttack> getAttacks() {
        return attacks;
    }

    public Integer getHealthPoint() {
        return healthPoint;
    }

    public String displayCard(){
        String displayToReturn =  "Carte Pokémon  " + cardName + ", " + healthPoint + "PV : \n";
        if (pokemonType == null){
            displayToReturn += "Type : Aucun\n";
        }else{
            displayToReturn += "Type : " + pokemonType.name() + "\n";
        }

        displayToReturn += "Attaques : \n";
        if(attacks.size() == 0){
            displayToReturn += "\tCe Pokémon n'a pas d'attaques\n";
        }else{
            for (PokemonAttack attack : attacks){
                displayToReturn += " - ";
                for (PokemonTypes type : attack.cost.keySet()){
                    if (type != null ){
                        if (attack.cost.get(type) == null) {
                            displayToReturn += type.name() + " : " + 0 + " ";
                        }else{
                            displayToReturn += type.name() + " : " + attack.cost.get(type) + " ";
                        }
                    }
                }
                displayToReturn += " | " + attack.name + " |  " ;
                displayToReturn +=  attack.damage + "\n";
                displayToReturn += "   Description : " + attack.description + "\n\n";
            }
        }

        
        return displayToReturn;
    }
}
