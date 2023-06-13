package repas.Construction.Builder;

public class Car {
    private final String brand;
    private final int seats;

    private final String fuel;

    private Car(Builder carBuilder){
        this.brand = carBuilder.brand;
        this.seats = carBuilder.seats;
        this.fuel = carBuilder.fuel;
    }
    @Override
    public String toString(){
        return  "Car {" +
                "brand: " + brand + ", " +
                "seats: " + seats + ", " +
                "fuel: " + fuel + "}";
    }
    public static class Builder{
        private String brand;
        private int seats;
        private String fuel;

        public Builder(){ // aqui inicialitzem les variables a un valor inicial
            this.brand = null;
            this.seats = 0;
            this.fuel = null;
        }
        public Car build(){
            checkRequirements();
            return new Car(this);
        }

        public void setBrand(String brand){
            this.brand = brand;
        }

        public void setSeats(int seats){
            this.seats = seats;
        }
        public void setFuel(String fuel){
            this.fuel = fuel;
        }

        public void checkRequirements() throws IllegalArgumentException{
            if(this.fuel.isEmpty()) throw new IllegalArgumentException();
            if(this.seats == 0) throw new IllegalArgumentException();
            if(this.brand.isEmpty()) throw new IllegalArgumentException();

        }

    }
}
