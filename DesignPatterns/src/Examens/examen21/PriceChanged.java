package Examens.examen21;

public final class PriceChanged {
     private final float oldPrice;
     private final float newPrice;

     public PriceChanged(float oldPrice, float newPrice) {
        this.oldPrice = oldPrice;
        this.newPrice = newPrice;
     }
     public float getOldPrice() { return oldPrice; }
     public float getNewPrice() { return newPrice; }
}

