/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.ControllerConceptoVenta;
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
public class ConceptoVentas {
    
    private int idconcepto;
    private String nombreConcepto;

    public ConceptoVentas() {
    }

    public ConceptoVentas(int idconcepto, String nombreConcepto) {
        this.idconcepto = idconcepto;
        this.nombreConcepto = nombreConcepto;
    }

    public ConceptoVentas(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    /**
     * Get the value of nombreConcepto
     *
     * @return the value of nombreConcepto
     */
    public String getNombreConcepto() {
        return nombreConcepto;
    }

    /**
     * Set the value of nombreConcepto
     *
     * @param nombreConcepto new value of nombreConcepto
     */
    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }


    /**
     * Get the value of idconcepto
     *
     * @return the value of idconcepto
     */
    public int getIdconcepto() {
        return idconcepto;
    }

    /**
     * Set the value of idconcepto
     *
     * @param idconcepto new value of idconcepto
     */
    public void setIdconcepto(int idconcepto) {
        this.idconcepto = idconcepto;
    }

    @Override
    public String toString() {
        return "ConceptoVentas{" + "idconcepto=" + idconcepto + ", nombreConcepto=" + nombreConcepto + '}';
    }

    public LinkedList<ConceptoVentas> buscarConceptoVenta(String sql) {
         BaseDatos objbd = new BaseDatos();
        LinkedList<ConceptoVentas> lcv = new LinkedList<>();
        ResultSet rs;
        int idc;
        String nomc;
       
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("idconcepto");
                    nomc = rs.getString("nombreConcepto");
                   
                    lcv.add(new ConceptoVentas(idc, nomc));
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lcv;
    }

    public ConceptoVentas buscarConceptoV(String sql) {
        BaseDatos objbd = new BaseDatos();
        ConceptoVentas cv = null;
        ResultSet rs;
        int idc;
        String nomc;
       
        if (objbd.crearConexion()) {
            try {
                Statement st = objbd.getConexion().createStatement();
                rs = st.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("idconcepto");
                    nomc = rs.getString("nombreConcepto");
                   
                    cv=new ConceptoVentas(idc, nomc);
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return cv;
    }

}
