package repas.Construction.FactoryMethod;

public class CharacterFactory {

    public Character crateCharacter (String characterType){
        if (characterType.equalsIgnoreCase("warrior")) {
            return new WarriorCharacter();
        } else if (characterType.equalsIgnoreCase("mage")) {
            return new MageCharacter();
        } else {
            throw new IllegalArgumentException("Invalid character type.");
        }
    }
}
