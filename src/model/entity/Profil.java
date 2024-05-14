package model.entity;

public class Profil extends MenuCatalogue{
    private int id_profil;
    private String nom_profil;

    public Profil(){

    }

    public Profil(int id_profil, String nom_profil) {
        this.id_profil = id_profil;
        this.nom_profil = nom_profil;
    }

    public int getId_profil() {
        return this.id_profil;
    }

    public void setId_profil(int id_profil) {
        this.id_profil = id_profil;
    }

    public String getNom_profil() {
        return this.nom_profil;
    }

    public void setNom_profil(String nom_profil) {
        this.nom_profil = nom_profil;
    }

    @Override
    public String toString() {
        return "Profil{" +
                "id_profil=" + id_profil +
                ", nom_profil='" + nom_profil + '\'' +
                '}';
    }

    @Override
    public void telecharger() {
        super.telecharger();
    }

    @Override
    public void lecture() {
        super.lecture();
    }

    public void cree_lstes(){

    }
    // Implementer les méthodes Télécharger et Lire
}
