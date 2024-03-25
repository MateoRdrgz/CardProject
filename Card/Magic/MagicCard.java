package Card.Magic;

import Card.Card;

public abstract class MagicCard extends Card {
    MagicCardType type;
    public MagicCard(String cardName, MagicCardType type){
        this.cardName = cardName;
        this.type = type;
    }
    public void displayCard(){
        System.out.println("Magic Card: " + cardName);
    }
}
