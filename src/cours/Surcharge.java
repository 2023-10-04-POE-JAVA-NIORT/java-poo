package cours;

import java.util.ArrayList;
import java.util.Arrays;

public class Surcharge {
    public static int somme(int a,int b){
        return a+b;
    }


    public static int somme(int ...nombres){
        var somme=0;
        for(int nombre:nombres){
//            somme=somme+nombre;
            somme+=nombre;
        }
        return somme;
    }


    public static void main(String[] args) {
        ArrayList<String> numbers=new ArrayList<>();
        numbers.add("papa");

        System.out.println(somme(4,5));
        System.out.println(somme(4,5,6));
        System.out.println(somme(4,5,6,9));
    }
}
