/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author David
 */
public class ConceptoTaller {
    
    private int idconceptostaller;
    private String nombreconceptotaller;

    public ConceptoTaller() {
    }

    public ConceptoTaller(int idconceptostaller, String nombreconceptotaller) {
        this.idconceptostaller = idconceptostaller;
        this.nombreconceptotaller = nombreconceptotaller;
    }

    public ConceptoTaller(String nombreConcepto) {
        this.nombreconceptotaller = nombreConcepto;
    }

    /**
     * Get the value of nombreconceptotaller
     *
     * @return the value of nombreconceptotaller
     */
    public String getNombreConcepto() {
        return nombreconceptotaller;
    }

    /**
     * Set the value of nombreconceptotaller
     *
     * @param nombreConcepto new value of nombreconceptotaller
     */
    public void setNombreConcepto(String nombreConcepto) {
        this.nombreconceptotaller = nombreConcepto;
    }


    /**
     * Get the value of idconceptostaller
     *
     * @return the value of idconceptostaller
     */
    public int getIdconcepto() {
        return idconceptostaller;
    }

    /**
     * Set the value of idconceptostaller
     *
     * @param idconcepto new value of idconceptostaller
     */
    public void setIdconcepto(int idconcepto) {
        this.idconceptostaller = idconcepto;
    }

    @Override
    public String toString() {
        return "ConceptoVentas{" + "idconcepto=" + idconceptostaller + ", nombreConcepto=" + nombreconceptotaller + '}';
    }

}
