package model.dao;

import model.entity.Documentaire;
import model.entity.Film;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DocumentaireDAO extends DAO<Documentaire>{
    @Override
    public ArrayList<Documentaire> getAll() throws SQLException {

        ArrayList<Documentaire> documentaires = new ArrayList<>();
        Documentaire documentaire;
        String sql = "SELECT * FROM Documentaire";
        try {
            Statement statement = this.connect.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()){
                documentaire = new Documentaire();
                documentaires.add(this.createdocumentaire(resultset, documentaire));
            }
            statement.close();
            resultset.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
        return documentaires;


    }

    @Override
    public Documentaire find(int id) throws SQLException {
        Documentaire documentaire = new Documentaire();
        String sql = "SELECT* FROM Documentaire WHERE id_documentaire = ?";
        PreparedStatement ps = this.connect.prepareStatement(sql);
        ps.setInt(1 , id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            documentaire = this.createdocumentaire(rs, documentaire);
        }
        ps.close();
        rs.close();
        return documentaire;


    }

    @Override
    public int create(Documentaire documentaire) throws SQLException {
        return 0;
    }

    @Override
    public Documentaire update(Documentaire documentaire) throws SQLException {
        return null;
    }

    @Override
    public Documentaire delete(Documentaire object) {
        return null;
    }

    public Documentaire createdocumentaire(ResultSet resultSet, Documentaire documentaire) throws SQLException {
        documentaire.setId_documentaire(resultSet.getInt("id_documentaire"));
        documentaire.setNom(resultSet.getString("nom"));
        documentaire.setDescription(resultSet.getString("description"));
        documentaire.setBande_annonce(resultSet.getString("bande_annonce"));
        documentaire.setAge_min(resultSet.getInt("age_min"));
        documentaire.setDuree(resultSet.getInt("duree"));
        documentaire.setAnnee(resultSet.getString("annee"));
        documentaire.setRecommandation(resultSet.getInt("recommandation"));
        return documentaire;
    }
}
