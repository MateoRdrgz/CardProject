import Card.Card;
import Card.Magic.Creature;
import Card.Magic.MagicCard;
import Card.Magic.Mana;
import Card.Pokemon.PokemonAttack;
import Card.Pokemon.PokemonCard;
import Card.Pokemon.PokemonTypes;
import Card.CardList;

import java.util.HashMap;

public class Main {
    static CardList listOfAllCards = CardList.getInstance();
    public static void main(String[] args) {
        createPokemonsTestCards();
        createMagicsTestCards();

        runTests();

        listOfAllCards.displayAllCards();
    }

    private static void runTests() {
        generalTests();
        testsPokemon();
        testsMagic();
    }

    private static void generalTests() {
        try {
            assert listOfAllCards.getListOfAllCards().size() == 4;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void testsPokemon(){
        try {
            assert listOfAllCards.getAllPokemonCards().size() == 3;

            assert listOfAllCards.getListOfAllCards().get(0).getCardName().equals("Pikachu");
            assert listOfAllCards.getListOfAllCards().get(1).getCardName().equals("Salameche");
            assert listOfAllCards.getListOfAllCards().get(2).getCardName().equals("Carapuce");

            assert ((PokemonCard) listOfAllCards.getListOfAllCards().get(0)).getPokemonType().equals(PokemonTypes.ELECTRIQUE);
            assert ((PokemonCard) listOfAllCards.getListOfAllCards().get(1)).getPokemonType().equals(null);
            assert ((PokemonCard) listOfAllCards.getListOfAllCards().get(2)).getPokemonType().equals(PokemonTypes.EAU);

            assert ((PokemonCard) listOfAllCards.getListOfAllCards().get(0)).getAttacks().get(0).getName().equals("Rugissement");
            assert ((PokemonCard) listOfAllCards.getListOfAllCards().get(0)).getAttacks() == null;

            assert (listOfAllCards.getListOfAllCards().get(0) instanceof PokemonCard);
            assert !(listOfAllCards.getListOfAllCards().get(2) instanceof PokemonCard);
        }catch (Exception e){
            System.out.println(e);
        }

    }

    private static void testsMagic(){
        try {
            assert listOfAllCards.getAllMagicCards().size() == 1;

            assert listOfAllCards.getListOfAllCards().get(3).getCardName().equals("Gobelin à pique");

            assert ((Creature) listOfAllCards.getListOfAllCards().get(3)).getManaCost().length == 3;
            assert ((Creature) listOfAllCards.getListOfAllCards().get(3)).getManaCost()[0].equals(Mana.Rouge);
        }catch (Exception e){
            System.out.println(e);
        }
    }

    private static void createMagicsTestCards() {
        Mana[] gobelinCost = {Mana.Rouge, Mana.Incolore, Mana.Incolore};
        Creature gobelin = new Creature("Gobelin à pique", gobelinCost, "Gobelin" , 1, 1);

        listOfAllCards.addCard(gobelin);
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
        costOfAttack1ForSalameche.put(PokemonTypes.FEU, null);
        PokemonAttack destructionArdente = new PokemonAttack(costOfAttack1ForSalameche, 0, "Destruction Ardente","Défaussez un stade en jeu.");

        HashMap<PokemonTypes, Integer> costOfAttack2ForSalameche = new HashMap<>();
        costOfAttack2ForSalameche.put(PokemonTypes.FEU, 2);
        PokemonAttack crachageDeFeuRegulier = new PokemonAttack(costOfAttack2ForSalameche, 30, "Crachage de Feu Régulier","");

        PokemonCard salameche = new PokemonCard(null, "Salameche", destructionArdente, null);
        salameche.addNewAttack(crachageDeFeuRegulier);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        listOfAllCards.addCard(pikachu);
        listOfAllCards.addCard(salameche);
        listOfAllCards.addCard(new PokemonCard(PokemonTypes.EAU, "Carapuce", null, 60));

    }
}