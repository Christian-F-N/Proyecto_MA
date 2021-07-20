/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Interfaz.Principal;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class Controller {

    public boolean login() {
        
        Consultas cons = new Consultas();
       
        String user = Principal.jtxtUser.getText();
        String pass = Principal.jtxtPass.getText();
        Usuario us1 = cons.usuario(user,pass);
      
        if (us1 != null) {
          return true;
            }
   
        return false;
        
    }
}
