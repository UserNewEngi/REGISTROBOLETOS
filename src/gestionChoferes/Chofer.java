package gestionChoferes;

public class Chofer {

    private String nombre;
    private String placa;

    public Chofer(String nombre, String placa) {
        this.nombre = nombre;
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPlaca() {
        return placa;
    }
}
