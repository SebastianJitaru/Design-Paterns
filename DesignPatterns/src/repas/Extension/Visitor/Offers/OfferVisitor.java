package repas.Extension.Visitor.Offers;

import repas.Extension.Visitor.ObjectStructure.BronzeCard;
import repas.Extension.Visitor.ObjectStructure.SilverCard;

public interface OfferVisitor {
    void visitBronze(BronzeCard bronze);
    void visitSilver(SilverCard silver);
}
