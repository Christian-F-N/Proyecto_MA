/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSS;

import Controladores.FunActivos;
import Controladores.Funciones;
import Controladores.ProValidacion;
import Controladores.Validar;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author HP
 */
@WebService(serviceName = "NewWebService")
public class NewWebService {

  Funciones fun = new Funciones();
    @WebMethod(operationName = "login")
    public String login(@WebParam(name = "user") String user, @WebParam(name = "pass") String pass) {
        String resp=fun.login(user, pass);
        return resp;
    }

  
    @WebMethod(operationName = "Bloquear")
    public Boolean Bloquear(@WebParam(name = "user") String user) {
       Boolean resp=fun.bloquearCuenta(user);
        return resp;
    }

   
    @WebMethod(operationName = "desbloquear")
    public Boolean desbloquear(@WebParam(name = "usur") String usur) {
        Boolean resp= fun.desbloquearCuenta(usur);
        return resp;
    }

  
    @WebMethod(operationName = "cero")
    @Oneway
    public void cero() {
        fun.cero();
    }

    @WebMethod(operationName = "verFunyActivos")
    public List<FunActivos> verFunyActivos() {
       List resp=fun.verfunyactivos();
        return resp;
    }

    @WebMethod(operationName = "estadoCuenta")
    public Boolean estadoCuenta(@WebParam(name = "user") String user) {
        Boolean resp=fun.estadoCuenta(user);
        return resp;
    }

  
    @WebMethod(operationName = "Activosparaproceso")
    public List<ProValidacion> Activosparaproceso(@WebParam(name = "usuario") String usuario) {
        List resp=fun.procesovalidad(usuario);
        return resp;
    }

   
    @WebMethod(operationName = "activosnoValidados")
    public List<ProValidacion> activosnoValidados(@WebParam(name = "usuario") String usuario) {
        List resp=fun.todoslosactivos(usuario);
        return resp;
    }

 
    @WebMethod(operationName = "actualizaEstado")
    public Boolean actualizaEstado(@WebParam(name = "procValidar") Validar procValidar) {
        Boolean resp=fun.actualizarEstado(procValidar);
        return resp;
    }

    @WebMethod(operationName = "mostrarActivosAValidar")
    public List<Validar> mostrarActivosAValidar(@WebParam(name = "usu") String usu) {
        List resp=fun.mostraracttivosValidar(usu);
        return resp;
    }

  
    @WebMethod(operationName = "guardarProceso")
    public Boolean guardarProceso(@WebParam(name = "dato") Validar dato) {
        Boolean resp=fun.guardarProceso(dato);
        return resp;
    }
}
