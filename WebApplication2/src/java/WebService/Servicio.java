/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebService;

import Controllers.Controlador;
import Controllers.Usuario;
import java.util.List;
import javax.jws.Oneway;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author HP
 */
@WebService(serviceName = "Servicio")
public class Servicio {

    Controlador cont=new Controlador();

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sum")
    @Oneway
    public int sum(@WebParam(name = "a") int a, @WebParam(name = "b") int b) {
        return cont.suma(a, b);
    }

   


}
