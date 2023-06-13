package repas.Operations.TemplateMethod;

public class BocataVegetal extends Bocata {

    private final String[] vegatblesUsed = {"Tomate","Lettuce"};
    private final String[] CheeseUsed = {"Gouda","Havaratti"};
    @Override
    boolean customerWantsMeat(){return false;}
    @Override
    void addMeat() {

    }

    @Override
    void addCheese() {
        System.out.println("Adding cheese");
        for(String cheese: CheeseUsed){
            System.out.println(cheese);
        }
    }

    @Override
    void addVegetables() {
        System.out.println("Adding Vegetables");
        for(String veggie: vegatblesUsed){
            System.out.println(veggie);
        }
    }
}
