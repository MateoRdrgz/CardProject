package Card.Magic;

public class Sorcery extends MagicCard{
    Mana[] manaCost;
    String ability;

    public Sorcery(String cardName, Mana[] manaCost, String ability){
        super(cardName, MagicCardType.Sorcery);
        this.manaCost = manaCost;
        this.ability = ability;
    }
    public String displayCard(){
        return "Sorcery Card: " + cardName;
    }
    
}
