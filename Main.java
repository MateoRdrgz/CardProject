import Card.Card;
import Card.Pokemon.PokemonAttack;
import Card.Pokemon.PokemonCard;
import Card.Pokemon.PokemonTypes;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<PokemonTypes, Integer> cost = new HashMap<>();
        cost.put(PokemonTypes.INCOLORE, 1);
        PokemonAttack rugissement = new PokemonAttack(cost, 0, "Rugissement", "Pendant le prochain tour de votre adversaire, les attaques du Pokemon Défenseur infligent 20 dégâts de moins (après application de la Faiblesse et de la Résistance).");
        Card pikachu = new PokemonCard(PokemonTypes.ELECTRIQUE, "Pikachu", rugissement, 100);
        System.out.println(pikachu.displayCard());
    }
}