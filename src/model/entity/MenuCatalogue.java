package model.entity;

import java.util.ArrayList;




public class MenuCatalogue {
    protected String nom;

    protected String description;
    protected String bande_annonce;
    protected ArrayList<String> acteurs;
    protected int age_min;
    protected int duree;
    protected String annee;

    int recommandation;
    public MenuCatalogue(){

    }
    public MenuCatalogue(String nom, String description, String bande_annonce, int age_min, int duree, String annee, int recommandation) {
        this.nom = nom;
        this.description = description;
        this.bande_annonce = bande_annonce;
        this.age_min = age_min;
        this.duree = duree;
        this.annee = annee;
        this.recommandation = recommandation;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBande_annonce() {
        return bande_annonce;
    }

    public void setBande_annonce(String bande_annonce) {
        this.bande_annonce = bande_annonce;
    }

    public ArrayList<String> getActeurs() {
        return acteurs;
    }


    public int getAge_min()
    {
        return this.age_min;
    }

    public void setAge_min(int age_min) {

        this.age_min = age_min;
    }

    public int getDuree() {

        return this.duree;
    }

    public void setDuree(int duree) {

        this.duree = duree;
    }

    public String getAnnee() {

        return this.annee;
    }

    public void setAnnee(String annee) {

        this.annee = annee;
    }

    public int getRecommandation() {

        return this.recommandation;
    }

    public void setRecommandation(int recommandation) {

        this.recommandation = recommandation;
    }

    @Override
    public String toString() {
        return "MenuCatalogue{" +
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

    public void telecharger(){

    }

    public void recommadation() {

    }
    public void streaming(){
        System.out.println("Streaming");
   }
    public void evaluer(){
        System.out.println("Evaluer");
   }
    public void lecture(){
        System.out.println("lecture");
   }
    public void partager(){
    System.out.println("share");
   }
}

