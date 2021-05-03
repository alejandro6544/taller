/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.BaseDatos;
import modelo.Venta;

/**
 *
 * @author David
 */
public class ControllerVenta {

    public boolean insertVenta(Venta objv) {
        
        boolean t=false;
        String sql="insert into ventas(idventa, descripcionventa, medidaventa, cantidad, valorentrada, idclientefk, idConceptofk) "
                + "value('"+objv.getIdventa()+"', '"+objv.getDescripcionventa()+"', '"+objv.getMedidaventa()+"' ,"+objv.getCantidad()+
                ", "+objv.getValorentrada()+", '"+objv.getIdclientefk()+"', "+objv.getIdConceptofk()+");";
        BaseDatos objbd=new BaseDatos();
        t=objbd.ejecutarSQL(sql);
        return t;
    }

    public LinkedList<Venta> consultarVentas(String fecha1, String fecha2) {
        String sql="select * from ventas where fechaventa BETWEEN '"+fecha1+"' AND '"+fecha2+"';";
        Venta objv=new Venta();
        LinkedList<Venta> lv=objv.buscarVentas(sql);
        
        return lv;
    }
    
}
