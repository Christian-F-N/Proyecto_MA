/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Interfaz.Menu;
import Interfaz.Principal;
import Interfaz.Validar;

/**
 *
 * @author HP
 */
public class Controller {

    Menu v1 = new Menu();
    Validar v2 = new Validar();
    Principal v0 = new Principal();

    public String log(String user, String pass) {
        boolean est = estadoCuenta(user);
        String resp = login(user, pass);
        if (est == true && resp.equals("Bienvenido")) {
            v1.setVisible(true);
            v0.dispose();
            return resp;
        } else {
            System.out.println(est);
            if (est == false) {
                
                return "Cuenta bloqueadaaki";
            } else {
                System.out.println(resp);
                return resp;
                
            }
        }
    }

    public void reinicio() {
        cero();
    }

    private static String login(java.lang.String user, java.lang.String password) {
        ServiciosWebProyecto.WebServicProyec_Service service = new ServiciosWebProyecto.WebServicProyec_Service();
        ServiciosWebProyecto.WebServicProyec port = service.getWebServicProyecPort();
        return port.login(user, password);
    }

    private static Boolean cero() {
        ServiciosWebProyecto.WebServicProyec_Service service = new ServiciosWebProyecto.WebServicProyec_Service();
        ServiciosWebProyecto.WebServicProyec port = service.getWebServicProyecPort();
        return port.cero();
    }

    private static Boolean estadoCuenta(java.lang.String cedUsu) {
        ServiciosWebProyecto.WebServicProyec_Service service = new ServiciosWebProyecto.WebServicProyec_Service();
        ServiciosWebProyecto.WebServicProyec port = service.getWebServicProyecPort();
        return port.estadoCuenta(cedUsu);
    }

}
