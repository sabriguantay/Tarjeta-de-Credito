package challenge.eldar.demo.entities;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import challenge.eldar.demo.entities.Interface.ICalcularTasa;

/**
 * Tarjeta
 */

public class Tarjeta {

    public enum Marca {
        VISA, NARA, AMEX
    }

    private int tarjetaId;
    private Marca marca;
    private int nroTarjeta;
    private String cardholder;
    private Date fechaVencimiento;

    @JsonIgnore
    private ICalcularTasa tasa;

    public Tarjeta (Marca marca, int nroTarjeta, String cardholder, Date fechaVencimiento){
        this.marca = marca;
        this.nroTarjeta = nroTarjeta;
        this.cardholder = cardholder;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Tarjeta (){

    }

    public int getTarjetaId() {
        return tarjetaId;
    }

    public void setTarjetaId(int tarjetaId) {
        this.tarjetaId = tarjetaId;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getNroTarjeta() {
        return nroTarjeta;
    }

    public void setNroTarjeta(int nroTarjeta) {
        this.nroTarjeta = nroTarjeta;
    }

    public String getCardholder() {
        return cardholder;
    }

    public void setCardholder(String cardholder) {
        this.cardholder = cardholder;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @JsonIgnore
    public ICalcularTasa getTasa() {
        if(this.marca == null){
            this.setMarca(this.getMarca());
        }
        return this.tasa;
    }

    public void setTasa(ICalcularTasa tasa) {
        this.tasa = tasa;
    }

    public double calcularTasa(Operacion operacion){
        return this.tasa.calcularTasa(operacion);
    } 

    @Override
    public String toString() {
        return "Info sobre tarjeta \n - Marca = " + marca + " \n - N° de Tarjeta = " + nroTarjeta+ " \n - CardHolder = " + cardholder + "\n - Fecha Vto=" + fechaVencimiento 
        + "\n nroTarjeta=" + nroTarjeta;
    }

}
