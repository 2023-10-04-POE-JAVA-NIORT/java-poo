
public class Main {
    public static void main(String[] args) {
       Rectangle monRec;
       monRec=new Rectangle();

       monRec.longueur=500;
       monRec.largeur=250;

       System.out.printf("Surface : %.2f\n",monRec.calculeSurface());
       System.out.printf("Perimètre : %.2f",monRec.calculPerimetre());

    }
}