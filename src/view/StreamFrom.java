package view;

import model.entity.User;
import model.dao.UserDAO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class StreamFrom extends JDialog{
    private JTextField textFieldEmail;
    private JPasswordField passwordField;
    private JPasswordField confirmpasswordField;
    private JTextField textFieldDateNaissance;
    private JTextField textFieldRIB;
    private JButton enregistrerButton;
    private JButton annulerButton;
    private JPanel EnregistrePanel;

    public StreamFrom(JFrame parent){
        super(parent);
        setTitle("BIENVENUE SUR STREAM APP");
        setContentPane(EnregistrePanel);
        setMinimumSize(new Dimension(600, 500));
        setModal(true);
        setLocationRelativeTo(parent);
//        setVisible(true);

        enregistrerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                try {
                    enregister_user();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }

            }
        });
        annulerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                dispose();
            }
        });
        setVisible(true);
    }

    public void annuler_inscirption() {

    }

    public void enregister_user() throws SQLException {
        String email = textFieldEmail.getText();
        String password = String.valueOf(passwordField.getPassword());
        String confirmPassword = String.valueOf(confirmpasswordField.getPassword());
        String DateNaissance = textFieldDateNaissance.getText();
        String RIB = textFieldRIB.getText();
        if(email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty() || DateNaissance.isEmpty()|| RIB.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    "Veuillez remplir tous les champs",
                    "Réessayer",
                    JOptionPane.ERROR_MESSAGE);

        }
        if(!password.equals(confirmPassword)){
            JOptionPane.showMessageDialog(this,
                    "Le Mot de passe ne correspond pas",
                    "Veuillez Réessayer",
                    JOptionPane.ERROR_MESSAGE);
        }

        UserDAO userdao = new UserDAO();
        User user = new User(email, password, RIB, DateNaissance);
        userdao.create(user);



    }

//    public static void main(String[] args) {
//        StreamFrom stf = new StreamFrom(null);
//    }
}
