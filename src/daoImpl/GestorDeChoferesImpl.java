package daoImpl;

import connection.Conexion;
import dao.IDaoGenerico;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.GestionChofer;

public class GestorDeChoferesImpl implements IDaoGenerico<GestionChofer> {

    private final Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public GestorDeChoferesImpl() {
        conexion = Conexion.getInstancia();

    }

    @Override

    public boolean agregar(GestionChofer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(GestionChofer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(GestionChofer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GestionChofer> listar() {
        List<GestionChofer> lista = new ArrayList<>();
        try {
            ps = conexion.getConnection().prepareStatement("select * from Chofer");
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new GestionChofer(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getDate(7)));
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
    public List<GestionChofer> listar(GestionChofer obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
