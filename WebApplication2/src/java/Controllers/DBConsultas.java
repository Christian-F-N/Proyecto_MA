/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Conexion.ConexionDB;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author HP
 */
public class DBConsultas {

    ResultSet datos, dato;
    Statement st;
    Connection cn;

    public DBConsultas() {
        ConexionDB con = new ConexionDB();
        cn = con.conectar();
    }
}
