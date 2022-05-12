package Exo6;

public class Test {
    public static void main(String[] args) {
        Person people = new Person(20);
        people.hello();
        Student eleve =new Student(15);
        System.out.println();
        eleve.hello();
        eleve.goToClasse();
        eleve.displayAge();
        System.out.println();
        Teacher prof = new Teacher(40);
        prof.hello();
        prof.Explain();

    }
}
