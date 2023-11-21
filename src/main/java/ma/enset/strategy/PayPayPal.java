package ma.enset.strategy;

public class PayPayPal implements Pay {
    @Override
    public void operation() {
        System.out.println("Paiement par PayPal");
    }
}
