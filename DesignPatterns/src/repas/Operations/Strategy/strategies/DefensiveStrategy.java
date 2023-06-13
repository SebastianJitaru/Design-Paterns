package repas.Operations.Strategy.strategies;

public class DefensiveStrategy implements Strategy {
    @Override
    public void actionCommand() {
        System.out.println("Defensive strategy");
    }
}
