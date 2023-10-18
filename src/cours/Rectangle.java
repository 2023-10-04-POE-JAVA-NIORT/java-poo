package cours;

public class Rectangle {

    // Variables membres = attributs = propriétes
    private double longueur;
    private double largeur;

    public Rectangle(double longueur,double largeur){
        this.longueur=longueur;
        this.largeur=largeur;
    }

    // Fonctions membres = méthodes
    public double calculeSurface(){
        return longueur*largeur;
    }

    public double calculPerimetre(){
        return  2*(longueur+largeur);
    }

    // setters : Méthodes publiques pour modifier des attributs
    public void setLongueur(double longueur){
        if(longueur>=0){
            this.longueur=longueur;// shadowing
        }
    }

    public void setLargeur(double largeur){
       if(largeur>=0){
           this.largeur=largeur;
       }
    }

    // getters: Méthodes publiques pour lire des attributs
    public double getLongueur(){
        return longueur;
    }

    public double getLargeur(){
        return largeur;
    }
}
