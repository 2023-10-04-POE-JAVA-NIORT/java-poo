package tps;

public class Tp1CalculImc {
    private double poids;
    private double taille;

    Tp1CalculImc(double poids, double taille) throws NumberFormatException {
        if(poids<0 || taille<0){
            throw new NumberFormatException("Taille ou poids inférieur à 0");
        }
        this.poids = poids;
        this.taille = taille;
    }

    Tp1CalculImc(){
        this.poids=0.0;
        this.taille=0.0;
    }

    public float calculIMC(){
        return (float) (this.poids/Math.pow(this.taille,2));
    }

    @Override
    public String toString() {
        return String.format("TP2_Calcul_IMC{" +
                "poid = %fKg, taille = %fm}",this.poids,this.taille);
    }
}
