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

        if (objc.getNombre2cliente() != null && objc.getApellido2cliente() != null) {
            sql = "insert into clientes(idcliente, nombre1cliente, nombre2cliente, apellido1cliente, apellido2cliente, correoelectronico, telefonocliente) "
                    + "value('" + objc.getIdcliente() + "', '" + objc.getNombre1cliente() + "', '" + objc.getNombre2cliente() + "',"
                    + " '" + objc.getApellido1cliente() + "', '" + objc.getApellido2cliente() + "', '" + objc.getCorreoelectronico() + "',"
                    + " '" + objc.getTelefonocliente() + "');";
            BaseDatos objbd = new BaseDatos();
            t = objbd.ejecutarSQL(sql);
        } else {
            if (objc.getCorreoelectronico() != null && objc.getTelefonocliente() != null) {
                sql = "insert into clientes(idcliente, nombre1cliente, apellido1cliente, correoelectronico, telefonocliente) "
                        + "value('" + objc.getIdcliente() + "', '" + objc.getNombre1cliente() + "', '" + objc.getApellido1cliente() + "', '"
                        + objc.getCorreoelectronico() + "', '" + objc.getTelefonocliente() + "');";
                BaseDatos objbd = new BaseDatos();
                t = objbd.ejecutarSQL(sql);
            } else {
                sql = "insert into clientes(idcliente, nombre1cliente, apellido1cliente) "
                        + "value('" + objc.getIdcliente() + "', '" + objc.getNombre1cliente() + "', '" + objc.getApellido1cliente() + "');";
                BaseDatos objbd = new BaseDatos();
                t = objbd.ejecutarSQL(sql);
            }
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

    public boolean modificarCliente(Cliente objc) {
        boolean t = false;
        if (objc.getNombre2cliente() != null && objc.getApellido2cliente() != null) {
            String sql = "UPDATE clientes SET nombre1cliente = '" + objc.getNombre1cliente() + "', nombre2cliente= '" + objc.getNombre2cliente() + "', "
                    + "apellido1cliente=' " + objc.getApellido1cliente() + "', apellido2cliente='" + objc.getApellido2cliente() + "', "
                    + "correoelectronico='" + objc.getCorreoelectronico() + "', telefonocliente='" + objc.getTelefonocliente() + "' "
                    + "WHERE idcliente ='" + objc.getIdcliente() + "';";
            BaseDatos objb = new BaseDatos();
            t = objb.ejecutarSQL(sql);
        } else {
            if (objc.getCorreoelectronico() != null && objc.getTelefonocliente() != null) {
                String sql = "UPDATE clientes SET nombre1cliente = '" + objc.getNombre1cliente() + "', "
                        + "apellido1cliente=' " + objc.getApellido1cliente() + "', "
                        + "correoelectronico='" + objc.getCorreoelectronico() + "', telefonocliente='" + objc.getTelefonocliente() + "' "
                        + "WHERE idcliente ='" + objc.getIdcliente() + "';";
                BaseDatos objb = new BaseDatos();
                t = objb.ejecutarSQL(sql);
            }else{
                 String sql = "UPDATE clientes SET nombre1cliente = '" + objc.getNombre1cliente() + "', "
                        + "apellido1cliente=' " + objc.getApellido1cliente() + "' "
                        + "WHERE idcliente ='" + objc.getIdcliente() + "';";
                BaseDatos objb = new BaseDatos();
                t = objb.ejecutarSQL(sql);
            }
        }
        return t;
    }

}
