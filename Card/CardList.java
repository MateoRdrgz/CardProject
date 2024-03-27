package Card;

import Card.Magic.MagicCard;
import Card.Pokemon.PokemonCard;

import java.util.ArrayList;

public class CardList {
    private static CardList instance = null;
    private ArrayList<Card> listOfAllCards = new ArrayList<>();
    private CardList(){
    }

    public static CardList getInstance() {
        if (instance == null) {
            instance = new CardList();
        }
        return instance;
    }

    public ArrayList<Card> getListOfAllCards() {
        return listOfAllCards;
    }

    public ArrayList<Card> getAllPokemonCards() {
        ArrayList<Card> pokemonCards = new ArrayList<>();
        for (Card card : listOfAllCards) {
            if (card instanceof PokemonCard) {
                pokemonCards.add(card);
            }
        }
        return pokemonCards;
    }

    public ArrayList<Card> getAllMagicCards(){
        ArrayList<Card> magicCards = new ArrayList<>();
        for (Card card : listOfAllCards) {
            if (card instanceof MagicCard) {
                magicCards.add(card);
            }
        }
        return magicCards;
    }

    public void addCard(Card card) {
        listOfAllCards.add(card);
    }

    public void removeCard(Card card) {
        listOfAllCards.remove(card);
    }

    public void displayAllCards() {
        int cardCount = 1;
        String cardType = "";
        for (Card card : listOfAllCards) {
            if(card instanceof PokemonCard){
                cardType = "Pokemon";
            } else if (card instanceof MagicCard){
                cardType = "Magic";
            }

            System.out.println("Carte " + cardCount++ + " (" + cardType + ") : \t");
            String[] linesToDisplay = card.displayCard().split("\n");
            for (String currentLine : linesToDisplay) {
                System.out.println("\t" + currentLine);
            }
            System.out.println("\n");
        }
    }

    public void displayCardsFromArray(ArrayList<Card> cards){
        int cardCount = 1;
        String cardType = "";
        if (cards.isEmpty()){
            System.out.println("Il n'y a aucune cartes dans cette liste");
            return;
        }
        for (Card card : cards) {
            if(card instanceof PokemonCard){
                cardType = "Pokemon";
            } else if (card instanceof MagicCard){
                cardType = "Magic";
            }

            System.out.println("Carte " + cardCount++ + " (" + cardType + ") : \t");
            String[] linesToDisplay = card.displayCard().split("\n");
            for (String currentLine : linesToDisplay) {
                System.out.println("\t" + currentLine);
            }
            System.out.println("\n");
        }
    }


}
