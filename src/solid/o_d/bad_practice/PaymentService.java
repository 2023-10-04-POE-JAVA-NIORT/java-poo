package solid.o_d.bad_practice;

public class PaymentService {
    private String paymentMethod;

    public PaymentService(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void pay() {
        if (this.paymentMethod.equals("Paypal")) {
            System.out.println("Paiement par Paypal en cours");
        } else if (this.paymentMethod.equals("Visa")) {
            System.out.println("Paiement par carte Visa en cours");
        } else if (this.paymentMethod.equals("Apple Pay")) {
            System.out.println("Paiement par Apple Pay en cours");
        }  else if(this.paymentMethod.equals("Mastercard")){
            System.out.println("Paiement par Mastercard en cours");
        }
        else{
            System.out.println("Système de paiement non supporté");
        }
    }
}
