/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.ConceptoVentas;

/**
 *
 * @author David
 */
public class ControllerConceptoVenta {

    public boolean insertConcepto(ConceptoVentas objcv) {
        String sql="insert into conceptosventas(nombreConcepto) value('"+objcv.getNombreConcepto()+"');";
        BaseDatos objbd=new BaseDatos();
        boolean t=objbd.ejecutarSQL(sql);
        
        return t;
    }

    public LinkedList<ConceptoVentas> buscarConceptosVentas() {
        ConceptoVentas objcv=new ConceptoVentas();
        String sql="select * from conceptosventas;";
        LinkedList<ConceptoVentas> lc=objcv.buscarConceptoVenta(sql);
        
        return lc;
    }

    public ConceptoVentas buscarConceptosVentas(int idconcepto) {
        String sql="select * from conceptosventas where idconcepto="+idconcepto+";";
        ConceptoVentas objcv=new ConceptoVentas();
        ConceptoVentas objcv1= objcv.buscarConceptoV(sql);
        
        return objcv1;
    }
    
}
