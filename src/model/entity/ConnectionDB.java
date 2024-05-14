package model.entity;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.function.DoubleBinaryOperator;

public class ConnectionDB {
    private static final String url = "jdbc:mysql://localhost:3306/Streaming";
    private static final String user = "root";
    private static final String password = "";

    private static Connection connect;

    public static  Connection getInstance(){
        if(connect == null){
            try {
                connect = DriverManager.getConnection(url, user, password);
                System.out.println("Connexion à la base de données");

            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        return connect;
    }

//    public static void main(String[] args) {
//       System.out.println(ConnectionDB.getInstance());
//    }

}
