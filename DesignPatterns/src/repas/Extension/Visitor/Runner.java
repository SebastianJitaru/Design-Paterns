package repas.Extension.Visitor;

import repas.Extension.Visitor.ObjectStructure.BronzeCard;
import repas.Extension.Visitor.ObjectStructure.SilverCard;
import repas.Extension.Visitor.Offers.HotelOfferVisitor;

public class Runner {
    public static void main(String[] args){
        HotelOfferVisitor visitor = new HotelOfferVisitor();

        BronzeCard bronze = new BronzeCard();
        SilverCard silver = new SilverCard();

        bronze.accept(visitor);
        silver.accept(visitor);
    }
}
