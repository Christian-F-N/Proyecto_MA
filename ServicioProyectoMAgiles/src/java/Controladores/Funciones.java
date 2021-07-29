/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author HP
 */
public class Funciones implements Controlador {

    int cont = 0;
    ResultSet datos, dato;
    Statement st;
    Connection cn;

    public Funciones() {
        ConeccionMYSQL con = new ConeccionMYSQL();
        cn = con.conectar();
    }

    @Override
    public List<Usuario> listarUsuarios() {
        ArrayList<Usuario> usuarios = new ArrayList();
        String consulta = "Select * from cuentas_usuario";
        Usuario usu;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(consulta);
            while (datos.next()) {
                usu = new Usuario();
                usu.setCed_usu(dato.getString(1));
                usu.setNom_cue(dato.getString(2));
                usu.setCla_cue(dato.getString(3));
                usu.setFec_cre_cue(dato.getString(4));
                usu.setNom_usu(dato.getString(5));
                usu.setApe_usu(dato.getString(6));
                usu.setFec_nac_usu(dato.getString(7));
                usu.setEst_cue(dato.getString(8));
                usuarios.add(usu);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usuarios;

    }

    @Override
    public Usuario buscarUsuario(String ced_usu) {
        String consulta = "Select * from cuentas_usuario where ced_usu='" + ced_usu + "'";
        Usuario usu = null;
        try {
            st = cn.createStatement();
            dato = st.executeQuery(consulta);
            if (!dato.next()) {
                return null;
            }
            usu = new Usuario();
            usu.setCed_usu(dato.getString(1));
            usu.setNom_cue(dato.getString(2));
            usu.setCla_cue(dato.getString(3));
            usu.setFec_cre_cue(dato.getString(4));
            usu.setNom_usu(dato.getString(5));
            usu.setApe_usu(dato.getString(6));
            usu.setFec_nac_usu(dato.getString(7));
            usu.setEst_cue(dato.getString(8));
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;
    }

    @Override
    public Usuario buscarPassword(String cla_cue) {
        String consulta = "Select * from cuentas_usuario where cla_cue='" + cla_cue + "'";
        Usuario usu = null;
        try {
            st = cn.createStatement();
            dato = st.executeQuery(consulta);
            if (!dato.next()) {
                return null;
            }
            usu = new Usuario();
            usu.setCed_usu(dato.getString(1));
            usu.setNom_cue(dato.getString(2));
            usu.setCla_cue(dato.getString(3));
            usu.setFec_cre_cue(dato.getString(4));
            usu.setNom_usu(dato.getString(5));
            usu.setApe_usu(dato.getString(6));
            usu.setFec_nac_usu(dato.getString(7));
            usu.setEst_cue(dato.getString(8));
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;
    }

    @Override
    public List<Activos> listarActivos() {
        ArrayList<Activos> activos = new ArrayList();
        String consulta = "Select * from activos";
        Activos act;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(consulta);
            while (datos.next()) {
                act = new Activos();
                act.setId_act(datos.getString(1));
                act.setNom_act(datos.getString(2));
                act.setEst_act(datos.getString(3));
                act.setCod_bar_act(datos.getString(4));
                act.setDes_act(datos.getString(5));
                act.setCed_usu_per(datos.getString(6));

                activos.add(act);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return activos;
    }

    @Override
    public List<Activos> listarActivosUsuarios(String ced_usu) {
        ArrayList<Activos> activos = new ArrayList();
        String consulta = "Select * from activos where ced_usu_per='" + ced_usu + "'";
        Activos act;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(consulta);
            while (datos.next()) {
                act = new Activos();
                act.setId_act(datos.getString(1));
                act.setNom_act(datos.getString(2));
                act.setEst_act(datos.getString(3));
                act.setCod_bar_act(datos.getString(4));
                act.setDes_act(datos.getString(5));
                act.setCed_usu_per(datos.getString(6));

                activos.add(act);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return activos;

    }

    @Override
    public List<DetallValidacion> detalleValidacion() {
        ArrayList<DetallValidacion> validaciones = new ArrayList();
        String consulta = "Select * from validacion_detalle";
        DetallValidacion val;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(consulta);
            while (datos.next()) {
                val = new DetallValidacion();
                val.setId_det(datos.getString(1));
                val.setCan_act(datos.getInt(2));
                val.setEst_val(datos.getString(3));
                val.setCed_usu_val(datos.getString(4));
                val.setId_pro_per(datos.getString(5));

                validaciones.add(val);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return validaciones;
    }

    @Override
    public List<ProcValidacion> Validacion() {
        ArrayList<ProcValidacion> provalidos = new ArrayList();
        String consulta = "Select * from proceso_validacion";
        ProcValidacion val;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(consulta);
            while (datos.next()) {
                val = new ProcValidacion();
                val.setId_pro(datos.getString(1));
                val.setNom_pro(datos.getString(2));
                val.setFec_hor_pro(datos.getString(3));
                val.setEst_pro(datos.getString(4));
                val.setId_res_pro(datos.getString(5));

                provalidos.add(val);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return provalidos;
    }

    @Override
    public List<DetallValidacion> detalleValidacionCondi(String parametro) {
        ArrayList<DetallValidacion> validaciones = new ArrayList();
        String consulta = "Select * from validacion_detalle where '" + parametro + "'";
        DetallValidacion val;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(consulta);
            while (datos.next()) {
                val = new DetallValidacion();
                val.setId_det(datos.getString(1));
                val.setCan_act(datos.getInt(2));
                val.setEst_val(datos.getString(3));
                val.setCed_usu_val(datos.getString(4));
                val.setId_pro_per(datos.getString(5));

                validaciones.add(val);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return validaciones;
    }

    @Override
    public List<ProcValidacion> ValidacionCondi(String parametro) {
        ArrayList<ProcValidacion> provalidos = new ArrayList();
        String consulta = "Select * from proceso_validacion where '" + parametro + "'";
        ProcValidacion val;
        try {
            st = cn.createStatement();
            datos = st.executeQuery(consulta);
            while (datos.next()) {
                val = new ProcValidacion();
                val.setId_pro(datos.getString(1));
                val.setNom_pro(datos.getString(2));
                val.setFec_hor_pro(datos.getString(3));
                val.setEst_pro(datos.getString(4));
                val.setId_res_pro(datos.getString(5));

                provalidos.add(val);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return provalidos;
    }

    @Override
    public Usuario validarUsuario(String ced_usu, String cla_cue) {
        String consulta = "Select * from cuentas_usuario where ced_usu='" + ced_usu + "'and cla_cue='" + cla_cue + "'";
        Usuario usu = null;
        try {
            st = cn.createStatement();
            dato = st.executeQuery(consulta);
            if (!dato.next()) {
                return null;
            }
            usu = new Usuario();
            usu.setCed_usu(dato.getString(1));
            usu.setNom_cue(dato.getString(2));
            usu.setCla_cue(dato.getString(3));
            usu.setFec_cre_cue(dato.getString(4));
            usu.setNom_usu(dato.getString(5));
            usu.setApe_usu(dato.getString(6));
            usu.setFec_nac_usu(dato.getString(7));
            usu.setEst_cue(dato.getString(8));

        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return usu;

    }

    @Override
    public Boolean bloquearCuenta(String ced_usu) {
        PreparedStatement pst;
        String sentencia = "Update cuentas_usuario set est_cue=? Where ced_usu=?";

        try {
            pst = cn.prepareStatement(sentencia);
            pst.setString(1, "B");
            pst.setString(2, ced_usu);
            int res = pst.executeUpdate();
            if (res > 0) {

                return true;

            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public Boolean desbloquearCuenta(String ced_usu) {
        PreparedStatement pst;
        String sentencia = "Update cuentas_usuario set est_cue=? Where ced_usu=?";
        try {
            pst = cn.prepareStatement(sentencia);
            pst.setString(1, "A");
            pst.setString(2, ced_usu);
            int res = pst.executeUpdate();
            if (res > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public String login(String user, String password) {

        if ((user.length() != 0) && (password.length() != 0)) {
            Usuario l = validarUsuario(user, password);
            Usuario u = buscarUsuario(user);
            Usuario p = buscarPassword(password);
            Boolean est = estadoCuenta(user);
            if (u != null) {
                if (p != null) {
                    if (l != null) {
                        if (est == true) {
                            return "Bienvenido";
                        } else {
                            return "Su cuenta esta bloqueada";
                        }
                    } else {
                        if (cont == 0) {
                            cont++;
                            return "Credenciales incorrectas.\n Su cuenta se bloqueara despues de 3 intentos. \n Intento " + cont + "/3.";
                        } else {
                            cont++;
                            if (cont == 3) {
                                int a = cont;
//                                if (a == 3) {
//                                    bloquearCuenta(user);
//                                }
                                cont = 0;
                                return "Cuenta bloqueada.\n Intento " + a + "/3.";
                            } else {
                                return "Credenciales incorrectas.\n Intento" + cont + "/3.\"";
                            }
                        }
                    }
                } else {
                    cont++;
                    if (cont == 3) {
                        int a = cont;
                        cont = 0;
//                        if (a == 3) {
//                            bloquearCuenta(user);
//                        }
                        return "Cuenta bloqueada.\n Intento " + a + "/3.";
                    } else {
                        if (cont == 0) {
                            return "Contraseña incorrecta\n Su cuenta se bloqueara despues de 3 intentos.\n Intento " + cont + "/3.";
                        } else {
                            return "Contraseña incorrecta.\n Intento " + cont + "/3.";
                        }
                    }
                }
            } else {
                cont++;
                if (cont == 3) {
                    int a = cont;
                    cont = 0;
//                    if (a == 3) {
//                        bloquearCuenta(user);
//                    }
                    return "Cuenta bloqueada.\n Intento " + a + "/3.";
                } else {
                    if (cont == 0) {
                        return "Usuario incorrecto.\n Su cuenta se bloqueara despues de 3 intentos.\n Intento " + cont + "/3.";
                    } else {
                        return "Usuario incorrecto.\n Intento " + cont + "/3.";
                    }
                }
            }
        } else {
            return "Ingrese las Credenciales";
        }

    }

    @Override
    public void cero() {
        cont = 0;
    }

    @Override
    public Boolean estadoCuenta(String ced_esu) {
        Usuario usu = buscarUsuario(ced_esu);
        if (usu.getEst_cue() == "A") {
            return true;
        } else {
            return false;
        }

    }

  
    @Override
    public List<FunActivos> verfunyactivos() {
        ArrayList<FunActivos> funact = new ArrayList();
        String consulta = "SELECT u.ced_usu ,u.nom_usu, u.ape_usu, count(a.id_act) FROM cuentas_usuario u, activos a WHERE u.ced_usu = a.ced_usu_per GROUP BY(a.ced_usu_per)";
        FunActivos val = null;
        
        try {
            st = cn.createStatement();
            datos = st.executeQuery(consulta);
            while (datos.next()) {
                val = new FunActivos();
          
                val.setNOM_USU(datos.getString(2));
                val.setAPE_USU(datos.getString(3));
                val.setCAN_ACT(datos.getInt(4));
                val.setID_USU(datos.getString(1));
                funact.add(val);
                

            }
        } catch (SQLException ex) {
            Logger.getLogger(ConeccionMYSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return funact;
    }

    
}

               