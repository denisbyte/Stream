package model.entity;

import java.util.ArrayList;

public class Film extends MenuCatalogue{

    private ArrayList<Acteur> acteurs;
    private int id_film;
    public Film(){

    }
    public Film(int id_film, String nom, String description, String bande_annonce, int age_min, int duree, String annee, int recommandation){
        super(nom, description, bande_annonce,  age_min, duree, annee, recommandation);
        this.id_film = id_film;
    }

    public int getId_film() {
        return this.id_film;
    }

    public void setId_film(int id_film) {
        this.id_film = id_film;
    }

    @Override
    public String toString() {
        return "Film{" +
                "nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", bande_annonce='" + bande_annonce + '\'' +
                ", acteurs=" + acteurs +
                ", age_min=" + age_min +
                ", duree=" + duree +
                ", annee='" + annee + '\'' +
                ", recommandation=" + recommandation +
                '}';
    }

    // Ajout d'acteur
    public void ajout(Acteur acteur){
        acteurs.add(acteur);
    }
    public void suppression(Acteur acteur){
        acteurs.remove(acteur);
    }
    @Override
    public void telecharger() {

    }

    @Override
    public void recommadation() {
        super.recommadation();
    }

    @Override
    public void streaming() {
        super.streaming();
    }

    @Override
    public void evaluer() {
        super.evaluer();
    }

    @Override
    public void lecture() {
        super.lecture();
    }

    @Override
    public void partager() {
        super.partager();
    }
}
