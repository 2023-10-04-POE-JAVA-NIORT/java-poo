package solid.o_d.best_practice;

public class MainBestPractice {
    public static void main(String[] args) {
        var paymentService=new PaymentService(new ApplePay());

        paymentService.pay();
    }
}
