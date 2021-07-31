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
public class Activos {

    String id_act,
            nom_act,
            est_act,
            cod_bar_act,
            des_act,
            ced_usu_per;

    public Activos() {
    }

    public Activos(String id_act, String nom_act, String est_act, String cod_bar_act, String des_act, String ced_usu_per) {
        this.id_act = id_act;
        this.nom_act = nom_act;
        this.est_act = est_act;
        this.cod_bar_act = cod_bar_act;
        this.des_act = des_act;
        this.ced_usu_per = ced_usu_per;
    }

    public String getId_act() {
        return id_act;
    }

    public void setId_act(String id_act) {
        this.id_act = id_act;
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

    public String getCod_bar_act() {
        return cod_bar_act;
    }

    public void setCod_bar_act(String cod_bar_act) {
        this.cod_bar_act = cod_bar_act;
    }

    public String getDes_act() {
        return des_act;
    }

    public void setDes_act(String des_act) {
        this.des_act = des_act;
    }

    public String getCed_usu_per() {
        return ced_usu_per;
    }

    public void setCed_usu_per(String ced_usu_per) {
        this.ced_usu_per = ced_usu_per;
    }

}
