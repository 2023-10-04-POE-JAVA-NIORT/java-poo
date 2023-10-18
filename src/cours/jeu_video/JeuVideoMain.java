package cours.jeu_video;

public class JeuVideoMain {
    public static void main(String[] args) {
        var chris=new Guerrier("Christian",200,"Ak 47");
        var arnaud=new Magicien("Arnaud",400,"Ma baguette");
        var gilles=new Sorcier("Gilles",600,"Abc","Xyz");
//        var p=new Personnage("Papy",20); => Erreur car personnage est une classe abstraite

        System.out.println(chris.getNom());

        System.out.println(chris);
        System.out.println(arnaud);
        System.out.println(gilles);

        System.out.println(Personnage.getNombrePersonnages());

        System.out.println(Personnage.DUREE_DE_VIE_PAR_DEFAUT);

//        chris.rencontrer();
//        arnaud.rencontrer();
//        gilles.rencontrer();
    }
}

// Créer une classe Sorcier
// nom, duree de vie, baguette magique, baton magique
