import Exo1.Rectangle;
import exo2.Somme;
import Exo3.Student;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int nb1;
        int nb2;
        Scanner sc = new Scanner(System.in);
        System.out.print("nom : ");
        String name = sc.next();
        System.out.println();
        System.out.print("note 1 : ");
        nb1 = sc.nextInt();
        System.out.println();
        System.out.print("note 2 : ");
        nb2 = sc.nextInt();
        System.out.println();

        Student student = new Student(name,nb1,nb2);
        student.calculMoyenne();
        student.show();


    }
}
