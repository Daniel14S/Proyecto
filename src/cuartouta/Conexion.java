package cuartouta;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conectar = null;

    public Connection conectar() {

        try {
            //para cualquier conexion de base de datos se necesitan los parametros: servidor, usuario, y la contraseña
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection("jdbc:mysql://localhost:3307/cuartouta", "root", "");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
        return conectar;
    }

}