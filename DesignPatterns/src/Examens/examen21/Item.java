package Examens.examen21;

import java.util.Observable;
import java.util.Observer;

public class Item extends Product {

    private float price = 0.0f;

    public Item(float price){
        this.price = price;
    }
    @Override
    public float getPrice() {
        return this.price;
    }
    public void setPrice(float newPrice) throws IllegalArgumentException {
        if(newPrice <= 0.0)
            throw new IllegalArgumentException("Price should be positive and greater than 0");
        if(this.price != newPrice) {
            float oldPrice = this.price;
            this.price = newPrice;
            setChanged();
            notifyObservers(new PriceChanged(oldPrice, newPrice));
        }

    }

}
