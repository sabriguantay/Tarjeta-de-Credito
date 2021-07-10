package challenge.eldar.demo.entities;

import java.util.*;

/**
 * Operacion
 */
public class Operacion {
    
    private int operacionId;
    private Tarjeta tarjeta;
    private Date fecha;
    private double importe;
    private String tipoOperacion;

    public Operacion (Tarjeta tarjeta, Date fecha, double importe, String tipoOperacion){
        this.tarjeta = tarjeta;
        this.fecha = fecha;
        this.importe = importe;
        this.tipoOperacion = tipoOperacion;
    }

    public Operacion() {
    }


    public int getOperacionId() {
        return operacionId;
    }

    public void setOperacionId(int operacionId) {
        this.operacionId = operacionId;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }
    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public String getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    @Override
    public String toString() {
       return "Resúmen: \n -Fecha de operación =" + fecha + "\n -Tarjeta=" + tarjeta + "\n Tipo de Operación=" + tipoOperacion + "\n -Importe=" + importe ;
    }
 
    
}
