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
public class Cliente {

    private String idcliente;
    private String nombre1cliente;
    private String nombre2cliente;
    private String apellido1cliente;
    private String apellido2cliente;
    private String correoelectronico;
    private String telefonocliente;

    public Cliente() {
    }

    public Cliente(String idcliente, String nombre1cliente, String nombre2cliente, String apellido1cliente, String apellido2cliente, String correoelectronico, String telefonocliente) {
        this.idcliente = idcliente;
        this.nombre1cliente = nombre1cliente;
        this.nombre2cliente = nombre2cliente;
        this.apellido1cliente = apellido1cliente;
        this.apellido2cliente = apellido2cliente;
        this.correoelectronico = correoelectronico;
        this.telefonocliente = telefonocliente;
    }

    public Cliente(String idcliente, String nombre1cliente, String apellido1cliente) {
        this.idcliente = idcliente;
        this.nombre1cliente = nombre1cliente;
        this.apellido1cliente = apellido1cliente;
    }

    public Cliente(String idcliente, String nombre1cliente, String apellido1cliente, String correoelectronico, String telefonocliente) {
        this.idcliente = idcliente;
        this.nombre1cliente = nombre1cliente;
        this.apellido1cliente = apellido1cliente;
        this.correoelectronico = correoelectronico;
        this.telefonocliente = telefonocliente;
    }

    /**
     * Get the value of telefonocliente
     *
     * @return the value of telefonocliente
     */
    public String getTelefonocliente() {
        return telefonocliente;
    }

    /**
     * Set the value of telefonocliente
     *
     * @param telefonocliente new value of telefonocliente
     */
    public void setTelefonocliente(String telefonocliente) {
        this.telefonocliente = telefonocliente;
    }

    /**
     * Get the value of correoelectronico
     *
     * @return the value of correoelectronico
     */
    public String getCorreoelectronico() {
        return correoelectronico;
    }

    /**
     * Set the value of correoelectronico
     *
     * @param correoelectronico new value of correoelectronico
     */
    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    /**
     * Get the value of apellido2cliente
     *
     * @return the value of apellido2cliente
     */
    public String getApellido2cliente() {
        return apellido2cliente;
    }

    /**
     * Set the value of apellido2cliente
     *
     * @param apellido2cliente new value of apellido2cliente
     */
    public void setApellido2cliente(String apellido2cliente) {
        this.apellido2cliente = apellido2cliente;
    }

    /**
     * Get the value of apellido1cliente
     *
     * @return the value of apellido1cliente
     */
    public String getApellido1cliente() {
        return apellido1cliente;
    }

    /**
     * Set the value of apellido1cliente
     *
     * @param apellido1cliente new value of apellido1cliente
     */
    public void setApellido1cliente(String apellido1cliente) {
        this.apellido1cliente = apellido1cliente;
    }

    /**
     * Get the value of nombre2cliente
     *
     * @return the value of nombre2cliente
     */
    public String getNombre2cliente() {
        return nombre2cliente;
    }

    /**
     * Set the value of nombre2cliente
     *
     * @param nombre2cliente new value of nombre2cliente
     */
    public void setNombre2cliente(String nombre2cliente) {
        this.nombre2cliente = nombre2cliente;
    }

    /**
     * Get the value of nombre1cliente
     *
     * @return the value of nombre1cliente
     */
    public String getNombre1cliente() {
        return nombre1cliente;
    }

    /**
     * Set the value of nombre1cliente
     *
     * @param nombre1cliente new value of nombre1cliente
     */
    public void setNombre1cliente(String nombre1cliente) {
        this.nombre1cliente = nombre1cliente;
    }

    /**
     * Get the value of idcliente
     *
     * @return the value of idcliente
     */
    public String getIdcliente() {
        return idcliente;
    }

    /**
     * Set the value of idcliente
     *
     * @param idcliente new value of idcliente
     */
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "idcliente=" + idcliente + ", nombre1cliente=" + nombre1cliente + ", nombre2cliente=" + nombre2cliente + ", apellido1cliente=" + apellido1cliente + ", apellido2cliente=" + apellido2cliente + ", correoelectronico=" + correoelectronico + ", telefonocliente=" + telefonocliente + '}';
    }

    public Cliente buscarCliente(String sql) {
        BaseDatos objbd = new BaseDatos();
        Cliente c = null;
        ResultSet rs;
        String idp;
        String nomp1;
        String nomp2;
        String ap1;
        String ap2;
        String correo;
        String tel;
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idp = rs.getString("idcliente");
                    nomp1 = rs.getString("nombre1cliente");
                    nomp2 = rs.getString("nombre2cliente");
                    ap1 = rs.getString("apellido1cliente");
                    ap2 = rs.getString("apellido2cliente");
                    correo= rs.getString("correoelectronico");
                    tel = rs.getString("telefonocliente");
                    
                    c=new Cliente(idp, nomp1, nomp2, ap1, ap2, correo, tel);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return c;
    }

}
