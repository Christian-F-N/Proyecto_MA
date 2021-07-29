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
public class ProcValidacion {

    String  id_pro, 
            nom_pro, 
            fec_hor_pro, 
            est_pro, 
            id_res_pro;

    public ProcValidacion() {
    }

    public ProcValidacion(String id_pro, String nom_pro, String fec_hor_pro, String est_pro, String id_res_pro) {
        this.id_pro = id_pro;
        this.nom_pro = nom_pro;
        this.fec_hor_pro = fec_hor_pro;
        this.est_pro = est_pro;
        this.id_res_pro = id_res_pro;
    }

    public String getId_pro() {
        return id_pro;
    }

    public void setId_pro(String id_pro) {
        this.id_pro = id_pro;
    }

    public String getNom_pro() {
        return nom_pro;
    }

    public void setNom_pro(String nom_pro) {
        this.nom_pro = nom_pro;
    }

    public String getFec_hor_pro() {
        return fec_hor_pro;
    }

    public void setFec_hor_pro(String fec_hor_pro) {
        this.fec_hor_pro = fec_hor_pro;
    }

    public String getEst_pro() {
        return est_pro;
    }

    public void setEst_pro(String est_pro) {
        this.est_pro = est_pro;
    }

    public String getId_res_pro() {
        return id_res_pro;
    }

    public void setId_res_pro(String id_res_pro) {
        this.id_res_pro = id_res_pro;
    }


}
