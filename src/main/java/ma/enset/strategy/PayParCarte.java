package ma.enset.strategy;

public class PayParCarte implements Pay {
    @Override
    public void operation() {
        System.out.println("Paiement par carte ");
    }
}
