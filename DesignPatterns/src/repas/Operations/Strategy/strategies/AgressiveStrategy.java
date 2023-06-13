package repas.Operations.Strategy.strategies;

public class AgressiveStrategy implements Strategy {
    @Override
    public void actionCommand() {
        System.out.println("Agressive Strategy");
    }
}
