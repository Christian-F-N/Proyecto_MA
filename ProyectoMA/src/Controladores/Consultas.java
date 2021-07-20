/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Consultas {

    ResultSet datos, dato;
    Statement st;
    Connection cn;

    public Consultas() {
        ConeccionMYSQL con = new ConeccionMYSQL();
        cn = con.conectar();
    }

    public Usuario usuario(String Id,String clave) {
        String consulta = "Select * from cuentas_usuario where nom_cue ='" + Id + "' and cla_cue='"+ clave +"'";
        Usuario usu = null;
        try {
            st = cn.createStatement();
            dato = st.executeQuery(consulta);
            if (!dato.next()) {

                return null;
            }
            usu = new Usuario();
            usu.setId_cue(dato.getString(1));
            usu.setNom_cue(dato.getString(2));
            usu.setCla_cue(dato.getString(3));
            usu.setFec_cre_cue(dato.getString(4));
            usu.setCed_usu(dato.getString(5));
            usu.setNom_usu(dato.getString(6));
            usu.setApe_usu(dato.getString(7));
            usu.setFec_nac_usu(dato.getString(8));

        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;
    }
   
      
}
