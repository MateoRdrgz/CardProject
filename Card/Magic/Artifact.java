package Card.Magic;

public class Artifact extends MagicCard{
    Mana[] manaCost;
    String ability;
    String subType;

    public Artifact(String cardName, Mana[] manaCost, String ability, String subType){
        super(cardName, MagicCardType.Artifact);
        this.manaCost = manaCost;
        this.ability = ability;
        this.subType = subType;
    }
    public String displayCard(){
        return "Artifact Card: " + cardName;
    }
    
}
