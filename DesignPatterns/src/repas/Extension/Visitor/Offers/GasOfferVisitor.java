package repas.Extension.Visitor.Offers;

import repas.Extension.Visitor.ObjectStructure.BronzeCard;
import repas.Extension.Visitor.ObjectStructure.SilverCard;

public class GasOfferVisitor implements OfferVisitor{
    @Override
    public void visitBronze(BronzeCard bronze) {
        System.out.println("Computing gas for bronze");
    }

    @Override
    public void visitSilver(SilverCard silver) {
        System.out.println("Computing gas for silver");
    }
}
