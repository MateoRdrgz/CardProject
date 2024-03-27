import Card.Card;
import Card.Pokemon.PokemonAttack;
import Card.Pokemon.PokemonCard;
import Card.Pokemon.PokemonTypes;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<PokemonTypes, Integer> costOfAttack1ForPikachu = new HashMap<>();
        costOfAttack1ForPikachu.put(PokemonTypes.INCOLORE, 1);
        PokemonAttack rugissement = new PokemonAttack(costOfAttack1ForPikachu, 0, "Rugissement", "Pendant le prochain tour de votre adversaire, les attaques du Pokemon Défenseur infligent 20 dégâts de moins (après application de la Faiblesse et de la Résistance).");

        HashMap<PokemonTypes, Integer> costOfAttack2ForPikachu = new HashMap<>();
        costOfAttack2ForPikachu.put(PokemonTypes.ELECTRIQUE, 2);
        costOfAttack2ForPikachu.put(PokemonTypes.INCOLORE, 1);
        PokemonAttack tonnerre = new PokemonAttack(costOfAttack2ForPikachu, 200, "Tonnerre", "Défaussez toute l'énergie de ce Pokémon");


        PokemonCard pikachu = new PokemonCard(PokemonTypes.ELECTRIQUE, "Pikachu", rugissement, 100);
        pikachu.addNewAttack(tonnerre);
        System.out.println(pikachu.displayCard());
    }
}