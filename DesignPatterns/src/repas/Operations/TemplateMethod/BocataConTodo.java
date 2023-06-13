package repas.Operations.TemplateMethod;

public class BocataConTodo extends Bocata {

    private final String[] carns = {"Bacon","Lomo","Pollo"};
    private final String[] vegatblesUsed = {"Tomate","Lettuce"};
    private final String[] CheeseUsed = {"Gouda","Havaratti"};



    @Override
    void addMeat() {
        System.out.println("Adding meats");
        for(String meat: carns){
            System.out.println(meat);
        }
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
