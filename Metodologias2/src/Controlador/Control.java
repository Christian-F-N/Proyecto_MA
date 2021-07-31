/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Interfaz.Inicio;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author HP
 */
public class Control {

    public void activarpanel(int a) {
        switch (a) {
            case 1:
                Inicio.jpFunActivos.setVisible(false);
                Inicio.jpIngreso.setVisible(true);
                Inicio.jpActivos.setVisible(false);
                break;
            case 2:
                Inicio.jpFunActivos.setVisible(true);
                Inicio.jpIngreso.setVisible(false);
                Inicio.jpActivos.setVisible(false);
                break;
            case 3:
                Inicio.jpFunActivos.setVisible(false);
                Inicio.jpIngreso.setVisible(false);
                Inicio.jpActivos.setVisible(true);
                Inicio.jtNombre.setEnabled(true);
                Inicio.jtNombre.setVisible(true);
                break;
            default:
                break;

        }

    }

    public String log() {
        String user = Inicio.jtUser.getText();
        String pass = Inicio.jtPass.getText();
        boolean est = estadoCuenta(user);
        String resp = login(user, pass);
        if (est == true && resp.equals("Bienvenido")) {
            activarpanel(2);
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
            Inicio.jtValidar.setModel(modelo);
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
            TableColumnModel modeloColumna = Inicio.jtValidar.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(375);
            modeloColumna.getColumn(1).setPreferredWidth(375);
            modeloColumna.getColumn(2).setPreferredWidth(375);
            modeloColumna.getColumn(3).setPreferredWidth(375);
            modeloColumna.getColumn(4).setPreferredWidth(375);
            modeloColumna.getColumn(5).setPreferredWidth(375);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    null,
                    "Error: " + e.getMessage(),
                    "Excepcion al cargar cargarDatosTabla.Funcionarios y activos ",
                    JOptionPane.ERROR_MESSAGE);
        }
    }


    public void cargarProceso(Object[] user) {
        List<ProValidacion> funact;
        try {
            DefaultTableModel modelo = new DefaultTableModel();
            Inicio.jtValidar.setModel(modelo);
            modelo.addColumn("Id");
            modelo.addColumn("Id Usu");
            modelo.addColumn("Nombre");
            modelo.addColumn("Apellido");
            modelo.addColumn("Activo");
            modelo.addColumn("Estado");
            for (int a = 0; a < user.length; a++) {
                int i = 0;
                funact = activosparaproceso(user[a].toString());
                while (i < 1) {
                    modelo.addRow(new Object[]{funact.get(i).getIdPro(),
                        funact.get(i).getIdUsu(),
                        funact.get(i).getNomUsu(),
                        funact.get(i).getApeUsu(),
                        funact.get(i).getNomAct(),
                        funact.get(i).getEstAct()});
                       
                i++;
                }
                 }
          
            TableColumnModel modeloColumna = Inicio.jtValidar.getColumnModel();
            modeloColumna.getColumn(0).setPreferredWidth(50);
            modeloColumna.getColumn(1).setPreferredWidth(40);
            modeloColumna.getColumn(2).setPreferredWidth(50);
            modeloColumna.getColumn(3).setPreferredWidth(40);
            modeloColumna.getColumn(4).setPreferredWidth(40);
            modeloColumna.getColumn(5).setPreferredWidth(50);
 
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
            Inicio.jtFunActivos.setModel(modelo);
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
            TableColumnModel modeloColumna = Inicio.jtFunActivos.getColumnModel();
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
        Controlador.NewWebService_Service service = new Controlador.NewWebService_Service();
        Controlador.NewWebService port = service.getNewWebServicePort();
        port.cero();
    }

    private static Boolean estadoCuenta(java.lang.String user) {
        Controlador.NewWebService_Service service = new Controlador.NewWebService_Service();
        Controlador.NewWebService port = service.getNewWebServicePort();
        return port.estadoCuenta(user);
    }

    private static String login(java.lang.String user, java.lang.String pass) {
        Controlador.NewWebService_Service service = new Controlador.NewWebService_Service();
        Controlador.NewWebService port = service.getNewWebServicePort();
        return port.login(user, pass);
    }

    private static java.util.List<Controlador.FunActivos> verFunyActivos() {
        Controlador.NewWebService_Service service = new Controlador.NewWebService_Service();
        Controlador.NewWebService port = service.getNewWebServicePort();
        return port.verFunyActivos();
    }

    private static java.util.List<Controlador.ProValidacion> activosparaproceso(java.lang.String usuario) {
        Controlador.NewWebService_Service service = new Controlador.NewWebService_Service();
        Controlador.NewWebService port = service.getNewWebServicePort();
        return port.activosparaproceso(usuario);
    }



 


   

  

 

}
