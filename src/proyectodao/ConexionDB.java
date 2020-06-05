package proyectodao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


/**
 *
 * @author victor
 */
public class ConexionDB {
    private Connection connect;
    private static ConexionDB conexion=null;
    
    
    private ConexionDB() {
        try {
            connect = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Practicas", "postgres", "medel991028");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ConexionDB getInstance() {
        if (conexion == null) {
            conexion= new ConexionDB();
        }
            return conexion;
    }
    
    public boolean execute(String sql) {
        Boolean resul=false;
        try {
            Statement st = connect.createStatement();
            st.execute(sql);
            resul = true;

        } catch (SQLException ex) {
            Logger.getLogger(ConexionDB.class.getName()).log(Level.SEVERE, null, ex);

        }
        return resul;
    }
}
