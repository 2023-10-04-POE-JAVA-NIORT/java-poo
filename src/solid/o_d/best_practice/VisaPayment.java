package solid.o_d.best_practice;

public class VisaPayment implements Payment{
    @Override
    public void processPayment() {
        System.out.println("Paiement par carte Visa en cours");
    }
}
