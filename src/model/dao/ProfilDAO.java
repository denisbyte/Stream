package model.dao;

import model.entity.Profil;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ProfilDAO extends DAO<Profil>{
    @Override
    public ArrayList<Profil> getAll() throws SQLException {
        ArrayList<Profil> listes_profils = new ArrayList<>();
        Profil profil;
        String sql = "SELECT* FROM Profil";
        try {
            Statement statement = this.connect.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()){
                profil = new Profil();
                listes_profils.add(this.createprofil(resultset, profil));
            }
            statement.close();
            resultset.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listes_profils;
    }

    @Override
    public Profil find(int id) throws SQLException {
        Profil profil = new Profil();
        String sql = "SELECT* FROM Profil WHERE id_profil = ?";
        PreparedStatement ps = this.connect.prepareStatement(sql);
        ps.setInt(1 , id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            profil = this.createprofil(rs, profil);
        }
        ps.close();
        rs.close();
        return profil;

    }

    @Override
    public int create(Profil profil) throws SQLException {
        return 0;
    }

    @Override
    public Profil update(Profil profil) throws SQLException {
        return null;
    }

    @Override
    public Profil delete(Profil profil) {
        return null;
    }

    public Profil createprofil(ResultSet resultSet, Profil profil) throws SQLException {
        profil.setId_profil(resultSet.getInt("id_profil"));
        profil.setNom_profil(resultSet.getString("nom_profil"));
        return profil;

    }
}
