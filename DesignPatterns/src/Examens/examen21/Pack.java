package Examens.examen21;

import java.util.Observable;
import java.util.Observer;

import java.util.ArrayList;
import java.util.List;

public class Pack extends Product implements Observer {

    protected float totalPrice = 0.0f;
    private List<Product> packItems = new ArrayList<Product>();
    @Override
    public float getPrice() {
        /*Apartat a
           float totalPrice = 0.0f;
           for(Product item: packItems){
                totalPrice += item.getPrice();
           }
           return totalPrice;
         */
        return totalPrice;
    }
    public void addProduct(Product item){
        PriceChanged change = new PriceChanged(this.totalPrice,(this.totalPrice + item.getPrice()));
        packItems.add(item);
        this.totalPrice+= item.getPrice();
        item.addObserver(this);
        setChanged();
        notifyObservers(change);
    }

    @Override//aixo per a la subclase discounted nos servirie, s'hauria de tornar a implementar en discounted pack
    public void update(Observable o, Object arg) {
        PriceChanged change = (PriceChanged) arg;
        float oldPrice = this.totalPrice;
        this.totalPrice += change.getNewPrice();
        setChanged();
        notifyObservers(this);
    }
}
