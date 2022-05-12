
import Exo5.Point;


import java.util.Scanner;

public class Main {
    static double abs;
    static double ordo;
    public static void main(String[] args) {
        //generation des 2 points
        Scanner sc = new Scanner(System.in);
        System.out.println("point 1");
        System.out.print("absicce : ");
        abs = sc.nextDouble();
        System.out.println("---------------");
        System.out.println("point 1");
        System.out.print("ordonne : ");
        ordo = sc.nextDouble();
        System.out.println("---------------");
        Point point1 = new Point(abs,ordo);
        System.out.println("point 2");
        System.out.print("absicce : ");
        abs = sc.nextDouble();
        System.out.println("---------------");
        System.out.println("point 1");
        System.out.print("ordonne : ");
        ordo = sc.nextDouble();
        System.out.println("---------------");
        Point point2 = new Point(abs,ordo);

        System.out.println("P1 ("+point1.getAbscisse()+","+point1.getOrdonné()+")");
        System.out.println("P2 ("+point2.getAbscisse()+","+point2.getOrdonné()+")");
        System.out.println("-----------------------");
        System.out.println(" La distance entre P1 et P2 : ");

        //arrondis de la reponse à 5 chiffres apres la virgule

        System.out.printf("%.5f\n",point1.distance(point1,point2));
    }
}
