package model;

public class InfoViaje {

    private String origen;
    private String destino;
    private String fechaSalida;
    private String hora;
    private String placa;
    private String nombre;
    private String usuario;

    public void setDatosViaje(String origen, String destino, String nombre, String placa, String fechaSalida, String hora, String usuario) {
        this.setDestino(destino);
        this.setOrigen(origen);
        this.setNombre(nombre);
        this.setPlaca(placa);
        this.setFechaSalida(fechaSalida);
        this.setHora(hora);
        this.setUsuario(usuario);
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

}
