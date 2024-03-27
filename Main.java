import Card.Card;
import Card.Pokemon.PokemonAttack;
import Card.Pokemon.PokemonCard;
import Card.Pokemon.PokemonTypes;
import Card.CardList;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class Main {
    static CardList listOfAllCards = CardList.getInstance();
    public static void main(String[] args) {
        createPokemonsTestCards();



    }

    private static void createPokemonsTestCards() {
        HashMap<PokemonTypes, Integer> costOfAttack1ForPikachu = new HashMap<>();
        costOfAttack1ForPikachu.put(PokemonTypes.INCOLORE, 1);
        PokemonAttack rugissement = new PokemonAttack(costOfAttack1ForPikachu, 0, "Rugissement", "Pendant le prochain tour de votre adversaire, les attaques du Pokemon Défenseur infligent 20 dégâts de moins (apres application de la Faiblesse et de la Résistance).");

        HashMap<PokemonTypes, Integer> costOfAttack2ForPikachu = new HashMap<>();
        costOfAttack2ForPikachu.put(PokemonTypes.ELECTRIQUE, 2);
        costOfAttack2ForPikachu.put(PokemonTypes.INCOLORE, 1);
        PokemonAttack tonnerre = new PokemonAttack(costOfAttack2ForPikachu, 200, "Tonnerre", "Défaussez toute l'énergie de ce Pokémon");


        PokemonCard pikachu = new PokemonCard(PokemonTypes.ELECTRIQUE, "Pikachu", rugissement, 100);
        pikachu.addNewAttack(tonnerre);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        HashMap<PokemonTypes, Integer> costOfAttack1ForSalameche = new HashMap<>();
        costOfAttack1ForSalameche.put(PokemonTypes.FEU, 1);
        PokemonAttack destructionArdente = new PokemonAttack(costOfAttack1ForSalameche, 0, "Destruction Ardente","Défaussez un stade en jeu.");

        HashMap<PokemonTypes, Integer> costOfAttack2ForSalameche = new HashMap<>();
        costOfAttack2ForSalameche.put(PokemonTypes.FEU, 2);
        PokemonAttack crachageDeFeuRegulier = new PokemonAttack(costOfAttack2ForSalameche, 30, "Crachage de Feu Régulier","");

        PokemonCard salameche = new PokemonCard(PokemonTypes.FEU, "Salameche", destructionArdente, 70);
        salameche.addNewAttack(crachageDeFeuRegulier);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        listOfAllCards.addCard(salameche);
        listOfAllCards.addCard(pikachu);

        listOfAllCards.displayCardsFromArray(listOfAllCards.getAllPokemonCards());
        listOfAllCards.displayCardsFromArray(listOfAllCards.getAllMagicCards());

    }
}