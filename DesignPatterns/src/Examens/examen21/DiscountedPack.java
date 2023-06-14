package Examens.examen21;

import java.util.Observable;

public class DiscountedPack extends Pack{
    private float discount;

    public DiscountedPack(float discount){
        this.discount = discount;
    }

    public float getDiscount(){
        return discount;
    }

    public void setDiscount(float discount){
        this.discount = discount;
        float oldCost = super.totalPrice;
        float newCost = super.totalPrice * (1-this.discount);
        super.totalPrice = newCost;
        notifyObservers(new PriceChanged(oldCost,newCost));

    }

    public void update(Observable obs, Object arg) {
        PriceChanged changeInProduct = (PriceChanged) arg;
        float newPrice = getPrice();
        float deltaPrice = (1.0f - discount) * (changeInProduct.getNewPrice() - changeInProduct.getOldPrice());
        float oldPrice = newPrice - deltaPrice; // restem doncs fem el canvi `cap enrera`
        setChanged();
        notifyObservers(new PriceChanged(oldPrice, newPrice));
    }
    @Override
    public float getPrice() {
        return super.getPrice() * (1.0f - this.discount);
    }
}
