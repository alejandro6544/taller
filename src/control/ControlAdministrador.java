/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Administrador;

/**
 *
 * @author David
 */
public class ControlAdministrador {

    public boolean buscarAdmin(String nombre, String pass1) {
        boolean t = false;
        Administrador obj;
        String sql = "select * from administradores where nombreadmin='" + nombre + "';";

        Administrador obja = new Administrador();
        obj = obja.buscarAdmin(sql);
        if (obj != null) {
            if (obj.getPasswadmin().equals(pass1)) {
                t = true;
            }
        }
        return t;

    }

}
