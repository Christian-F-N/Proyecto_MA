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
public class Usuario {

    String ced_usu,
            nom_cue,
            cla_cue,
            fec_cre_cue,
            nom_usu, 
            ape_usu,
            fec_nac_usu, 
            est_cue;

    public Usuario() {
    }

    public Usuario(String ced_usu, String nom_cue, String cla_cue, String fec_cre_cue, String nom_usu, String ape_usu, String fec_nac_usu, String est_cue) {
        this.ced_usu = ced_usu;
        this.nom_cue = nom_cue;
        this.cla_cue = cla_cue;
        this.fec_cre_cue = fec_cre_cue;
        this.nom_usu = nom_usu;
        this.ape_usu = ape_usu;
        this.fec_nac_usu = fec_nac_usu;
        this.est_cue = est_cue;
    }

    public String getCed_usu() {
        return ced_usu;
    }

    public void setCed_usu(String ced_usu) {
        this.ced_usu = ced_usu;
    }

    public String getNom_cue() {
        return nom_cue;
    }

    public void setNom_cue(String nom_cue) {
        this.nom_cue = nom_cue;
    }

    public String getCla_cue() {
        return cla_cue;
    }

    public void setCla_cue(String cla_cue) {
        this.cla_cue = cla_cue;
    }

    public String getFec_cre_cue() {
        return fec_cre_cue;
    }

    public void setFec_cre_cue(String fec_cre_cue) {
        this.fec_cre_cue = fec_cre_cue;
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

    public String getFec_nac_usu() {
        return fec_nac_usu;
    }

    public void setFec_nac_usu(String fec_nac_usu) {
        this.fec_nac_usu = fec_nac_usu;
    }

    public String getEst_cue() {
        return est_cue;
    }

    public void setEst_cue(String est_cue) {
        this.est_cue = est_cue;
    }

    
}
