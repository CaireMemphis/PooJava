package Exo1;

public class Rectangle {
private int absicce;
private int ordonne;

    public Rectangle(int absicce, int ordonne) {
        this.absicce = absicce;
        this.ordonne = ordonne;
    }

    public int getAbsicce() {
        return absicce;
    }

    public void setAbsicce(int absicce) {
        this.absicce = absicce;
    }

    public int getOrdonne() {
        return ordonne;
    }

    public void setOrdonne(int ordonne) {
        this.ordonne = ordonne;
    }

    //obtenir la surface du rectangle

    public void surface(){
        int surface = absicce * ordonne;
        System.out.println("Surface du rectangle : "+ surface);
    }
}
