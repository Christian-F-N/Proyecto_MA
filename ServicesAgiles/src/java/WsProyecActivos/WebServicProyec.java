package WsProyecActivos;

import Controladores.Activos;
import Controladores.DetallValidacion;
import Controladores.FunActivos;
import Controladores.Funciones;
import Controladores.ProcValidacion;
import Controladores.Usuario;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.swing.JTable;

@WebService(serviceName = "WebServicProyec")
public class WebServicProyec {

    Funciones fun = new Funciones();

    @WebMethod(operationName = "listaUsiarios")
    public List<Usuario> listaUsiarios() {
        List datos = fun.listarUsuarios();
        return datos;
    }

    @WebMethod(operationName = "listarPorUsuario")
    public Usuario listarPorUsuario(@WebParam(name = "ced_usu") String ced_usu) {
        Usuario datos = fun.buscarUsuario(ced_usu);
        return datos;
    }

    @WebMethod(operationName = "listarPorPass")
    public Usuario listarPorPass(@WebParam(name = "pass_usu") String pass_usu) {
        Usuario dato = fun.buscarPassword(pass_usu);
        return dato;
    }

    @WebMethod(operationName = "validar")
    public Usuario validar(@WebParam(name = "nomb") String ced_usu, @WebParam(name = "pass") String pass) {
        Usuario dat = fun.validarUsuario(ced_usu, pass);
        return dat;
    }

    @WebMethod(operationName = "desbloquear")
    public Boolean desbloquear(@WebParam(name = "ced") String ced) {
        Boolean res = fun.desbloquearCuenta(ced);
        return res;
    }

    @WebMethod(operationName = "bloquear")
    public Boolean bloquear(@WebParam(name = "ced") String ced) {
        Boolean resp = fun.bloquearCuenta(ced);
        return resp;
    }

    @WebMethod(operationName = "listarActivos")
    public List<Activos> listarActivos() {
        List obj = fun.listarActivos();
        return obj;
    }

    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "user") String user, @WebParam(name = "password") String password) {
        String resp = fun.login(user, password);
        return resp;
    }

    @WebMethod(operationName = "listarDetalValidacion")
    public List<DetallValidacion> listarDetalValidacion() {
        List dval = fun.detalleValidacion();
        return dval;
    }

    @WebMethod(operationName = "listValidacion")
    public List<ProcValidacion> listValidacion() {
        List val = fun.Validacion();
        return val;
    }

    @WebMethod(operationName = "listarActivosUsuario")
    public List<Activos> listarActivosUsuario(@WebParam(name = "ced_usu") String ced_usu) {
        List act = fun.listarActivosUsuarios(ced_usu);
        return act;
    }

    @WebMethod(operationName = "detallValidaCondic")
    public List<DetallValidacion> detallValidaCondic(@WebParam(name = "condicion") String condicion) {
        List dval = fun.detalleValidacionCondi(condicion);
        return dval;
    }

    @WebMethod(operationName = "validCondicion")
    public List<ProcValidacion> validCondicion(@WebParam(name = "condicion") String condicion) {
        List proval = fun.ValidacionCondi(condicion);
        return proval;
    }

    @WebMethod(operationName = "cero")
    public Boolean cero() {
        fun.cero();
        return true;
    }
    
    @WebMethod(operationName = "estadoCuenta")
    public Boolean estadoCuenta(@WebParam(name = "ced_usu") String ced_usu) {
        Boolean resp=fun.estadoCuenta(ced_usu);
        return resp;
    }
//
//    @WebMethod(operationName = "funyActivos")
//    public List<FunActivos> funyActivos() {
//        List resp=fun.verfunyactivos();
//        return resp;
//    }

  
 
    
}
