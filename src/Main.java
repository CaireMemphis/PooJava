
import Exo4.AdditionComplexe;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nombre1reel;
        int nombre1ima;
        int nombre2reel;
        int nombre2ima;
        Scanner sc = new Scanner(System.in);

        System.out.print("Premier nombre");

        System.out.println("---   ---   ---");
        System.out.print("Entrez la partie reelle : ");
        nombre1reel = sc.nextInt();

        System.out.println("---   ---   ---");
        System.out.print("Entrez la partie imaginaire : ");
        nombre1ima = sc.nextInt();

        System.out.println("------------------------------------");
        System.out.println("Second nombre");

        System.out.println("---   ---   ---");
        System.out.print("Entrez la partie reelle : ");
        nombre2reel = sc.nextInt();

        System.out.println("---   ---   ---");
        System.out.print("Entrez la partie imaginaire : ");
        nombre2ima = sc.nextInt();

        System.out.println("---   ---   ---");

        AdditionComplexe student = new AdditionComplexe(nombre1ima, nombre1reel, nombre2ima, nombre2reel);
        student.show();

    }
}
