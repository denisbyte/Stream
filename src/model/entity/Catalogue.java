package model.entity;

public class Catalogue {
    private int id_catalogue;
    private int id_oeuvre;
    private String type_oeuvre;

    public Catalogue(int id_catalogue, int id_oeuvre, String type_oeuvre) {
        this.id_catalogue = id_catalogue;
        this.id_oeuvre = id_oeuvre;
        this.type_oeuvre = type_oeuvre;
    }

    public int getId_catalogue() {
        return this.id_catalogue;
    }

    public void setId_catalogue(int id_catalogue) {
        this.id_catalogue = id_catalogue;
    }

    public int getId_oeuvre() {
        return this.id_oeuvre;
    }

    public void setId_oeuvre(int id_oeuvre) {
        this.id_oeuvre = id_oeuvre;
    }

    public String getType_oeuvre() {
        return this.type_oeuvre;
    }

    public void setType_oeuvre(String type_oeuvre) {
        this.type_oeuvre = type_oeuvre;
    }

    @Override
    public String toString() {
        return "Catalogue{" +
                "id_catalogue=" + id_catalogue +
                ", id_oeuvre=" + id_oeuvre +
                ", type_oeuvre='" + type_oeuvre + '\'' +
                '}';
    }
}
