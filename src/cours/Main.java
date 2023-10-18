package cours;

public class Main {
    public static void main(String[] args) {
       Rectangle monRec;
       monRec=new Rectangle(500,250);


//       monRec.setLongueur(500);
//       monRec.setLargeur(250);

        System.out.printf("Longueur : %.2f\n",monRec.getLongueur());
        System.out.printf("largeur : %.2f\n\n",monRec.getLargeur());
//
//       System.out.printf("Surface : %.2f\n",monRec.calculeSurface());
//       System.out.printf("Perimètre : %.2f",monRec.calculPerimetre());

    }
}