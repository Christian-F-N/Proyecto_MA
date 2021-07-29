/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.List;
import javax.swing.JTable;

/**
 *
 * @author HP
 */
public interface Controlador {

    public List<Usuario> listarUsuarios();

    public String login(String user, String password);

    public Usuario buscarUsuario(String ced_usu);

    public Usuario buscarPassword(String cla_cue);

    public List<Activos> listarActivos();

    public List<Activos> listarActivosUsuarios(String ced_usu);

    public List<DetallValidacion> detalleValidacion();

    public List<ProcValidacion> Validacion();

    public List<DetallValidacion> detalleValidacionCondi(String parametro);

    public List<ProcValidacion> ValidacionCondi(String parametro);

    public Usuario validarUsuario(String ced_usu, String cla_cue);

    public Boolean bloquearCuenta(String ced_usu);

    public Boolean desbloquearCuenta(String ced_usu);

    public void cero();

    public Boolean estadoCuenta(String ced_esu);
    
 
    
  public List<FunActivos> verfunyactivos();
}
