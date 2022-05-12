package exo2;

public class Somme {
    private int n1 = 0;
    private int n2 = 0;

    public Somme() {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Somme(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public void sum(){

        int sum = n1+n2;
        System.out.println("Somme = " + sum);

    }
}
