package model;
public class GestionAutobus {
    private int idAutobus;
    private int idChofer;
    private String numeroIdentificacion;
    private int idTipoModelo;
    private int idTipoMarca;
    private int capacidad;
    private String combustible;
    private int añoFabricacion;
    private String placa;
    private int idTipoAccidente;

    public GestionAutobus(int idAutobus, int idChofer, String numeroIdentificacion, int idTipoModelo, int idTipoMarca, int capacidad, String combustible, int añoFabricacion, String placa, int idTipoAccidente) {
        this.idAutobus = idAutobus;
        this.idChofer = idChofer;
        this.numeroIdentificacion = numeroIdentificacion;
        this.idTipoModelo = idTipoModelo;
        this.idTipoMarca = idTipoMarca;
        this.capacidad = capacidad;
        this.combustible = combustible;
        this.añoFabricacion = añoFabricacion;
        this.placa = placa;
        this.idTipoAccidente = idTipoAccidente;
    }

    public int getIdAutobus() {
        return idAutobus;
    }

    public void setIdAutobus(int idAutobus) {
        this.idAutobus = idAutobus;
    }

    public int getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getIdTipoModelo() {
        return idTipoModelo;
    }

    public void setIdTipoModelo(int idTipoModelo) {
        this.idTipoModelo = idTipoModelo;
    }

    public int getIdTipoMarca() {
        return idTipoMarca;
    }

    public void setIdTipoMarca(int idTipoMarca) {
        this.idTipoMarca = idTipoMarca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getCombustible() {
        return combustible;
    }

    public void setCombustible(String combustible) {
        this.combustible = combustible;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getIdTipoAccidente() {
        return idTipoAccidente;
    }

    public void setIdTipoAccidente(int idTipoAccidente) {
        this.idTipoAccidente = idTipoAccidente;
    }
    
    
}
