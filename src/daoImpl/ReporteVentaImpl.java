package daoImpl;

import connection.Conexion;
import dao.IDaoGenerico;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.InformeVentas;

public class ReporteVentaImpl implements IDaoGenerico<InformeVentas> {

    private final Conexion conexion;
    private PreparedStatement ps;
    private ResultSet rs;

    public ReporteVentaImpl (){
    conexion = Conexion.getInstancia();
    
    }
    @Override
    public boolean agregar(InformeVentas obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizar(InformeVentas obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminar(InformeVentas obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<InformeVentas> listar() {
        
        List<InformeVentas> lista = new ArrayList<>();
        try {
            ps = conexion.getConnection().prepareStatement("select * from ReportesVentas");
            rs = ps.executeQuery();
            while (rs.next()) {
                lista.add(new InformeVentas(rs.getInt(1), rs.getDate(2), rs.getString(3), rs.getFloat(4), rs.getString(5), rs.getFloat(6), rs.getFloat(7)));
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
    public List<InformeVentas> listar(InformeVentas obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
