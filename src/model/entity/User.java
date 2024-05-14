package model.entity;

import java.util.ArrayList;

public class User {
    private int id_user;
    private String email;
    private String password;
    private String RIB;
    private String dateNaissance;

    private ArrayList<Profil> profils;

    public User(){

    }
//    User(){
//        super();
//        profils = new ArrayList<Profil>();
//    }
    public User(int id_user, String email, String password, String RIB, String dateNaissance) {
        this.id_user = id_user;
        this.email = email;
        this.password = password;
        this.RIB = RIB;
        this.dateNaissance = dateNaissance;
    }

    public User(String email, String password, String RIB, String dateNaissance) {
        this.email = email;
        this.password = password;
        this.RIB = RIB;
        this.dateNaissance = dateNaissance;

    }

    public int getId_user() {
        return this.id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRIB() {
        return this.RIB;
    }

    public void setRIB(String RIB) {
        this.RIB = RIB;
    }

    public String getdateNaissance() {
        return this.dateNaissance;
    }

    public void setdateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @Override
    public String toString() {
        return "User{" +
                "id_user=" + id_user +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", RIB='" + RIB + '\'' +
                ", dateNaissance='" + dateNaissance + '\'' +
                '}';
    }

    // Ajout de profil
    public void ajout(Profil profil){
        profils.add(profil);
    }
    // Suppression de profil
    public void suppression(Profil profil){
        profils.remove(profil);
    }

}
