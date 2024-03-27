package Card.Magic;

import Card.Card;

public abstract class MagicCard extends Card {
    MagicCardType type;
    public MagicCard(String cardName, MagicCardType type){
        super(cardName);
        this.type = type;
    }
    public String displayCard(){
        return "Magic Card: " + cardName;
    }
}
