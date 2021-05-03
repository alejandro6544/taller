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
public class Venta {

    private String idventa;
    private String descripcionventa;
    private String medidaventa;
    private int cantidad;
    private double valorentrada;
    private String idclientefk;
    private int idConceptofk;
    private String fechaventa;

    public Venta() {
    }

    public Venta(String idventa, String descripcionventa, String medidaventa, int cantidad, double valorentrada, String idclientefk, int idConceptofk, String fechaventa) {
        this.idventa = idventa;
        this.descripcionventa = descripcionventa;
        this.medidaventa = medidaventa;
        this.cantidad = cantidad;
        this.valorentrada = valorentrada;
        this.idclientefk = idclientefk;
        this.idConceptofk = idConceptofk;
        this.fechaventa = fechaventa;
    }

    public Venta(String idventa, String descripcionventa, String medidaventa, int cantidad, double valorentrada, String idclientefk, int idConceptofk) {
        this.idventa = idventa;
        this.descripcionventa = descripcionventa;
        this.medidaventa = medidaventa;
        this.cantidad = cantidad;
        this.valorentrada = valorentrada;
        this.idclientefk = idclientefk;
        this.idConceptofk = idConceptofk;
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

    /**
     * Get the value of idConceptofk
     *
     * @return the value of idConceptofk
     */
    public int getIdConceptofk() {
        return idConceptofk;
    }

    /**
     * Set the value of idConceptofk
     *
     * @param idConceptofk new value of idConceptofk
     */
    public void setIdConceptofk(int idConceptofk) {
        this.idConceptofk = idConceptofk;
    }

    /**
     * Get the value of idclientefk
     *
     * @return the value of idclientefk
     */
    public String getIdclientefk() {
        return idclientefk;
    }

    /**
     * Set the value of idclientefk
     *
     * @param idclientefk new value of idclientefk
     */
    public void setIdclientefk(String idclientefk) {
        this.idclientefk = idclientefk;
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
        return "Venta{" + "idventa=" + idventa + ", descripcionventa=" + descripcionventa + ", medidaventa=" + medidaventa + ", cantidad=" + cantidad + ", valorentrada=" + valorentrada + ", idclientefk=" + idclientefk + ", idConceptofk=" + idConceptofk + ", fechaventa=" + fechaventa + '}';
    }

    public LinkedList<Venta> buscarVentas(String sql) {
        BaseDatos objbd = new BaseDatos();
        LinkedList<Venta> lv = new LinkedList<>();
        ResultSet rs;
        String idv;
        String descripcionv;
        String medidav;
        int ca;
        double val;
        String idcliente;
        int idconcepto;
        String fecha;

        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idv = rs.getString("idventa");
                    descripcionv = rs.getString("descripcionventa");
                    medidav = rs.getString("medidaventa");
                    ca = rs.getInt("cantidad");
                    val = rs.getDouble("valorentrada");
                    idcliente = rs.getString("idclientefk");
                    idconcepto = rs.getInt("idConceptofk");
                    fecha = rs.getTimestamp("fechaventa").toString();
                    lv.add(new Venta(idv, descripcionv, medidav, ca, val, idcliente, idconcepto, fecha));

                }
            } catch (SQLException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lv;
    }

}
