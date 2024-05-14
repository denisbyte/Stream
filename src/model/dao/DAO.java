package model.dao;
import model.entity.ConnectionDB;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

abstract public class DAO<T> {
    public Connection connect = ConnectionDB.getInstance();

    abstract public ArrayList<T> getAll() throws SQLException;

    abstract public T find(int id) throws SQLException;

    abstract public  int create(T object) throws SQLException;

   public   abstract   T update(T object) throws SQLException;

   public   abstract T delete(T object);

}
