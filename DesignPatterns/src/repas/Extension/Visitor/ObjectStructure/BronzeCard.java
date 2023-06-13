package repas.Extension.Visitor.ObjectStructure;

import repas.Extension.Visitor.Offers.OfferVisitor;

public class BronzeCard implements CreditCards {
    @Override
    public String getName() {
        return "Bronze";
    }

    @Override
    public void accept(OfferVisitor v) {
        v.visitBronze(this);
    }
}
