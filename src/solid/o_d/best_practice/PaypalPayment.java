package solid.o_d.best_practice;

public class PaypalPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Paiement par Paypal en cours");
    }
}
