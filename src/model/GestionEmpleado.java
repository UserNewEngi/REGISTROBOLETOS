package model;

import java.util.*;

public class GestionEmpleado {

    private int IdEmpleado;
    private String nombre;
    private String apellido;
    private String dni;
    private String direccion;
    private String estadoCivil;
    private String nivelEduca;
    private String telefono;
    private String email;
    private Date fechaIngreso;

    public GestionEmpleado() {
    }

    public GestionEmpleado(int IdEmpleado, String nombre, String apellido, String dni, String direccion, String estadoCivil, String nivelEduca, String telefono, String email, Date fechaIngreso) {
        this.IdEmpleado = IdEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.nivelEduca = nivelEduca;
        this.telefono = telefono;
        this.email = email;
        this.fechaIngreso = fechaIngreso;
    }

    public int getIdEmpleado() {
        return IdEmpleado;
    }

    public void setIdEmpleado(int IdEmpleado) {
        this.IdEmpleado = IdEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getNivelEduca() {
        return nivelEduca;
    }

    public void setNivelEduca(String nivelEduca) {
        this.nivelEduca = nivelEduca;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

}
