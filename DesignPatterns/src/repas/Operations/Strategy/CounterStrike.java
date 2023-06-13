package repas.Operations.Strategy;

import repas.Operations.Strategy.strategies.AgressiveStrategy;
import repas.Operations.Strategy.strategies.DefensiveStrategy;

public class CounterStrike {
    public static void main(String[] args) {
        Player terrorist = new Player("Terrorist");
        Player counterTerrorist = new Player("Counter Terrorist");

        terrorist.setStrategy(new AgressiveStrategy());
        counterTerrorist.setStrategy(new DefensiveStrategy());

        terrorist.action();
        counterTerrorist.action();
    }



}
