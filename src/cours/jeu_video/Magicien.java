package cours.jeu_video;

public class Magicien extends Personnage{
    private String baguetteMagique;

    public Magicien(String nom, int dureeDeVie, String baguetteMagique) {
        super(nom,dureeDeVie);
        this.baguetteMagique = baguetteMagique;
    }


    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) {
        this.baguetteMagique = baguetteMagique;
    }
    public void rencontrer(){
        System.out.println("Je suis un Magicien!!!");
    }

    @Override
    public String toString() {
        return String.format("%s\nBaguette magique : %s",super.toString(),this.baguetteMagique);
    }
}
