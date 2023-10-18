package solid.o_d.best_practice;

public class PaymentService {
    private Payment payment;

    public PaymentService(Payment payment){
        this.payment=payment;
    }

    public void pay(){
        this.payment.processPayment();
    }
}
