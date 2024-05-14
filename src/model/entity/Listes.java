package model.entity;

public class Listes {
    private int id_liste;
    private int id_oeuvre;
    private int id_profile;

    public Listes(int id_liste, int id_oeuvre, int id_profile) {
        this.id_liste = id_liste;
        this.id_oeuvre = id_oeuvre;
        this.id_profile = id_profile;
    }

    public int getId_liste() {
        return this.id_liste;
    }

    public void setId_liste(int id_liste) {
        this.id_liste = id_liste;
    }

    public int getId_oeuvre() {
        return this.id_oeuvre;
    }

    public void setId_oeuvre(int id_oeuvre) {
        this.id_oeuvre = id_oeuvre;
    }

    public int getId_profile() {
        return this.id_profile;
    }

    public void setId_profile(int id_profile) {
        this.id_profile = id_profile;
    }

    @Override
    public String toString() {
        return "Listes{" +
                "id_liste=" + id_liste +
                ", id_oeuvre=" + id_oeuvre +
                ", id_profile=" + id_profile +
                '}';
    }
}
