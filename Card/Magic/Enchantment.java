package Card.Magic;

public class Enchantment extends MagicCard{
    Mana[] manaCost;
    String ability;

    public Enchantment(String cardName, Mana[] manaCost, String ability){
        super(cardName, MagicCardType.Enchantment);
        this.manaCost = manaCost;
        this.ability = ability;
    }
    public String displayCard(){
        return "Enchantment Card: " + cardName;
    }
    
}
