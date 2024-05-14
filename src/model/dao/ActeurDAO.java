package model.dao;


import model.entity.Acteur;
import model.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ActeurDAO extends DAO<Acteur>{
    @Override
    public ArrayList<Acteur> getAll() {
        ArrayList<Acteur> listes_acteurs = new ArrayList<Acteur>();
        Acteur acteur;
        String sql = "SELECT* FROM Acteur";
        try {
            Statement statement = this.connect.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()){
                acteur = new Acteur();
                listes_acteurs.add(this.createacteur(resultset, acteur));
            }
            statement.close();
            resultset.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listes_acteurs;

    }

    @Override
    public Acteur find(int id) throws SQLException {
        Acteur acteur = new Acteur();
        String sql = "SELECT* FROM Acteur WHERE id_acteur = ?";
        PreparedStatement ps = this.connect.prepareStatement(sql);
        ps.setInt(1 , id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            acteur = this.createacteur(rs, acteur);
        }
        ps.close();
        rs.close();
        return acteur;

    }

    @Override
    public int create(Acteur acteur) throws SQLException {
        return 0;
    }

    @Override
    public Acteur update(Acteur acteur) throws SQLException {
        return null;
    }

    @Override
    public Acteur delete(Acteur acteur) {
        return null;
    }


    public Acteur createacteur(ResultSet resultSet, Acteur acteur) throws SQLException {
          acteur.setId_acteur(resultSet.getInt("id_acteur"));
          acteur.setNom(resultSet.getString("nom"));
          return acteur;

    }
}
