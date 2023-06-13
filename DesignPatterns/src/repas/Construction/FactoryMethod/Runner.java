package repas.Construction.FactoryMethod;

public class Runner {
    public static void main (String[] args){
        CharacterFactory factory =  new CharacterFactory();

        Character warrior1 = factory.crateCharacter("Warrior");
        Character mage1 =  factory.crateCharacter("Mage");

        warrior1.attack();
        mage1.attack();
    }
}
