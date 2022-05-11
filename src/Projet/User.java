package Projet;

public class User {
    private int id;
    private String nom;
    private String mail;

    public User(int id, String nom, String mail) {
        this.id = id;
        this.nom = nom;
        this.mail = mail;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getMail() {
        return mail;
    }
}
