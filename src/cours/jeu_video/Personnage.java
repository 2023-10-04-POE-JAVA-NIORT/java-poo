package cours.jeu_video;

public abstract class Personnage {
    private static int nombrePersonnages=0;
    private String nom;
    private int dureeDeVie;

    public Personnage(String nom, int dureeDeVie) {
        nombrePersonnages++;
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) {
        this.dureeDeVie = dureeDeVie;
    }

    abstract public void rencontrer();


    public static int getNombrePersonnages(){
        return nombrePersonnages;
    }


    @Override
    public String toString(){
//        return "Nom : "+this.nom+"\n"+"Durée de vie : "+this.dureeDeVie;
        return String.format("Nom : %s\nDurée de vie : %d",this.nom,this.dureeDeVie);
    }

}
