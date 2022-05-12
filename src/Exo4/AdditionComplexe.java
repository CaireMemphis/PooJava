package Exo4;

public class AdditionComplexe {
    private int nb1ima;
    private int nb1reel;
    private int nb2ima;
    private int nb2reel;
    int sumReel;
    int sumIma;

    public AdditionComplexe(int nb1ima, int nb1reel, int nb2ima, int nb2reel) {
        this.nb1ima = nb1ima;
        this.nb1reel = nb1reel;
        this.nb2ima = nb2ima;
        this.nb2reel = nb2reel;
    }

    public int getNb1ima() {
        return nb1ima;
    }

    public void setNb1ima(int nb1ima) {
        this.nb1ima = nb1ima;
    }

    public int getNb1reel() {
        return nb1reel;
    }

    public void setNb1reel(int nb1reel) {
        this.nb1reel = nb1reel;
    }

    public int getNb2ima() {
        return nb2ima;
    }

    public void setNb2ima(int nb2ima) {
        this.nb2ima = nb2ima;
    }

    public int getNb2reel() {
        return nb2reel;
    }

    public void setNb2reel(int nb2reel) {
        this.nb2reel = nb2reel;
    }


    public void calcul() {
        sumReel = nb1reel + nb2reel;
        sumIma = nb1ima + nb2ima;
    }

    public void show() {
        calcul();
        System.out.println("La somme est " + sumReel + " + " + sumIma + "i");

    }

}
