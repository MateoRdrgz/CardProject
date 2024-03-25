package Card.Magic;

public class Land extends MagicCard{
    Mana[] manaColors;
    String subType;
    String ability;

    public Land(String cardName, Mana[] manaColors, String subType){
        super(cardName,MagicCardType.Land);
        this.manaColors = manaColors;
        this.subType = subType;
    }
    public Land(String cardName, Mana[] manaColors, String subType, String ability){
        super(cardName,MagicCardType.Land);
        this.manaColors = manaColors;
        this.subType = subType;
        this.ability = ability;
    }
    public void displayCard(){
        System.out.println("Land Card: " + cardName);
    }
}
