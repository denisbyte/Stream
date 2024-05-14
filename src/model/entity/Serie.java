package model.entity;

import java.util.ArrayList;

public class Serie extends MenuCatalogue{
    private int  id_serie;
    private ArrayList<Saison> saisons;
    private ArrayList<Acteur> acteurs;
    // Constructeur par défaut
    public Serie(){

    }

    Serie(int id_serie, String nom, String description, String bande_annonce,  int age_min, int duree, String annee, int recommandation){
        super(nom, description, bande_annonce,  age_min, duree, annee, recommandation);
        this.id_serie = id_serie;
    }


    public int getId_serie() {
        return id_serie;
    }

    public void setId_serie(int id_serie) {
        this.id_serie = id_serie;
    }
    public void ajouter(Acteur acteur){
        acteurs.add(acteur);
    }
    public void suppression(Acteur acteur){
        acteurs.remove(acteur);
    }
    @Override
    public String toString() {
        return "Serie{" +
                "id_serie=" + id_serie +
                ", nom='" + nom + '\'' +
                ", description='" + description + '\'' +
                ", bande_annonce='" + bande_annonce + '\'' +
                ", acteurs=" + acteurs +
                ", age_min=" + age_min +
                ", duree=" + duree +
                ", annee='" + annee + '\'' +
                ", recommandation=" + recommandation +
                '}';
    }

    @Override
    public void telecharger() {
        super.telecharger();
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
