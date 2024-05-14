package model.dao;

import model.entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDAO extends DAO<User>{

    @Override
    public ArrayList<User> getAll() {
        ArrayList<User> listes_users = new ArrayList<>();
        User user;
        String sql = "SELECT * FROM User";
        try {
            Statement statement = this.connect.createStatement();
            ResultSet resultset = statement.executeQuery(sql);
            while (resultset.next()){
                  user = new User();
                  listes_users.add(this.createuser(resultset, user));
            }
            statement.close();
            resultset.close();
        }catch (SQLException e){
            e.printStackTrace();
        }

        return listes_users;
    }

    @Override
    public User find(int id) throws SQLException {
        User user = new User();
        String sql = "SELECT* FROM User WHERE id_user = ?";
        PreparedStatement ps = this.connect.prepareStatement(sql);
        ps.setInt(1 , id);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            user = this.createuser(rs, user);
        }
        ps.close();
        rs.close();
        return user;
    }

    @Override
    public int create(User user) throws SQLException {
        int id = -1;
        String sql = "INSERT INTO User(id_user, email, password, RIB, dateNaissance) VALUES(?, ?,?,?)";
        PreparedStatement ps = this.connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        this.createps(ps, user).executeQuery();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next())
        {
            id = rs.getInt(1);
        }
        rs.close();
        ps.close();
        return id;
    }

    @Override
    public User update(User user) throws SQLException {
        String sql = "UPDATE User Set password = ? WHERE id_user=?";
        int id = -1;
        PreparedStatement ps = this.connect.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
        ps.setInt(2, user.getId_user());
        this.createps(ps, user).executeUpdate();
        ResultSet rs = ps.getGeneratedKeys();
        if(rs.next()){
            id = rs.getInt(1);
        }

        return this.find(id);

    }

    @Override
    public User delete(User object) {
        return null;

    }
    public PreparedStatement createps(PreparedStatement ps, User user) throws SQLException{
        ps.setInt(1, user.getId_user());
        ps.setString(2, user.getEmail());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getRIB());
        ps.setString(5, user.getdateNaissance());
        return ps;
    }

    public User createuser(ResultSet resultSet, User user) throws SQLException {
        user.setId_user(resultSet.getInt("id_user"));
        user.setEmail(resultSet.getString("email"));
        user.setPassword(resultSet.getString("password"));
        user.setRIB(resultSet.getString("RIB"));
        user.setdateNaissance(resultSet.getString("dateNaissance"));
        return user;

    }
}
