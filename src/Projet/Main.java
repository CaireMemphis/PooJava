package Projet;

public class Main {
    public static void main(String[] args) {
        User first = new User(1, "Brasserie", "orange.fr");
        User second = new User(2, "Rose des Vents", "laposte.net");
        User third = new User(3, "Du Pont", "gmail.com");
        User fourth = new User(4, "tonbuctu", "yahoo.fr");




        System.out.println( first.getNom());
        System.out.println(fourth.getId());
        System.out.println(second.getMail());
    }
}