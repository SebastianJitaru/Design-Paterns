package main;

public class Money {
    private double costInEuros;
    public Money(double costInEuros) {
        this.costInEuros = costInEuros;
    }

    public double getCostInEuros() {
        return costInEuros;
    }

    public void setCostInEuros(double costInEuros) {
        this.costInEuros = costInEuros;
    }

    public void add(Money costInEuros) {
        this.costInEuros += costInEuros.getCostInEuros();
    }

    @Override
    public String toString() {
        return "" + costInEuros;
    }
}
