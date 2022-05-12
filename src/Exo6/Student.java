package Exo6;

public class Student extends Person {

    public Student(int age) {
        super(age);
    }
    public void goToClasse(){
        System.out.println("I'm going to class !");
    }
   public void displayAge(){
       System.out.println("My age is "+getAge()+" years old !");
   }
}
