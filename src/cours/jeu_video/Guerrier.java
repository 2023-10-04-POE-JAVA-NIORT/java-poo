package cours.jeu_video;

public class Guerrier extends Personnage{
    private String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        super(nom,dureeDeVie);
        this.arme = arme;
    }


    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }

    @Override
    public void rencontrer(){
        System.out.println("Je suis un guerrier!!!");
    }

    @Override
    public String toString(){
//        Très mauvaise pratique
//        return String.format("Nom : %s\nDurée de vie : %d\nArme : %s",this.getNom(),this.getDureeDeVie(),this.arme);
        return String.format("%s\nArme : %s",super.toString(),this.arme);
    }
}
