package model.entity;

import java.util.ArrayList;

public class Saison {
    private int id_saison;
    private String titre;
    private ArrayList<Episode> episodes;
    private Serie serie;

    public Saison(int id_saison, String titre) {
        this.id_saison = id_saison;
        this.titre = titre;
    }

    public Saison(int id_saison, String titre, Serie serie) {
        this.id_saison = id_saison;
        this.titre = titre;
        this.serie = serie;
        episodes = new ArrayList<Episode>();
    }

    public int getId_saison() {
        return this.id_saison;
    }

    public void setId_saison(int id_saison) {
        this.id_saison = id_saison;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void ajouter(Episode episode){
        episodes.add(episode);
    }

    @Override
    public String toString() {
        return "Saison{" +
                "id_saison=" + id_saison +
                ", titre='" + titre + '\'' +
                ", episodes=" + episodes +
                ", serie=" + serie +
                '}';
    }
}
