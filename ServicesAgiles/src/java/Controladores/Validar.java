/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

/**
 *
 * @author HP
 */
public class Validar {

    int id;
    String id_usu,
            id_act_per,
            est_activo,
            fecha;

    public Validar() {
    }

    public Validar(int id, String id_usu, String id_act_per, String est_activo, String fecha) {
        this.id = id;
        this.id_usu = id_usu;
        this.id_act_per = id_act_per;
        this.est_activo = est_activo;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getId_usu() {
        return id_usu;
    }

    public void setId_usu(String id_usu) {
        this.id_usu = id_usu;
    }

    public String getId_act_per() {
        return id_act_per;
    }

    public void setId_act_per(String id_act_per) {
        this.id_act_per = id_act_per;
    }

    public String getEst_activo() {
        return est_activo;
    }

    public void setEst_activo(String est_activo) {
        this.est_activo = est_activo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

}
