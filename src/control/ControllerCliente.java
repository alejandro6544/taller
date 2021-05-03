/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.BaseDatos;
import modelo.Cliente;

/**
 *
 * @author David
 */
public class ControllerCliente {

    public boolean insertCliente(Cliente objc) {
        boolean t = false;
        String sql = "";
        
        
        if (objc.getNombre2cliente()!=null && objc.getApellido2cliente()!=null) {
            sql = "insert into clientes(idcliente, nombre1cliente, nombre2cliente, apellido1cliente, apellido2cliente, correoelectronico, telefonocliente) "
                    + "value('" + objc.getIdcliente() + "', '" + objc.getNombre1cliente() + "', '" + objc.getNombre2cliente() + "',"
                    + " '" + objc.getApellido1cliente() + "', '" + objc.getApellido2cliente() + "', '" + objc.getCorreoelectronico() + "',"
                    + " '" + objc.getTelefonocliente() + "');";
            BaseDatos objbd = new BaseDatos();
            t = objbd.ejecutarSQL(sql);
        } else {
            sql = "insert into clientes(idcliente, nombre1cliente, apellido1cliente, correoelectronico, telefonocliente) "
                    + "value('" + objc.getIdcliente() + "', '" + objc.getNombre1cliente() + "', '" + objc.getApellido1cliente() + "', '" + 
                    objc.getCorreoelectronico() + "', '" + objc.getTelefonocliente() + "');";
            BaseDatos objbd = new BaseDatos();
            t = objbd.ejecutarSQL(sql);
        }
        return t;
    }

    public Cliente consultarCliente(String id) {
        Cliente objc = null;

        String sql = "select * from clientes where idcliente='" + id + "';";
        Cliente objc1 = new Cliente();
        objc = objc1.buscarCliente(sql);
        return objc;
    }

}
