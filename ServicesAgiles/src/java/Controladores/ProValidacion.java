/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class ProValidacion {
    String id_usu, nom_usu,ape_usu,nom_act,est_act;
    int id_pro;

    public ProValidacion() {
    }

    public ProValidacion(String id_usu, String nom_usu, String ape_usu, String nom_act, String est_act, int id_pro) {
        this.id_usu = id_usu;
        this.nom_usu = nom_usu;
        this.ape_usu = ape_usu;
        this.nom_act = nom_act;
        this.est_act = est_act;
        this.id_pro = id_pro;
    }

    public String getId_usu() {
        return id_usu;
    }

    public void setId_usu(String id_usu) {
        this.id_usu = id_usu;
    }

    public String getNom_usu() {
        return nom_usu;
    }

    public void setNom_usu(String nom_usu) {
        this.nom_usu = nom_usu;
    }

    public String getApe_usu() {
        return ape_usu;
    }

    public void setApe_usu(String ape_usu) {
        this.ape_usu = ape_usu;
    }

    public String getNom_act() {
        return nom_act;
    }

    public void setNom_act(String nom_act) {
        this.nom_act = nom_act;
    }

    public String getEst_act() {
        return est_act;
    }

    public void setEst_act(String est_act) {
        this.est_act = est_act;
    }

    public int getId_pro() {
        return id_pro;
    }

    public void setId_pro(int id_pro) {
        this.id_pro = id_pro;
    }
   
}
