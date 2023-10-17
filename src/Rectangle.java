public class Rectangle {

    // Variables membres = attributs = propriétes
    double longueur;
    double largeur;


    // Fonctions membres = méthodes
    double calculeSurface(){
        return longueur*largeur;
    }

    double calculPerimetre(){
        return  2*(longueur+largeur);
    }
}
