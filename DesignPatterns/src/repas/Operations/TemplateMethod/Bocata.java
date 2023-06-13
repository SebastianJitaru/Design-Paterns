package repas.Operations.TemplateMethod;


public abstract class Bocata {
    //template method final
    final void makeSandwich(){
        cutBun();//has to be done always
        if(customerWantsMeat()){
            addMeat();
        }
        if(customerWantsCheese()){
            addCheese();
        }
        if(customerWantsVegetables()){
            addVegetables();
        }

        serveBocata();//has to be done always
    }
    public void cutBun(){
        System.out.println("El pan se esta cortao");
    }
    public void serveBocata(){
        System.out.println("Bocata servido al cliente");
    }
    abstract void addMeat();
    abstract void addCheese();

    abstract void addVegetables();

    boolean customerWantsMeat(){return true;}//this is a hook, overidable by user
    boolean customerWantsCheese(){return true;}

    boolean customerWantsVegetables(){return true;}
}
