package Exo5;

public class Point {
    private double abscisse;
    private double ordonné;

    public Point(double abscisse, double ordonné) {
        this.abscisse = abscisse;
        this.ordonné = ordonné;
    }

    public double getAbscisse() {
        return abscisse;
    }

    public void setAbscisse(int abscisse) {
        this.abscisse = abscisse;
    }

    public double getOrdonné() {
        return ordonné;
    }

    public void setOrdonné(int ordonné) {
        this.ordonné = ordonné;
    }


    public double distance(Point point1, Point point2){

        //decomposition de la formule de calcul de la distance


        double space = 0;
        double sousSpace = 0;
        double sousX ;
        double sousY;

        // calcul (x1-x2) et (y1-y2)

        sousX = point2.abscisse - point1.abscisse;

        sousY = point2.ordonné - point1.ordonné;

        //mise au carré des elements contenu dans la racine carré

        sousSpace = (sousX*sousX)+(sousY*sousY);

        // calcul racine carré

        space = Math.sqrt(sousSpace);

        return space;
    }
}
