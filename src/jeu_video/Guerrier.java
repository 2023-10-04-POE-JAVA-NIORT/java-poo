package jeu_video;

public class Guerrier {
    private String nom;
    private int dureeDeVie;
    private String arme;

    public Guerrier(String nom, int dureeDeVie, String arme) {
        this.nom = nom;
        this.dureeDeVie = dureeDeVie;
        this.arme = arme;
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

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) {
        this.arme = arme;
    }
}
