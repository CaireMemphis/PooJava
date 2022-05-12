import Exo5.Point;

public class Main {
    public static void main(String[] args) {
        //generation des 2 points
        Point point1 = new Point(8,9);
        Point point2 = new Point(3,6);

        System.out.println("P1 ("+point1.getAbscisse()+","+point1.getOrdonné()+")");
        System.out.println("P2 ("+point2.getAbscisse()+","+point2.getOrdonné()+")");
        System.out.println("-----------------------");
        System.out.println(" La distance entre P1 et P2 : ");

        //arrondis de la reponse à 5 chiffres apres la virgule

        System.out.printf("%.5f\n",point1.distance(point1,point2));
    }
}
