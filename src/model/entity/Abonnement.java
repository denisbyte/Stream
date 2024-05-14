package model.entity;

public class Abonnement {
    private int id_abonnement;
    private String type_abonnement;
    private String date_debut;

    public Abonnement(int id_abonnement, String type_abonnement, String date_debut) {
        this.id_abonnement = id_abonnement;
        this.type_abonnement = type_abonnement;
        this.date_debut = date_debut;
    }

    public int getId_abonnement() {
        return this.id_abonnement;
    }

    public void setId_abonnement(int id_abonnement) {
        this.id_abonnement = id_abonnement;
    }

    public String getType_abonnement() {
        return this.type_abonnement;
    }

    public void setType_abonnement(String type_abonnement) {
        this.type_abonnement = type_abonnement;
    }

    public String getDate_debut() {
        return this.date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    @Override
    public String toString() {
        return "Abonnement{" +
                "id_abonnement=" + id_abonnement +
                ", type_abonnement='" + type_abonnement + '\'' +
                ", date_debut='" + date_debut + '\'' +
                '}';
    }
}
