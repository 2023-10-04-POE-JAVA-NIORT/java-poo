package solid.o_d.bad_practice;

public class MainOd {
    public static void main(String[] args) {
        var payment=new PaymentService("Apple Pay");
        payment.pay();
    }
}
