package Card.Magic;

public class Creature extends MagicCard{
    Mana[] manaCost;
    String subType;
    String ability;
    int power;
    int toughness;

    public Creature(String cardName, Mana[] manaCost, String subType, int power, int toughness){
        super(cardName, MagicCardType.Creature);
        this.manaCost = manaCost;
        this.subType = subType;
        this.power = power;
        this.toughness = toughness;
    }
    public Creature(String cardName, Mana[] manaCost, String subType, int power, int toughness, String ability){
        super(cardName, MagicCardType.Creature);
        this.manaCost = manaCost;
        this.subType = subType;
        this.power = power;
        this.toughness = toughness;
        this.ability = ability;
    }
    public String displayCard(){
        return "Creature Card: " + cardName;
    }

    public Mana[] getManaCost() {
        return manaCost;
    }

    public String getSubType() {
        return subType;
    }

    public String getAbility() {
        return ability;
    }

    public int getPower() {
        return power;
    }

    public int getToughness() {
        return toughness;
    }
}
