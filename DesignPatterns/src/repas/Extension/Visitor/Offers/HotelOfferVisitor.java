package repas.Extension.Visitor.Offers;

import repas.Extension.Visitor.ObjectStructure.BronzeCard;
import repas.Extension.Visitor.ObjectStructure.SilverCard;

public class HotelOfferVisitor implements OfferVisitor{
    @Override
    public void visitBronze(BronzeCard bronze) {
        System.out.println("Hotel offer for bronze");
    }

    @Override
    public void visitSilver(SilverCard silver) {
        System.out.println("Hotel offer for silver");

    }
}
