package repas.Operations.Strategy;

import repas.Operations.Strategy.strategies.Strategy;

public class Player {
    Strategy behaviour;
    String type;

    public Player(String type ){
        this.type = type;
    }

    public void setStrategy(Strategy behaviour){
        this.behaviour = behaviour;
    }

    public void action(){
        System.out.println("Player:" + this.type);
        behaviour.actionCommand();
    }
}
