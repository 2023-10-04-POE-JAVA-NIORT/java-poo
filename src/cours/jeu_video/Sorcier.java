package cours.jeu_video;

public class Sorcier extends Magicien{
    private String batonMagique;

    public Sorcier(String nom, int dureeDeVie, String baguetteMagique,String batonMagique) {
        super(nom, dureeDeVie, baguetteMagique);
        this.batonMagique=batonMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) {
        this.batonMagique = batonMagique;
    }


    @Override
    public String toString(){
        return String.format("%s\nBaton magique : %s\n",super.toString(),this.batonMagique);
    }

}
