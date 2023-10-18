package solid.o_d.best_practice;

public class ApplePay implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Paiement par Apple Pay en cours");
    }
}
