package ma.enset.strategy;

public class PayParCheque implements Pay {
    @Override
    public void operation() {
        System.out.println("Paiement par Cheque");
    }
}
