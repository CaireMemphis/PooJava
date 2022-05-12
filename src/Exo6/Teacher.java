package Exo6;

public class Teacher extends Person{
private String subject;
    public Teacher(int age) {
        super(age);
    }
    public void Explain(){
        System.out.println("Explanations begins");
    }

    public void donnerAge(){
        System.out.println("What !? My age is "+ getAge());

    }

}
