package repas.Operations.TemplateMethod;

public class SandwichSculptor {
    public static void main (String[] args) {
        Bocata bocataVegetal = new BocataVegetal();
        Bocata bocataConTodo = new BocataConTodo();

        bocataVegetal.makeSandwich();

        bocataConTodo.makeSandwich();
    }

}
