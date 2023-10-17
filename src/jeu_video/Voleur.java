package jeu_video;

public class Voleur extends Personnage{
    private  String outil;

    public Voleur(String nom, int dureeDeVie,String outil) {
        super(nom, dureeDeVie);
        this.outil=outil;
    }

    public String getOutil() {
        return outil;
    }

    public void setOutil(String outil) {
        this.outil = outil;
    }

    public void rencontrer(){
        System.out.println("Bonjour, je suis un voleur!!!s");
    }
}
