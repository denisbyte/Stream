package model.dao;

import model.entity.Film;
import model.entity.User;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class FilmDAO extends DAO<Film>{
    @Override
    public ArrayList<Film> getAll() {
        ArrayList<Film> films = new ArrayList<>();
        Film film;
        String sql = "SELECT * FROM Streaming.Film";
        try {
            Statement statement = this.connect.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()){
                film = new Film();
                films.add(this.createfilm(resultset, film));
            }
            statement.close();
            resultset.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return films;
    }

    @Override
    public Film find(int id) throws SQLException {

        Film film = new Film();
        String sql = "SELECT* FROM Film WHERE id_film = ?";
        PreparedStatement ps = this.connect.prepareStatement(sql);
        ps.setInt(1 , id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            film = this.createfilm(rs, film);
        }
        ps.close();
        rs.close();
        return film;


    }

    @Override
    public int create(Film film) {
       return -1;
    }

    @Override
    public Film update(Film object) throws SQLException {
        return null;
    }

    @Override
    public Film delete(Film object) {
        return null;
    }
    public PreparedStatement createps(PreparedStatement ps, Film film) throws SQLException{
        ps.setInt(1, film.getId_film());
        ps.setString(2, film.getNom());
        ps.setString(3, film.getDescription());
        ps.setString(4, film.getBande_annonce());
//      ps.setString(film.getActeurs().toArray());
        ps.setInt(5, film.getAge_min());
        ps.setInt(6, film.getDuree());
        ps.setString(7, film.getAnnee());
        ps.setInt(8, film.getRecommandation());

        return ps;
    }
//    Film(int id_film, String nom, String description, String bande_annonce, ArrayList<String> acteurs,
//    int age_min, int duree, String annee, int recommandation){
    public Film createfilm(ResultSet resultSet, Film film) throws SQLException {
          film.setId_film(resultSet.getInt("id_film"));
          film.setNom(resultSet.getString("nom"));
          film.setDescription(resultSet.getString("description"));
          film.setBande_annonce(resultSet.getString("bande_annonce"));
          film.setAge_min(resultSet.getInt("age_min"));
          film.setDuree(resultSet.getInt("duree"));
          film.setAnnee(resultSet.getString("annee"));
          film.setRecommandation(resultSet.getInt("recommandation"));

        return film;

    }
}
