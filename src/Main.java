import Exo1.Rectangle;
import exo2.Somme;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int nb1;
        int nb2;
        Somme somme = new Somme(0,0);
        somme.sum();
        Scanner sc = new Scanner(System.in);
        System.out.print("Chiffre 1 : ");
        nb1 = sc.nextInt();
        System.out.println();
        System.out.print("Chiffre 2 : ");
        nb2 = sc.nextInt();
        System.out.println();
        somme.setN1(nb1);
        somme.setN2(nb2);

        somme.sum();



    }
}
