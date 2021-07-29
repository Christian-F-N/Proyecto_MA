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
public class DetallValidacion {

        String id_det;
        int can_act;
        String est_val,
        ced_usu_val,
        id_pro_per;

    public DetallValidacion() {
    }

    public DetallValidacion(String id_det, String est_val, String ced_usu_val, String d_pro_per, int can_act) {
        this.id_det = id_det;
        this.est_val = est_val;
        this.ced_usu_val = ced_usu_val;
        this.id_pro_per = d_pro_per;
        this.can_act = can_act;
    }

    public String getId_det() {
        return id_det;
    }

    public void setId_det(String id_det) {
        this.id_det = id_det;
    }

    public String getEst_val() {
        return est_val;
    }

    public void setEst_val(String est_val) {
        this.est_val = est_val;
    }

    public String getCed_usu_val() {
        return ced_usu_val;
    }

    public void setCed_usu_val(String ced_usu_val) {
        this.ced_usu_val = ced_usu_val;
    }

    public String getId_pro_per() {
        return id_pro_per;
    }

    public void setId_pro_per(String d_pro_per) {
        this.id_pro_per = d_pro_per;
    }

    public int getCan_act() {
        return can_act;
    }

    public void setCan_act(int can_act) {
        this.can_act = can_act;
    }

}
