package model;

import java.util.*;

public class GestionChofer {

    private int idChofer;
    private String nombre;
    private int edad;
    private String direccion;
    private String telefono;
    private String licenciaConducir;
    private Date fechaContratacion;

    public GestionChofer(int idChofer, String nombre, int edad, String direccion, String telefono, String licenciaConducir, Date fechaContratacion) {
        this.idChofer = idChofer;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        this.telefono = telefono;
        this.licenciaConducir = licenciaConducir;
        this.fechaContratacion = fechaContratacion;
    }

    public int getIdChofer() {
        return idChofer;
    }

    public void setIdChofer(int idChofer) {
        this.idChofer = idChofer;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public Date getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(Date fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public void finalize() throws Throwable {

    }
}
