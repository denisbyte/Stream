package model.entity;


import java.util.ArrayList;

public class Documentaire extends MenuCatalogue{
    private ArrayList<Acteur> acteurs;
    private int id_documentaire;

    // Constructuer par défaut
    public Documentaire(){


    }
    Documentaire(int id_documentaire, String nom, String description, String bande_annonce,  int age_min, int duree, String annee, int recommandation){
        super(nom, description, bande_annonce, age_min, duree, annee, recommandation);
        this.id_documentaire = id_documentaire;

    }

    public int getId_documentaire() {
        return this.id_documentaire;
    }

    public void setId_documentaire(int id_documentaire) {
        this.id_documentaire = id_documentaire;
    }

    @Override
    public String toString() {
        return "Documentaire{" +
                "id_documentaire=" + id_documentaire +
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
    // Ajout acteur;
    public void ajouter(Acteur acteur){
        acteurs.add(acteur);
    }
    // Suppression Acteur
    public void suppression(Acteur acteur){
        acteurs.remove(acteur);
    }
    @Override
    public void telecharger() {
        super.telecharger();
        System.out.println("....");
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
