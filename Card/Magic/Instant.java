package Card.Magic;

public class Instant extends MagicCard{
    Mana[] manaCost;
    String ability;

    public Instant(String cardName, Mana[] manaCost, String ability){
        super(cardName, MagicCardType.Instant);
        this.manaCost = manaCost;
        this.ability = ability;
    }
    public String displayCard(){
        return "Instant Card: " + cardName;
    }
    
}
