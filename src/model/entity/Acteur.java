package model.entity;

public class Acteur {
    private int id_acteur;
    private String nom;
    public Acteur(){

    }

    public Acteur(int id_acteur, String nom) {
        this.id_acteur = id_acteur;
        this.nom = nom;
    }

    public int getId_acteur() {
        return this.id_acteur;
    }

    public void setId_acteur(int id_acteur) {
        this.id_acteur = id_acteur;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Acteur{" +
                "id_acteur=" + id_acteur +
                ", nom='" + nom + '\'' +
                '}';
    }
}
