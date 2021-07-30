/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Interfaz.Inicio;
import Interfaz.Pvalidar;
import Web.FunActivos;
import Web.ProValidacion;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author HP
 */
public class Controller {

    Pvalidar menu = new Pvalidar();
    Inicio inicio = new Inicio();

    public String log(String user, String pass) {
        boolean est = estadoCuenta(user);
        String resp = login(user, pass);
        if (est == true && resp.equals("Bienvenido")) {
            menu.setVisible(true);
            inicio.dispose();
            cargarTablaFuncYAvtivos();
            return resp;
        } else {
            System.out.println(est);
            if (est == false) {

                return "Cuenta bloqueadaaki";
            } else {
                return resp;

            }
        }
    }

    public void cargarTablaValidar() {

        List<ProValidacion> funact;
        try {
            funact = activosparaproceso("1803");
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            Pvalidar.tablajp.setModel(modelo);
            modelo.addColumn("Id");
            modelo.addColumn("Id Usu");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Nom Activo");
            modelo.addColumn("Estado");

            int tamaño = funact.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{funact.get(i).getIdPro(),
                    funact.get(i).getIdUsu(),
                    funact.get(i).getNomUsu(),
                    funact.get(i).getApeUsu(),
                    funact.get(i).getNomAct(),
                    funact.get(i).getEstAct()});

                i++;
            }
            TableColumnModel modeloColumna = Pvalidar.tablajp.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(315);
            modeloColumna.getColumn(1).setPreferredWidth(315);
            modeloColumna.getColumn(2).setPreferredWidth(315);
            modeloColumna.getColumn(3).setPreferredWidth(315);
            modeloColumna.getColumn(4).setPreferredWidth(315);
            modeloColumna.getColumn(5).setPreferredWidth(315);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Funcionarios y activos ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarTablaFuncYAvtivos() {

        List<FunActivos> funact;
        try {

            funact = verFunyActivos();
            //Datos de Tabla
            DefaultTableModel modelo = new DefaultTableModel();
            Pvalidar.jTFunActijp.setModel(modelo);
            //   Validar.jTvalidar.setModel(modelo);
            modelo.addColumn("Id");
            modelo.addColumn("Id Usu");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Total activos");

            int tamaño = funact.size();
            int i = 0;

            while (i < tamaño) {
                modelo.addRow(new Object[]{funact.get(i).getID(),
                    funact.get(i).getIDUSU(),
                    funact.get(i).getNOMUSU(),
                    funact.get(i).getAPEUSU(),
                    funact.get(i).getCANACT()});

                i++;
            }
            TableColumnModel modeloColumna = Pvalidar.jTFunActijp.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(315);
            modeloColumna.getColumn(1).setPreferredWidth(315);
            modeloColumna.getColumn(2).setPreferredWidth(315);
            modeloColumna.getColumn(3).setPreferredWidth(315);
            modeloColumna.getColumn(4).setPreferredWidth(315);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Funcionarios y activos ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public void reinicio() {
        cero();
    }

    private static void cero() {
        Web.NewWebService_Service service = new Web.NewWebService_Service();
        Web.NewWebService port = service.getNewWebServicePort();
        port.cero();
    }

    private static Boolean estadoCuenta(java.lang.String user) {
        Web.NewWebService_Service service = new Web.NewWebService_Service();
        Web.NewWebService port = service.getNewWebServicePort();
        return port.estadoCuenta(user);
    }

    private static String login(java.lang.String user, java.lang.String pass) {
        Web.NewWebService_Service service = new Web.NewWebService_Service();
        Web.NewWebService port = service.getNewWebServicePort();
        return port.login(user, pass);
    }

    private static java.util.List<Web.FunActivos> verFunyActivos() {
        Web.NewWebService_Service service = new Web.NewWebService_Service();
        Web.NewWebService port = service.getNewWebServicePort();
        return port.verFunyActivos();
    }

    private static java.util.List<Web.ProValidacion> activosparaproceso(java.lang.String usuario) {
        Web.NewWebService_Service service = new Web.NewWebService_Service();
        Web.NewWebService port = service.getNewWebServicePort();
        return port.activosparaproceso(usuario);
    }

}
