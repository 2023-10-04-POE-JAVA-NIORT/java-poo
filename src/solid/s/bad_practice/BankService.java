package solid.s.bad_practice;

public class BankService {
    public void deposit(double amount){
        System.out.println("Dépôt en cours..");
    }

    public void withdraw(double amount){
        System.out.println("Retrait en cours...");
    }

    public  void sendOtp(String medium){
        if(medium.equals("mobile")){
            System.out.println("Envoi du code par SMS");
        }else if(medium.equals("email")){
            System.out.println("Envoi du code par Email");
        }
    }

    public void printReceipt(){
        System.out.println("Impression en cours...");
    }
}
