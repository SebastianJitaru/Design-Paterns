package repas.Construction.Builder;

public class Tester {
    public static void main (String[] args){
        Car.Builder carbuilder = new Car.Builder();
        carbuilder.setFuel("Diesel");
        carbuilder.setBrand("Renault");
        carbuilder.setSeats(4);

        Car cotxe1 = carbuilder.build();

        System.out.println(cotxe1.toString());

    }
}
