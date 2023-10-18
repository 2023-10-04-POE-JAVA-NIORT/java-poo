package solid.s.best_practice;

public class OtpService {
    public  void sendOtp(String medium){
        if(medium.equals("mobile")){
            System.out.println("Envoi du code par SMS");
        }else if(medium.equals("email")){
            System.out.println("Envoi du code par Email");
        }
    }
}
