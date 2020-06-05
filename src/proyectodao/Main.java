package proyectodao;

import javax.swing.JOptionPane;

/**
 *
 * @author victor Medel
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1=new Persona();
        p1.setClave("002");
        p1.setNombre("H Medel");
        p1.setDireccion("Mendoza");
        p1.setTelefono("76981");
        
        DAOPersona daoP=new DAOPersona();
        boolean r = daoP.guardar(p1);
        if(r)        
            JOptionPane.showMessageDialog(null,"Se guardo correctamente");
        else
            JOptionPane.showMessageDialog(null,"Error");

    }
    
}
