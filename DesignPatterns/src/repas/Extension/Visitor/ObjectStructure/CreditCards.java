package repas.Extension.Visitor.ObjectStructure;


import repas.Extension.Visitor.Offers.OfferVisitor;

public interface CreditCards {

    String getName();
    void accept(OfferVisitor visitor);
}
