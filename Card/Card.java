package Card;

public abstract class Card {
    protected String cardName;

    public Card(String cardName) {
        this.cardName = cardName;
    }

    public String getCardName() {
        return cardName;
    }
    public abstract String displayCard();
}
