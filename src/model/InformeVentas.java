package model;

import java.util.*;

public class InformeVentas {

    private int IdReporte;
    private Date fechaVenta;
    private String tipoOperacion;
    private float monto;
    private String producto;
    private float precio;
    private float importe;

    public InformeVentas(int IdReporte, Date fechaVenta, String tipoOperacion, float monto, String producto, float precio, float importe) {
        this.IdReporte = IdReporte;
        this.fechaVenta = fechaVenta;
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
        this.producto = producto;
        this.precio = precio;
        this.importe = importe;
    }

    public int getIdReporte() {
        return IdReporte;
    }

    public void setIdReporte(int IdReporte) {
        this.IdReporte = IdReporte;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    
   
}
