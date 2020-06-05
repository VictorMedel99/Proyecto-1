package proyectodao;

/**
 *
 * @author victor
 */
public class DAOPersona {
    
    /**public boolean guardar(Persona p){
        ConexionDB con=ConexionDB.getInstance();
        String sql = "INSERT INTO Personas (Clave, Nombre, Direccion, Telefono) VALUES ('" + p.getClave()+ "','"+p.getNombre()+"','"+p.getDireccion() + "','" + p.getTelefono() + "');";
        return con.execute(sql);
    }
    */
    
    public boolean  guardar(Persona p){
        boolean res  = false;
        ConexionDB con = ConexionDB.getInstance();
        String sql ="insert into personas (Clave, nombre, direccion, telefono) values "
                +"('"+p.getClave()+"','"+p.getNombre()+"','"+p.getDireccion()+"','"+
                p.getTelefono()+"')";  
        res = con.execute(sql);
        return res;
}
}
