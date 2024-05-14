package model.dao;

import model.entity.Film;
import model.entity.Serie;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class SerieDAO extends DAO<Serie>{
    @Override
    public ArrayList<Serie> getAll() throws SQLException {

        ArrayList<Serie> series = new ArrayList<>();
        Serie serie;
        String sql = "SELECT * FROM Streaming.Serie";
        try {
            Statement statement = this.connect.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()){
                serie = new Serie();
                series.add(this.createserie(resultset, serie));
            }
            statement.close();
            resultset.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return series;
    }

    @Override
    public Serie find(int id) throws SQLException {
        Serie serie = new Serie();
        String sql = "SELECT* FROM Serie WHERE id_serie = ?";
        PreparedStatement ps = this.connect.prepareStatement(sql);
        ps.setInt(1 , id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            serie = this.createserie(rs, serie);
        }
        ps.close();
        rs.close();
        return serie;



    }

    @Override
    public int create(Serie serie) throws SQLException {
        return 0;
    }

    @Override
    public Serie update(Serie serie) throws SQLException {
        return null;
    }

    @Override
    public Serie delete(Serie serie) {
        return null;
    }

    public Serie createserie(ResultSet resultSet, Serie serie) throws SQLException {
        serie.setId_serie(resultSet.getInt("id_serie"));
        serie.setNom(resultSet.getString("nom"));
        serie.setDescription(resultSet.getString("description"));
        serie.setBande_annonce(resultSet.getString("bande_annonce"));
        serie.setAge_min(resultSet.getInt("age_min"));
        serie.setDuree(resultSet.getInt("duree"));
        serie.setAnnee(resultSet.getString("annee"));
        serie.setRecommandation(resultSet.getInt("recommandation"));
        return serie;

    }

}
