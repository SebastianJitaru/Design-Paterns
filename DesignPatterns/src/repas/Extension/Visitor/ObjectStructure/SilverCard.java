package repas.Extension.Visitor.ObjectStructure;

import repas.Extension.Visitor.Offers.OfferVisitor;

public class SilverCard implements CreditCards {

    public String getName(){
        return "Silver";
    }

    @Override
    public void accept(OfferVisitor visitor) {
        visitor.visitSilver(this);
    }
}
