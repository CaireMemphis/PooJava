package Exo3;

public class Student {
    private String nom;
    private int note1;
    private int note2;
    double moy;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNote1() {
        return note1;
    }

    public void setNote1(int note1) {
        this.note1 = note1;
    }

    public int getNote2() {
        return note2;
    }

    public void setNote2(int note2) {
        this.note2 = note2;
    }

    public Student(String nom, int note1, int note2) {
        this.nom = nom;
        this.note1 = note1;
        this.note2 = note2;

    }

    public void calculMoyenne(){
        double nbTotal = 2;
        moy = (note1+note2)/nbTotal;
    }
    public void show(){
        System.out.println("-------------------");
        System.out.println("nom : "+nom);
        System.out.println("--   --   --   --");
        System.out.println("moyenne : "+moy);
        System.out.println("-------------------");
    }
}
