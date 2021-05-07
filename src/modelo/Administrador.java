/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author David
 */
public class Administrador {
    
    private int idamin;
    private String nombreadmin;
    private String passwadmin;

    public Administrador() {
    }

    public Administrador(int idamin, String nombreadmin, String passwadmin) {
        this.idamin = idamin;
        this.nombreadmin = nombreadmin;
        this.passwadmin = passwadmin;
    }

    public Administrador(String nombreadmin, String passwadmin) {
        this.nombreadmin = nombreadmin;
        this.passwadmin = passwadmin;
    }

    /**
     * Get the value of passwadmin
     *
     * @return the value of passwadmin
     */
    public String getPasswadmin() {
        return passwadmin;
    }

    /**
     * Set the value of passwadmin
     *
     * @param passwadmin new value of passwadmin
     */
    public void setPasswadmin(String passwadmin) {
        this.passwadmin = passwadmin;
    }


    /**
     * Get the value of nombreadmin
     *
     * @return the value of nombreadmin
     */
    public String getNombreadmin() {
        return nombreadmin;
    }

    /**
     * Set the value of nombreadmin
     *
     * @param nombreadmin new value of nombreadmin
     */
    public void setNombreadmin(String nombreadmin) {
        this.nombreadmin = nombreadmin;
    }


    /**
     * Get the value of idamin
     *
     * @return the value of idamin
     */
    public int getIdamin() {
        return idamin;
    }

    /**
     * Set the value of idamin
     *
     * @param idamin new value of idamin
     */
    public void setIdamin(int idamin) {
        this.idamin = idamin;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idamin=" + idamin + ", nombreadmin=" + nombreadmin + ", passwadmin=" + passwadmin + '}';
    }

    public Administrador buscarAdmin(String sql) {
        BaseDatos objbd = new BaseDatos();
        Administrador a = null;
        ResultSet rs;
        int ida;
        String nomadmin;
        String nomc;
       
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    ida=rs.getInt("idamin");
                    nomadmin = rs.getString("nombreadmin");
                    nomc = rs.getString("passwadmin");
                   
                    a=new Administrador(ida, nomadmin, nomc);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return a;
    }

}
