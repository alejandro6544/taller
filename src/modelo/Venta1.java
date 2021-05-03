/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Venta1 {

    private String idventa;
    private String descripcionventa;
    private String medidaventa;
    private int cantidad;
    private double valorentrada;
    private String nombrecliente;
    private String concepto;
    private String fechaventa;

    public Venta1() {
    }

    public Venta1(String idventa, String descripcionventa, String medidaventa, int cantidad, double valorentrada, String nombrecliente, String concepto, String fechaventa) {
        this.idventa = idventa;
        this.descripcionventa = descripcionventa;
        this.medidaventa = medidaventa;
        this.cantidad = cantidad;
        this.valorentrada = valorentrada;
        this.nombrecliente = nombrecliente;
        this.concepto = concepto;
        this.fechaventa = fechaventa;
    }

   

    /**
     * Get the value of fechaventa
     *
     * @return the value of fechaventa
     */
    public String getFechaventa() {
        return fechaventa;
    }

    /**
     * Set the value of fechaventa
     *
     * @param fechaventa new value of fechaventa
     */
    public void setFechaventa(String fechaventa) {
        this.fechaventa = fechaventa;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

  

    /**
     * Get the value of valorentrada
     *
     * @return the value of valorentrada
     */
    public double getValorentrada() {
        return valorentrada;
    }

    /**
     * Set the value of valorentrada
     *
     * @param valorentrada new value of valorentrada
     */
    public void setValorentrada(double valorentrada) {
        this.valorentrada = valorentrada;
    }

    /**
     * Get the value of cantidad
     *
     * @return the value of cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Set the value of cantidad
     *
     * @param cantidad new value of cantidad
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Get the value of medidaventa
     *
     * @return the value of medidaventa
     */
    public String getMedidaventa() {
        return medidaventa;
    }

    /**
     * Set the value of medidaventa
     *
     * @param medidaventa new value of medidaventa
     */
    public void setMedidaventa(String medidaventa) {
        this.medidaventa = medidaventa;
    }

    /**
     * Get the value of descripcionventa
     *
     * @return the value of descripcionventa
     */
    public String getDescripcionventa() {
        return descripcionventa;
    }

    /**
     * Set the value of descripcionventa
     *
     * @param descripcionventa new value of descripcionventa
     */
    public void setDescripcionventa(String descripcionventa) {
        this.descripcionventa = descripcionventa;
    }

    /**
     * Get the value of idventa
     *
     * @return the value of idventa
     */
    public String getIdventa() {
        return idventa;
    }

    /**
     * Set the value of idventa
     *
     * @param idventa new value of idventa
     */
    public void setIdventa(String idventa) {
        this.idventa = idventa;
    }

    @Override
    public String toString() {
        return "Venta1{" + "idventa=" + idventa + ", descripcionventa=" + descripcionventa + ", medidaventa=" + medidaventa + ", cantidad=" + cantidad + ", valorentrada=" + valorentrada + ", nombrecliente=" + nombrecliente + ", concepto=" + concepto + ", fechaventa=" + fechaventa + '}';
    }

   
    

}
