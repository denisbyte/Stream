package model.entity;

public class Type {
    private int id_type;
    private String libelle;
    private boolean isdocumentary;

    public Type(int id_type, String libelle, boolean isdocumentary) {
        this.id_type = id_type;
        this.libelle = libelle;
        this.isdocumentary = isdocumentary;
    }

    public int getId_type() {
        return this.id_type;
    }

    public void setId_type(int id_type) {
        this.id_type = id_type;
    }

    public String getLibelle() {
        return this.libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public boolean isIsdocumentary() {
        return this.isdocumentary;
    }

    public void setIsdocumentary(boolean isdocumentary) {
        this.isdocumentary = isdocumentary;
    }

    @Override
    public String toString() {
        return "Type{" +
                "id_type=" + id_type +
                ", libelle='" + libelle + '\'' +
                ", isdocumentary=" + isdocumentary +
                '}';
    }
}
