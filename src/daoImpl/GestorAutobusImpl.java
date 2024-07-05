package daoImpl;

import connection.Conexion;
import dao.IDaoGenerico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.GestionAutobus;

public class GestorAutobusImpl implements IDaoGenerico<GestionAutobus> {

    private final Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public GestorAutobusImpl() {
        conexion = Conexion.getInstancia();

    }

    @Override
    public boolean agregar(GestionAutobus obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(GestionAutobus obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(GestionAutobus obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GestionAutobus> listar() {
        List<GestionAutobus> lista = new ArrayList<>();
        try {
            ps = conexion.getConnection().prepareStatement("select * from Autobus");
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new GestionAutobus(rs.getInt(1), rs.getInt(2), rs.getString(3),rs.getInt(4),  rs.getInt(5), rs.getInt(6),rs.getString(7),  rs.getInt(8), rs.getString(9), rs.getInt(10)));
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            
            System.out.println();
            lista = null;
            
        } finally {
            ps = null;
            rs = null;
            conexion.desconectar();
        }
        return lista;
    }

    @Override
    public List<GestionAutobus> listar(GestionAutobus obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
